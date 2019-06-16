package MapleView;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.*;

public class EnemyButton extends JButton implements Runnable {

	private Player p;
	private Thread t = new Thread(this); //쓰레드
	private Random r = new Random(); //랜덤
	private SkillEffectButton seb; //스킬이펙트
	private BuffEffectButton beb; //버프이펙트
	private JButton bi; // 버프아이콘
	private int skill2CoolTime; // 스킬2 쿨타임변수입니다 0이면 사용가능합니다

	// 체크뷰 생성자
	public EnemyButton(Player p) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(1))));
	}
	
	// 배틀뷰 생성자
	public EnemyButton(Player p, SkillEffectButton seb, BuffEffectButton beb, JButton bi) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.p = p;
		this.setSize(353,353);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(3))));
		this.seb = seb;
		this.beb = beb;
		this.bi = bi;
		this.bi.setBorderPainted(false);
		this.bi.setContentAreaFilled(false);
		this.bi.setFocusPainted(false);
		this.skill2CoolTime = 0;
		t.start();
	}
	@Override
	public void run() 
	{
		while (true) 
		{
			//적 공격시작시 쓰레드슬립을 먼저합니다! (안그러면 공격당하고 게임이 시작해요)
			try {
				Thread.sleep(3000); //우선은 3초당 1번 공격하는걸로 해놨습니다!
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//버프 실행
			if (p.getBuffTime() < 0) //버프가 안써져있다면 버프를 사용합니다! 지금 적은 2번공격하면 버프가 풀리는 상태입니다.
			{
				p.buffskill();
				this.bi.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
				bi.setVisible(true);
				beb.start(p.getW().getSkillEffect().get(5));
				
				try {
					Thread.sleep(1000); //버프 사용시 추가로 1초 지연합니다
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//동작 실행  (물약먹기 or 공격하기)
			if (p.getHp() < p.getM_hp() / 3) p.drinkHPpotion(); //MP가 30%미만이면 HP물약을 마십니다!
			else if (p.getMp() < p.getM_mp() / 3) p.drinkMPpotion(); // MP가 30%미만이면 MP물약을 마십니다!
			else 
			{
				if(this.skill2CoolTime>0)
				{
					p.skillAttack(0); //스킬1공격합니다
					seb.start(p.getW().getSkillEffect().get(3)); //스킬1 이펙트를 날립니다
				}
				else
				{
					p.skillAttack(1); //스킬2공격합니다
					this.skill2CoolTime = 2; // 쿨타임 설정 실제 쿨타임은 절대적인 시간으로 (쓰레드슬립시간 * 쿨타임설정숫자) 만큼 쿨타임이 걸립니다
					seb.start(p.getW().getSkillEffect().get(4)); //스킬2 이펙트를 날립니다
					this.skill2CoolTime++; //맨 밑에서 스킬쿨타임을 줄이므로 여기서 하나 더 늘려줍니다
				}

			}
			//버프 해제 
			if(p.getBuffTime() == 0) 
			{
				p.buffRelease();
				bi.setVisible(false);
				bi.setIcon(null);
			}
			this.skill2CoolTime--; //쿨타임을 감소합니다
		}
		
	}
	public void stop() {this.t.stop();}
}
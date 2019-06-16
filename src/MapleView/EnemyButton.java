package MapleView;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.*;

public class EnemyButton extends JButton implements Runnable {

	private Player p;
	private Thread t = new Thread(this); //������
	private Random r = new Random(); //����
	private SkillEffectButton seb; //��ų����Ʈ
	private BuffEffectButton beb; //��������Ʈ
	private JButton bi; // ����������
	private int skill2CoolTime; // ��ų2 ��Ÿ�Ӻ����Դϴ� 0�̸� ��밡���մϴ�

	// üũ�� ������
	public EnemyButton(Player p) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(1))));
	}
	
	// ��Ʋ�� ������
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
			//�� ���ݽ��۽� �����彽���� �����մϴ�! (�ȱ׷��� ���ݴ��ϰ� ������ �����ؿ�)
			try {
				Thread.sleep(3000); //�켱�� 3�ʴ� 1�� �����ϴ°ɷ� �س����ϴ�!
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//���� ����
			if (p.getBuffTime() < 0) //������ �Ƚ����ִٸ� ������ ����մϴ�! ���� ���� 2�������ϸ� ������ Ǯ���� �����Դϴ�.
			{
				p.buffskill();
				this.bi.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
				bi.setVisible(true);
				beb.start(p.getW().getSkillEffect().get(5));
				
				try {
					Thread.sleep(1000); //���� ���� �߰��� 1�� �����մϴ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//���� ����  (����Ա� or �����ϱ�)
			if (p.getHp() < p.getM_hp() / 3) p.drinkHPpotion(); //MP�� 30%�̸��̸� HP������ ���ʴϴ�!
			else if (p.getMp() < p.getM_mp() / 3) p.drinkMPpotion(); // MP�� 30%�̸��̸� MP������ ���ʴϴ�!
			else 
			{
				if(this.skill2CoolTime>0)
				{
					p.skillAttack(0); //��ų1�����մϴ�
					seb.start(p.getW().getSkillEffect().get(3)); //��ų1 ����Ʈ�� �����ϴ�
				}
				else
				{
					p.skillAttack(1); //��ų2�����մϴ�
					this.skill2CoolTime = 2; // ��Ÿ�� ���� ���� ��Ÿ���� �������� �ð����� (�����彽���ð� * ��Ÿ�Ӽ�������) ��ŭ ��Ÿ���� �ɸ��ϴ�
					seb.start(p.getW().getSkillEffect().get(4)); //��ų2 ����Ʈ�� �����ϴ�
					this.skill2CoolTime++; //�� �ؿ��� ��ų��Ÿ���� ���̹Ƿ� ���⼭ �ϳ� �� �÷��ݴϴ�
				}

			}
			//���� ���� 
			if(p.getBuffTime() == 0) 
			{
				p.buffRelease();
				bi.setVisible(false);
				bi.setIcon(null);
			}
			this.skill2CoolTime--; //��Ÿ���� �����մϴ�
		}
		
	}
	public void stop() {this.t.stop();}
}
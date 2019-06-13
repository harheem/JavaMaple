package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;

public class EnemyButton extends JButton implements Runnable{
	
	private Player p;
	private Thread t = new Thread(this);
	private Random r = new Random();
	private SkillEffectButton seb;
	public EnemyButton(Player p, SkillEffectButton seb) {
		this.p = p;
		this.seb = seb;
		this.setSize(150, 180);
		this.start();
	}
	
	public void start()
	{
		t.start();
	}	
	public void play()
	{
		if(p.getBuffTime()<0) p.buffskill();
		if(p.getHp()<p.getM_hp()/3) p.drinkHPpotion();
		else if (p.getMp()<p.getM_mp()/3) p.drinkMPpotion();
		int menu = r.nextInt(2);
		if(menu<2)
		{
			p.skillAttack(menu);
			this.setIcon(new ImageIcon(p.getW().getSkillEffect().get(menu)));
			seb.start(p.getW().getSkillEffect().get(2+menu));
		}
		if(p.getBuffTime()==0) p.buffRelease();
	}
	@Override
	public void run() {
		while(true)
		{
			if(p.getHp()<0 || p.getEnemy().getHp()<0) break;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			play();
			if(p.getHp()<0 || p.getEnemy().getHp()<0) break;
		}
	}


}
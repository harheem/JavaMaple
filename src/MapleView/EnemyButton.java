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
	private BuffEffectButton beb;
	private JButton bi; //버프아이콘
	public EnemyButton(Player p, SkillEffectButton seb, BuffEffectButton beb, JButton bi) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.seb = seb;
		this.beb = beb;
		this.bi = bi;
		this.setSize(150, 180);
		this.start();
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(3))));
	}
	
	public void start()
	{
		t.start();
	}	
	public void play()
	{
		if(p.getBuffTime()<0) 
		{
			p.buffskill();
			this.bi.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
			bi.setVisible(true);
			beb.start();
		}
		if(p.getHp()<p.getM_hp()/3) p.drinkHPpotion();
		else if (p.getMp()<p.getM_mp()/3) p.drinkMPpotion();
		int menu = r.nextInt(2);
		if(menu<2)
		{
			p.skillAttack(menu);
			seb.start(p.getW().getSkillEffect().get(2+menu));
		}
		if(p.getBuffTime()==0)
		{
			p.buffRelease();
			bi.setVisible(false);
			bi.setIcon(null);
		}
	}
	@Override
	public void run() {
		while(true)
		{
			if(p.getHp()<=0 || p.getEnemy().getHp()<=0) break;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(p.getHp()<=0 || p.getEnemy().getHp()<=0) break;
			play();
		}
	}


}
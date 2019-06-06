package control;

import MapleClass.*;
import java.util.Random;
public class Enemy implements Runnable{
	private Player p;
	private Thread t = new Thread(this);
	private Random r = new Random();
	public Enemy(Player computer)
	{
		this.p = computer;
	}
	public void start()
	{
		t.start();
	}	
	public void play()
	{
		if(p.getBuffTime()<0) p.buffskill();
		if(p.getHp()<p.getM_hp()/3) if(p.drinkHPpotion()) return;
		else if (p.getMp()<p.getM_mp()/3) if(p.drinkHPpotion()) return;
		int menu = r.nextInt(3);
		if(menu<2)
		{
			p.skillAttack(menu);
		}
		else p.attack();
		if(p.getBuffTime()==0) p.buffRelease();
	}
	@Override
	public void run() {
		while(true)
		{
			if(p.getHp()<0 || p.getEnemy().getHp()<0) break;
			play();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(p.getHp()<0 || p.getEnemy().getHp()<0) break;
		}
	}
}

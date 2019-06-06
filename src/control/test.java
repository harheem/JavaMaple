package control;

import MapleClass.*;

public class test {
	
	public static void main(String[] args) {
		Player p = new ÆÈ¶óµò();
		Player q = new ÆÈ¶óµò();
		p.setEnemy(q);
		q.setEnemy(p);
		Enemy a = new Enemy(p);
		Enemy b = new Enemy(q);
		
		a.start();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();

		
	/*	a.setEnemy(b);
		a.buffskill();
		b.buffskill();
		b.setEnemy(a);
		a.attack(b);
		b.skillAttack(a,1);
		a.attack(b);
		a.setEnemy(b);
		a.skillAttack(b,0);
		a.drinkHPpotion();*/
	}

}

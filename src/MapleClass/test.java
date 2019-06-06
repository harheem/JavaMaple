package MapleClass;

public class test {
	
	public static void main(String[] args) {
		Player a = new ÆÈ¶óµò();
		Player b = new ³ªÀÌÆ®·Îµå();
		a.setEnemy(b);
		a.buffskill();
		b.setEnemy(a);
		b.attack(a);
		b.skillAttack(a,0);
		b.attack(a);
		a.setHp(500);
		a.setEnemy(b);
		a.skillAttack(b,0);
		a.drinkHPpotion();
	}

}

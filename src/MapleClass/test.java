package MapleClass;

public class test {
	
	public static void main(String[] args) {
		�ű� a = new �ű�();
		����Ʈ�ε� b = new ����Ʈ�ε�();
		Player c = new �ҵ�();
		b.attack(a);
		b.skillAttack(a, 0);
		b.attack(c);
		a.setHp(500);
		b.skillAttack(a, 0);
		a.drinkHPpotion();
	}

}

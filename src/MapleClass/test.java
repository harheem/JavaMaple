package MapleClass;

public class test {
	
	public static void main(String[] args) {
		�ű� a = new �ű�();
		����Ʈ�ε� b = new ����Ʈ�ε�();
		b.attack(a);
		b.skillAttack(a, 0);
		b.reinforce();
		a.setHp(500);
		b.skillAttack(a, 0);
		a.drinkHPpotion();
	}

}

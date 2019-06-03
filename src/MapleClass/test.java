package MapleClass;

public class test {
	
	public static void main(String[] args) {
		신궁 a = new 신궁();
		나이트로드 b = new 나이트로드();
		b.attack(a);
		b.skillAttack(a, 0);
		b.reinforce();
		a.setHp(500);
		b.skillAttack(a, 0);
		a.drinkHPpotion();
	}

}

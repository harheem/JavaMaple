package MapleWeapon;


public class 두손검 extends Weapon {

	public 두손검() {
		this.wpName = new String[] { "목검", "왕푸", "라투핸더" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "블래스트", "디바인 차지" };
		this.skillMP = new int[] { 20, 60 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/PaladinWeapon1.png");
		wpIcon.add("../image/wp/PaladinWeapon2.png");
		wpIcon.add("../image/wp/PaladinWeapon3.png");
	}

}

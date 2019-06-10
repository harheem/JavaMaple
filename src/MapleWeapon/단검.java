package MapleWeapon;


public class 단검 extends Weapon {

	public 단검() {
		this.wpName = new String[] { "후르츠대거", "태극부채", "블러드대거" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "부메랑스텝", "암살" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/ShadwerWeapon1.png");
		wpIcon.add("../image/wp/ShadwerWeapon2.png");
		wpIcon.add("../image/wp/ShadwerWeapon3.png");
	}

}

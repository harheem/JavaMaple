package MapleWeapon;



public class 스태프 extends Weapon {

	public 스태프() {
		this.wpName = new String[] { "나무스태프", "아크스태프", "드래곤스태프" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "콜드빔", "라이트닝 스피어" };
		this.skillMP = new int[] { 50, 150 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/ThunderWeapon1.png");
		wpIcon.add("../image/wp/ThunderWeapon2.png");
		wpIcon.add("../image/wp/ThunderWeapon3.png");
	}


}

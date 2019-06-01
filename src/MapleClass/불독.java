package MapleClass;

import MapleWeapon.완드;

public class 불독 extends 마법사 {

	public 불독() {
		this.w = new 완드();
		this.name = "불독";
	}

	@Override
	public void reinforce() {
		this.hp += point * 5;
		this.mp += point * 5;
		this.power += point * 5;
		this.hp += point * 5;
		this.hp += point * 5;
	}

}

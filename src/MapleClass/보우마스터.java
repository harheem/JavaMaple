package MapleClass;

import MapleWeapon.석궁;

public class 보우마스터 extends 궁수 {

	public 보우마스터() {
		this.w = new 석궁();
		this.name = "보우마스터";
		this.power = (150 + point * 5);
		this.def = (150 + point * 5);

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

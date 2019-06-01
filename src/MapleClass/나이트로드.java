package MapleClass;

import MapleWeapon.아대;

public class 나이트로드 extends 도적 {

	public 나이트로드() {
		this.w = new 아대();
		this.name = "나이트로드";
		this.power = 160;
		this.def = 140;
	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.hp += point * 5;
		this.mp += point * 5;
		this.power += point * 5;
		this.hp += point * 5;
		this.hp += point * 5;
	}

}

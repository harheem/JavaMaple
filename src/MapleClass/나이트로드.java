package MapleClass;

import MapleWeapon.아대;

public class 나이트로드 extends 도적 {

	public 나이트로드() {
		this.w = new 아대();
		this.name = "나이트로드";
		this.power = 160 + w.getWpPower()[w.getWpIndex()];
		this.initial_power = this.power;
		this.def = 140;
		imageIcon.add("../image/player/NightLord_p.png");
		imageIcon.add("../image/player/NightLord_e.png");
		imageIcon.add("../image/player/m/NightLord_p.png");
		imageIcon.add("../image/player/m/NightLord_e.png");
	}
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.initial_power += point * 5;
		this.power = initial_power;
	}
}

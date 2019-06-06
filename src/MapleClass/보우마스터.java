package MapleClass;

import MapleWeapon.활;

public class 보우마스터 extends 궁수 {

	public 보우마스터() {
		this.w = new 활();
		this.name = "보우마스터";
		this.power = (150 + point * 5) + + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;

	}
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.initial_power=power * 5;
		this.power = initial_power;
	}
}

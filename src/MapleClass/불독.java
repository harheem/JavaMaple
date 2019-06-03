package MapleClass;

import MapleWeapon.완드;

public class 불독 extends 마법사 {

	public 불독() {
		this.w = new 완드();
		this.name = "불독";
	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.power += point * 5;
	}

}

package MapleClass;

import MapleWeapon.Ȱ;

public class �ű� extends �ü� {

	public �ű�() {
		this.w = new Ȱ();
		this.name = "�ű�";
		this.power = (150 + point * 5) + w.getWpPower()[w.getWpIndex()];
		this.def = (150 + point * 5);
		this.initial_power=power;
	}

	@Override
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

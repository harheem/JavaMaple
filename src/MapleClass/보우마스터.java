package MapleClass;

import MapleWeapon.����;

public class ���츶���� extends �ü� {

	public ���츶����() {
		this.w = new ����();
		this.name = "���츶����";
		this.power = (150 + point * 5);
		this.def = (150 + point * 5);
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

package MapleClass;

import MapleWeapon.�ƴ�;

public class ����Ʈ�ε� extends ���� {

	public ����Ʈ�ε�() {
		this.w = new �ƴ�();
		this.name = "����Ʈ�ε�";
		this.power = 160;
		this.initial_power = this.power;
		this.def = 140;
	}
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

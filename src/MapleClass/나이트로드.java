package MapleClass;

import MapleWeapon.�ƴ�;

public class ����Ʈ�ε� extends ���� {

	public ����Ʈ�ε�() {
		this.w = new �ƴ�();
		this.name = "����Ʈ�ε�";
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

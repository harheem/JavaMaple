package MapleClass;

import MapleWeapon.Ȱ;

public class ���츶���� extends �ü� {

	public ���츶����() {
		this.w = new Ȱ();
		this.name = "���츶����";
		this.power = (150 + point * 5) + + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;
		imageIcon.add("../image/player/BowMaster_p.png");
		imageIcon.add("../image/player/BowMaster_e.png");
		imageIcon.add("../image/player/m/BowMaster_p_m.png");
		imageIcon.add("../image/player/m/BowMaster_e_m.png");

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

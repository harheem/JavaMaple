package MapleClass;

import MapleWeapon.¼®±Ã;

public class ½Å±Ã extends ±Ã¼ö {

	public ½Å±Ã() {
		this.w = new ¼®±Ã();
		this.name = "½Å±Ã";
		this.power = (150 + point * 5) + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;
		imageIcon.add("../image/player/Marksman_p.png");
		imageIcon.add("../image/player/Marksman_e.png");
		imageIcon.add("../image/player/m/Marksman_p_m.png");
		imageIcon.add("../image/player/m/Marksman_e_m.png");
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

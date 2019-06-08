package MapleClass;

import MapleWeapon.´Ü°Ë;

public class ¼¨µµ¾î extends µµÀû {

	public ¼¨µµ¾î() {
		this.w = new ´Ü°Ë();
		this.name = "¼¨µµ¾î";
		this.power = 160+ w.getWpPower()[w.getWpIndex()];
		this.initial_power = this.power;
		this.def = 140;
		imageIcon.add("../image/player/Shadower_p.png");
		imageIcon.add("../image/player/Shadower_e.png");
		imageIcon.add("../image/player/m/Shadower_p.png");
		imageIcon.add("../image/player/m/Shadower_e.png");
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

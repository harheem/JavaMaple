package MapleClass;

import MapleWeapon.�ϵ�;

public class �ҵ� extends ������ {

	public �ҵ�() {
		this.w = new �ϵ�();
		this.name = "�ҵ�";
    	this.power = 150 + w.getWpPower()[w.getWpIndex()];
    	this.def = 130;
		imageIcon.add("../image/player/FirePoison_p.png");
		imageIcon.add("../image/player/FirePoison_e.png");
		imageIcon.add("../image/player/m/FirePoison_p.png");
		imageIcon.add("../image/player/m/FirePoison_e.png");
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

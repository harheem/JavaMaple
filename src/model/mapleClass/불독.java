package model.mapleClass;

import model.mapleWeapon.�ϵ�;

public class �ҵ� extends ������ {
	
	public �ҵ�() {
		this.w = new �ϵ�();
		this.name = "�ҵ�";
    	this.power = 180 + w.getWpPower()[w.getWpIndex()];
    	this.def = 120;
		imageIcon.add("../image/player/FirePoison_p.png");
		imageIcon.add("../image/player/FirePoison_e.png");
		imageIcon.add("../image/player/m/FirePoison_p_m.png");
		imageIcon.add("../image/player/m/FirePoison_e_m.png");
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

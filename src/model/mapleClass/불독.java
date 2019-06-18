package model.mapleClass;

import model.mapleWeapon.완드;

public class 불독 extends 마법사 {
	
	public 불독() {
		this.w = new 완드();
		this.name = "불독";
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

package model.mapleClass;

import model.mapleWeapon.단검;

public class 섀도어 extends 도적 {

	private static String explanation="섀도어: 단검을 주무기로 사용하는 암살자로  은신하여 적에게 다가가 치명적인 피해를 입힌다."
			+ "버프스킬: 섀도우파트너\r\n" + 
			"자신의공격력을 25%증가\r\n" + 
			"공격스킬1: 부메랑 스텝\r\n" + 
			"MP30소모, 은신하여 적에게 다가가 찌른다\r\n" + 
			"공격스킬2: 암살\r\n" + 
			"MP90소모, 적에게 다가가 암살한다";
	
	public 섀도어() {
		this.explanation="설명";
		this.w = new 단검();
		this.name = "섀도어";
		this.power = 150+ w.getWpPower()[w.getWpIndex()];
		this.initial_power = this.power;
		this.def = 130;
		imageIcon.add("../image/player/Shadower_p.png");
		imageIcon.add("../image/player/Shadower_e.png");
		imageIcon.add("../image/player/m/Shadower_p_m.png");
		imageIcon.add("../image/player/m/Shadower_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
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

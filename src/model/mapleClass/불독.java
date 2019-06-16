package model.mapleClass;

import model.mapleWeapon.완드;

public class 불독 extends 마법사 {

	private static String explanation="불독: 불과 독속성의 치명적인 마법을 사용하는 마법사로 적에게 지속적인 피해를 입힌다."
			+ "버프스킬: 매직가드\r\n" + 
			"데미지의 80%를 MP로 대체\r\n" + 
			"공격스킬1: 페럴라이즈 \r\n" + 
			"MP50소모, 독속성의 마법을 사용한다\r\n" + 
			"공격스킬2: 메테오\r\n" + 
			"MP150소모, 하늘에 운석을 떨어뜨린다\r\n";
	
	public 불독() {
		this.explanation="설명";
		this.w = new 완드();
		this.name = "불독";
    	this.power = 150 + w.getWpPower()[w.getWpIndex()];
    	this.def = 130;
		imageIcon.add("../image/player/FirePoison_p.png");
		imageIcon.add("../image/player/FirePoison_e.png");
		imageIcon.add("../image/player/m/FirePoison_p_m.png");
		imageIcon.add("../image/player/m/FirePoison_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
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

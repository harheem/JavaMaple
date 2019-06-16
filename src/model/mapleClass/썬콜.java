package model.mapleClass;

import model.mapleWeapon.스태프;

public class 썬콜 extends 마법사 {

	private static String explanation="썬콜: 얼음과 전기속성의 마법을 사용하는 마법사로 결빙된 적에게 크리티컬데미지로 공격한다."
			+ "버프스킬: 매직가드\r\n" + 
			"데미지의 60%를 MP로 대체\r\n" + 
			"공격스킬1: 콜드빔\r\n" + 
			"MP50소모, 적을 얼린다\r\n" + 
			"공격스킬2: 라이트닝 스피어\r\n" + 
			"MP150소모, 주위의 모든 곳을 얼음으로 뒤덮는다";
	
	public 썬콜() {
		this.explanation="설명";
		this.w = new 스태프();
		this.name = "썬콜";
    	this.power = 160 + w.getWpPower()[w.getWpIndex()];
    	this.def = 120;
		imageIcon.add("../image/player/IceLightning_p.png");
		imageIcon.add("../image/player/IceLightning_e.png");
		imageIcon.add("../image/player/m/IceLightning_p_m.png");
		imageIcon.add("../image/player/m/IceLightning_e_m.png");
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

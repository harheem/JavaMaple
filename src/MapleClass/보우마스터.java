package MapleClass;

import MapleWeapon.활;

public class 보우마스터 extends 궁수 {

	private static String explanation="보우마스터: 다양한 속성의 화살을 사용하는 궁수로 시원한 속사포공격이 특징이다";
	
	public 보우마스터() {
		this.explanation="설명";
		this.w = new 활();
		this.name = "보우마스터";
		this.power = (150 + point * 5) + + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;
		imageIcon.add("../image/player/BowMaster_p.png");
		imageIcon.add("../image/player/BowMaster_e.png");
		imageIcon.add("../image/player/m/BowMaster_p_m.png");
		imageIcon.add("../image/player/m/BowMaster_e_m.png");

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
		this.initial_power=power * 5;
		this.power = initial_power;
	}
}

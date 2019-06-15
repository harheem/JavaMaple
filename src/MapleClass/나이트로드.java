package MapleClass;

import MapleWeapon.아대;

public class 나이트로드 extends 도적 {

	private static String explanation="나이트로드: 표창을 사용하는 도적으로 원거리에서 강력하면서도 빠른 공격을 퍼붓는다";
	
	public 나이트로드() {
		this.w = new 아대();
		this.name = "나이트로드";
		this.power = 150 + w.getWpPower()[w.getWpIndex()];
		this.initial_power = this.power;
		this.def = 130;
		imageIcon.add("../image/player/NightLord_p.png");
		imageIcon.add("../image/player/NightLord_e.png");
		imageIcon.add("../image/player/m/NightLord_p_m.png");
		imageIcon.add("../image/player/m/NightLord_e_m.png");
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

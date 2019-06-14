package MapleClass;

import MapleWeapon.석궁;

public class 신궁 extends 궁수 {

	private static String explanation="신궁: 정확한 원샷 원킬의 스나이퍼가 컨셉인 궁수로 강력한 한발을 적에게 선사한다";
	
	public 신궁() {
		this.explanation="설명";
		this.w = new 석궁();
		this.name = "신궁";
		this.power = (150 + point * 5) + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;
		imageIcon.add("../image/player/Marksman_p.png");
		imageIcon.add("../image/player/Marksman_e.png");
		imageIcon.add("../image/player/m/Marksman_p_m.png");
		imageIcon.add("../image/player/m/Marksman_e_m.png");
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
		this.initial_power=power * 5;
		this.power = initial_power;
	}
}

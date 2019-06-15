package MapleClass;

import MapleWeapon.창;

public class 다크나이트 extends 전사 {

	private static String explanation="다크나이트: 죽지않는 암흑기사가 컨셉인 전사로 어둠을 바탕으로 한 공격으로 쉽게 죽지않는다."
			+ "버프 스킬: 하이퍼바디\r\n" + 
			"자신의 HP와 MP를 50% 증가\r\n" + 
			"공격 스킬1: 다크임페일\r\n" + 
			"MP 20소모 , 공격력  \r\n" + 
			"공격 스킬2: 궁그닐 디센트\r\n" + 
			"MP 50소모 , 공격력";
	private int initial_m_hp;
	private int initial_m_mp;

	public 다크나이트() {
		this.explanation="설명";
		this.w = new 창();
		this.name = "다크나이트";
		this.power = 120 + w.getWpPower()[w.getWpIndex()];
		this.def = 160;
		this.buffSkillName = "하이퍼바디";
		this.buffSkillMp = 30; // 하이퍼바디 소모할 mp
		this.initial_m_hp = m_hp;
		this.initial_m_mp = m_mp;
		imageIcon.add("../image/player/DarkKnight_p.png");
		imageIcon.add("../image/player/DarkKnight_e.png");
		imageIcon.add("../image/player/m/DarkKnight_p_m.png");
		imageIcon.add("../image/player/m/DarkKnight_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
	}

	@Override
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=buffSkillMp;
			this.m_hp = (int) (this.m_hp * 1.5);
			this.m_mp = (int) (this.m_mp * 1.5);
			this.buffTime = 3;
		}
	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.initial_m_hp = m_hp;
		this.initial_m_mp = m_mp;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.power += point * 5;
	}

	@Override
	public void buffRelease() {
		this.m_hp = initial_m_hp;
		this.m_mp = initial_m_mp;
		if (this.hp > this.m_hp)
			this.hp = this.m_hp;
		if (this.mp > this.m_mp)
			this.mp = this.m_mp;
	}

}

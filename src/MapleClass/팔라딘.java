package MapleClass;

import MapleWeapon.두손검;

public class 팔라딘 extends 전사 {

	private static String explanation="팔라딘: 절대 방어의 수호기사가 컨셉인 전사로 엘리멘탈의 힘을 충전하여 자신을 강화한다";
	private double enemy_initial_def;
	
	public 팔라딘() {
		this.explanation="설명";
		this.w = new 두손검();
		this.name = "팔라딘";
		this.power = 100 + w.getWpPower()[w.getWpIndex()];
		this.def = 180;
		this.buffSkillName = "위협";
		this.buffSkillMp = 30; // 위협 소모할 mp
		imageIcon.add("../image/player/Paladin_p.png");
		imageIcon.add("../image/player/Paladin_e.png");
		imageIcon.add("../image/player/m/Paladin_p_m.png");
		imageIcon.add("../image/player/m/Paladin_e_m.png");
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
	
	@Override
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=buffSkillMp;
			enemy_initial_def = enemy.getDef();
			this.def *=1.25;
			enemy.def*=0.75;
		}

		
	}

	@Override
	public void buffRelease() {
		this.def /=1.25;
		enemy.def = enemy_initial_def;
		
	}



}

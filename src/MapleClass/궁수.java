package MapleClass;

import Maple.Buffable;

public abstract class 궁수 extends Player implements Buffable {
	protected double initial_power;
	public 궁수() {
		this.m_hp = 750;
		this.m_mp = 300;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "샤프아이즈";
		this.buffSkillMp = 50;
	}
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp -= this.buffSkillMp;
			this.power*=1.25; //공격력 25%강화
			this.buffTime = 3;
		}

	}
	public void buffRelease() {
		this.power = initial_power; // power/=1.25 해도 되는데 버프 실행 해제과정에서 오류 생길까봐 이렇게 해놓을게요
	}

}

package model.mapleClass;

import model.Buffable;

public abstract class 도적 extends Player implements Buffable {
	protected double initial_power;
	public 도적() {
		this.m_hp = 1200;
		this.m_mp = 600;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "쉐도우파트너";
		this.buffSkillMp = 50;
	}
	@Override
	public void buffskill() {
		// 쉐도우 파트너라는 스킬은 그림자 분신을 만들어서 공격을 두번 하는 스킬입니다
		// 60퍼 만큼의 추가데미지를 입히는 쪽으로 (두번 공격하는 이미지면 더 좋을것같습니다)
		// 2턴 지속됩니다
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=this.buffSkillMp;
			this.power *= 1.25;
			// 두번 공격하는 의미로 나눠놨습니다
			this.buffTime = 3;
		}

	}

	@Override
	public void buffRelease() {
		this.power = initial_power;
	}
}

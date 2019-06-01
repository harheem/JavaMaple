package MapleClass;

import Maple.Buffable;

public abstract class ±Ã¼ö extends Player implements Buffable {

	public ±Ã¼ö() {
		this.m_hp = 500;
		this.m_mp = 500;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "»þÇÁ¾ÆÀÌÁî";
		this.buffSkillMp = 50;
	}

	@Override
	public void buffstkill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp -= this.buffSkillMp;
			this.power = 240;
			this.buffTime = 3;
		}

	}

	@Override
	public void buffRealease() {
		this.power = 160;
	}

}

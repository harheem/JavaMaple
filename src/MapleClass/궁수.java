package MapleClass;

import Maple.Buffable;

public abstract class �ü� extends Player implements Buffable {
	protected double initial_power;
	public �ü�() {
		this.m_hp = 750;
		this.m_mp = 300;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "����������";
		this.buffSkillMp = 50;
	}
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp -= this.buffSkillMp;
			this.power*=1.25; //���ݷ� 25%��ȭ
			this.buffTime = 3;
		}

	}
	public void buffRelease() {
		this.power = initial_power; // power/=1.25 �ص� �Ǵµ� ���� ���� ������������ ���� ������ �̷��� �س����Կ�
	}

}

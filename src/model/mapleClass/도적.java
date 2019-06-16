package model.mapleClass;

import model.Buffable;

public abstract class ���� extends Player implements Buffable {
	protected double initial_power;
	public ����() {
		this.m_hp = 1200;
		this.m_mp = 600;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "��������Ʈ��";
		this.buffSkillMp = 50;
	}
	@Override
	public void buffskill() {
		// ������ ��Ʈ�ʶ�� ��ų�� �׸��� �н��� ���� ������ �ι� �ϴ� ��ų�Դϴ�
		// 60�� ��ŭ�� �߰��������� ������ ������ (�ι� �����ϴ� �̹����� �� �����Ͱ����ϴ�)
		// 2�� ���ӵ˴ϴ�
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=this.buffSkillMp;
			this.power *= 1.25;
			// �ι� �����ϴ� �ǹ̷� ���������ϴ�
			this.buffTime = 3;
		}

	}

	@Override
	public void buffRelease() {
		this.power = initial_power;
	}
}

package MapleClass;

import Maple.Buffable;

public abstract class ���� extends Player implements Buffable {
	protected double initial_power;
	public ����() {
		this.m_hp = 750;
		this.m_mp = 750;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
	}
	@Override
	public void buffskill() {
		// ������ ��Ʈ�ʶ�� ��ų�� �׸��� �н��� ���� ������ �ι� �ϴ� ��ų�Դϴ�
		// 60�� ��ŭ�� �߰��������� ������ ������ (�ι� �����ϴ� �̹����� �� �����Ͱ����ϴ�)
		// 2�� ���ӵ˴ϴ�
		this.power *= 1.3;
		// �ι� �����ϴ� �ǹ̷� ���������ϴ�
		this.buffTime = 2;
	}

	@Override
	public void buffRelease() {
		this.power = initial_power;
	}
}

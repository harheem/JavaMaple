package MapleClass;

import Maple.Buffable;

public abstract class ���� extends Player implements Buffable {

	public ����() {
		this.m_hp = 500;
		this.m_mp = 500;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
	}

	@Override
	public void buffstkill() {
		// ������ ��Ʈ�ʶ�� ��ų�� �׸��� �н��� ���� ������ �ι� �ϴ� ��ų�Դϴ�
		// 60�� ��ŭ�� �߰��������� ������ ������ (�ι� �����ϴ� �̹����� �� �����Ͱ����ϴ�)
		// 2�� ���ӵ˴ϴ�
		this.power *= 1.6;
		// �ι� �����ϴ� �ǹ̷� ���������ϴ�
		this.buffTime = 2;
	}

	@Override
	public void buffRealease() {
		this.power /= 1.6;
	}
}

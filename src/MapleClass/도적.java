package MapleClass;

import Maple.Buffable;

public abstract class 도적 extends Player implements Buffable {

	public 도적() {
		this.m_hp = 500;
		this.m_mp = 500;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
	}

	@Override
	public void buffstkill() {
		// 쉐도우 파트너라는 스킬은 그림자 분신을 만들어서 공격을 두번 하는 스킬입니다
		// 60퍼 만큼의 추가데미지를 입히는 쪽으로 (두번 공격하는 이미지면 더 좋을것같습니다)
		// 2턴 지속됩니다
		this.power *= 1.6;
		// 두번 공격하는 의미로 나눠놨습니다
		this.buffTime = 2;
	}

	@Override
	public void buffRealease() {
		this.power /= 1.6;
	}
}

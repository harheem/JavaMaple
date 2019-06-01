package MapleClass;

import Maple.Buffable;

public abstract class 전사 extends Player implements Buffable {

    public 전사() {
		this.m_hp = 500;
		this.m_mp = 500;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    }

}

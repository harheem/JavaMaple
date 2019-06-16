package model.mapleClass;

import model.Buffable;

public abstract class 전사 extends Player implements Buffable {

    public 전사() {
		this.m_hp = 1600;
		this.m_mp = 200;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    }

}

package model.mapleClass;

import model.Buffable;

public abstract class ���� extends Player implements Buffable {

    public ����() {
		this.m_hp = 1500;
		this.m_mp = 300;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    }

}

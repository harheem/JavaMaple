package MapleClass;

import MapleWeapon.������;

public class ���� extends ������ {

	public ����() {
		this.w = new ������();
		this.name = "����";
    	this.power = 160 + w.getWpPower()[w.getWpIndex()];
    	this.def = 120;
	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.power += point * 5;
	}

}

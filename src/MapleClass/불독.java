package MapleClass;

import MapleWeapon.�ϵ�;

public class �ҵ� extends ������ {

	public �ҵ�() {
		this.w = new �ϵ�();
		this.name = "�ҵ�";
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

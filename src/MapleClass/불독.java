package MapleClass;

import MapleWeapon.�ϵ�;

public class �ҵ� extends ������ {

	public �ҵ�() {
		this.w = new �ϵ�();
		this.name = "�ҵ�";
	}

	@Override
	public void reinforce() {
		this.hp += point * 5;
		this.mp += point * 5;
		this.power += point * 5;
		this.hp += point * 5;
		this.hp += point * 5;
	}

}

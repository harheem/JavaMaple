package MapleClass;

import MapleWeapon.����;

public class ���츶���� extends �ü� {

	public ���츶����() {
		this.w = new ����();
		this.name = "���츶����";
		this.power = (150 + point * 5);
		this.def = (150 + point * 5);

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

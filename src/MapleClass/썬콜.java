package MapleClass;

import MapleWeapon.������;

public class ���� extends ������ {

	public ����() {
		this.w = new ������();
		this.name = "����";
	}

	@Override
	public void attack(Player p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.hp += point * 5;
		this.mp += point * 5;
		this.power += point * 5;
		this.hp += point * 5;
		this.hp += point * 5;
	}

}

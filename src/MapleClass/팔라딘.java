package MapleClass;

import MapleWeapon.�μհ�;

public class �ȶ�� extends ���� {

	public �ȶ��() {
		this.w = new �μհ�();
		this.name = "�ȶ��";
		this.power = 100 + w.getWpPower()[w.getWpIndex()];
		this.def = 160;
		this.buffSkillName = "����";
		this.buffSkillMp = 30; // ���� �Ҹ��� mp
	}

	@Override
	public void buffstkill() {
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

	@Override
	public void buffRealease() {
		// TODO Auto-generated method stub

	}

}

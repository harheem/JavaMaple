package MapleClass;

import MapleWeapon.�ƴ�;

public class ����Ʈ�ε� extends ���� {

	private static String explanation="����Ʈ�ε�: ǥâ�� ����ϴ� �������� ���Ÿ����� �����ϸ鼭�� ���� ������ �ۺ״´�";
	
	public ����Ʈ�ε�() {
		this.w = new �ƴ�();
		this.name = "����Ʈ�ε�";
		this.power = 150 + w.getWpPower()[w.getWpIndex()];
		this.initial_power = this.power;
		this.def = 130;
		imageIcon.add("../image/player/NightLord_p.png");
		imageIcon.add("../image/player/NightLord_e.png");
		imageIcon.add("../image/player/m/NightLord_p_m.png");
		imageIcon.add("../image/player/m/NightLord_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
	}
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.initial_power += point * 5;
		this.power = initial_power;
	}
}

package model.mapleClass;

import model.mapleWeapon.����;

public class �ű� extends �ü� {

	private static String explanation="�ű�: ��Ȯ�� ���� ��ų�� �������۰� ������ �ü��� ������ �ѹ��� ������ �����Ѵ�."
			+ "������ų: ����������\r\n" + 
			"�ڽ��� ���ݷ��� 25%����\r\n" + 
			"���ݽ�ų1: �Ǿ��\r\n" + 
			"MP30�Ҹ�\r\n" + 
			"���ݽ�ų2: ��������\r\n" + 
			"MP90�Ҹ�";
	
	public �ű�() {
		this.explanation="����";
		this.w = new ����();
		this.name = "�ű�";
		this.power = (150 + point * 5) + w.getWpPower()[w.getWpIndex()];
		this.def = (130 + point * 5);
		this.initial_power=power;
		imageIcon.add("../image/player/Marksman_p.png");
		imageIcon.add("../image/player/Marksman_e.png");
		imageIcon.add("../image/player/m/Marksman_p_m.png");
		imageIcon.add("../image/player/m/Marksman_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
	}

	@Override
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

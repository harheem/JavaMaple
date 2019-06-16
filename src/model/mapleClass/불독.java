package model.mapleClass;

import model.mapleWeapon.�ϵ�;

public class �ҵ� extends ������ {

	private static String explanation="�ҵ�: �Ұ� ���Ӽ��� ġ������ ������ ����ϴ� ������� ������ �������� ���ظ� ������."
			+ "������ų: ��������\r\n" + 
			"�������� 80%�� MP�� ��ü\r\n" + 
			"���ݽ�ų1: �䷲������ \r\n" + 
			"MP50�Ҹ�, ���Ӽ��� ������ ����Ѵ�\r\n" + 
			"���ݽ�ų2: ���׿�\r\n" + 
			"MP150�Ҹ�, �ϴÿ� ��� ����߸���\r\n";
	
	public �ҵ�() {
		this.explanation="����";
		this.w = new �ϵ�();
		this.name = "�ҵ�";
    	this.power = 150 + w.getWpPower()[w.getWpIndex()];
    	this.def = 130;
		imageIcon.add("../image/player/FirePoison_p.png");
		imageIcon.add("../image/player/FirePoison_e.png");
		imageIcon.add("../image/player/m/FirePoison_p_m.png");
		imageIcon.add("../image/player/m/FirePoison_e_m.png");
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
		this.power += point * 5;
	}
	

}

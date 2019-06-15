package MapleClass;

import MapleWeapon.â;

public class ��ũ����Ʈ extends ���� {

	private static String explanation="��ũ����Ʈ: �����ʴ� �����簡 ������ ����� ����� �������� �� �������� ���� �����ʴ´�."
			+ "���� ��ų: �����۹ٵ�\r\n" + 
			"�ڽ��� HP�� MP�� 50% ����\r\n" + 
			"���� ��ų1: ��ũ������\r\n" + 
			"MP 20�Ҹ� , ���ݷ�  \r\n" + 
			"���� ��ų2: �ñ״� ��Ʈ\r\n" + 
			"MP 50�Ҹ� , ���ݷ�";
	private int initial_m_hp;
	private int initial_m_mp;

	public ��ũ����Ʈ() {
		this.explanation="����";
		this.w = new â();
		this.name = "��ũ����Ʈ";
		this.power = 120 + w.getWpPower()[w.getWpIndex()];
		this.def = 160;
		this.buffSkillName = "�����۹ٵ�";
		this.buffSkillMp = 30; // �����۹ٵ� �Ҹ��� mp
		this.initial_m_hp = m_hp;
		this.initial_m_mp = m_mp;
		imageIcon.add("../image/player/DarkKnight_p.png");
		imageIcon.add("../image/player/DarkKnight_e.png");
		imageIcon.add("../image/player/m/DarkKnight_p_m.png");
		imageIcon.add("../image/player/m/DarkKnight_e_m.png");
	}
	public static String getExplanation() {
		return explanation;
	}

	@Override
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=buffSkillMp;
			this.m_hp = (int) (this.m_hp * 1.5);
			this.m_mp = (int) (this.m_mp * 1.5);
			this.buffTime = 3;
		}
	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.initial_m_hp = m_hp;
		this.initial_m_mp = m_mp;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.power += point * 5;
	}

	@Override
	public void buffRelease() {
		this.m_hp = initial_m_hp;
		this.m_mp = initial_m_mp;
		if (this.hp > this.m_hp)
			this.hp = this.m_hp;
		if (this.mp > this.m_mp)
			this.mp = this.m_mp;
	}

}

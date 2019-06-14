package MapleClass;

import MapleWeapon.�μհ�;

public class �ȶ�� extends ���� {

	private static String explanation="�ȶ��: ���� ����� ��ȣ��簡 ������ ����� ������Ż�� ���� �����Ͽ� �ڽ��� ��ȭ�Ѵ�";
	private double enemy_initial_def;
	
	public �ȶ��() {
		this.explanation="����";
		this.w = new �μհ�();
		this.name = "�ȶ��";
		this.power = 100 + w.getWpPower()[w.getWpIndex()];
		this.def = 180;
		this.buffSkillName = "����";
		this.buffSkillMp = 30; // ���� �Ҹ��� mp
		imageIcon.add("../image/player/Paladin_p.png");
		imageIcon.add("../image/player/Paladin_e.png");
		imageIcon.add("../image/player/m/Paladin_p_m.png");
		imageIcon.add("../image/player/m/Paladin_e_m.png");
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
	
	@Override
	public void buffskill() {
		if (this.mp < this.buffSkillMp)
			return;
		else {
			this.mp-=buffSkillMp;
			enemy_initial_def = enemy.getDef();
			this.def *=1.25;
			enemy.def*=0.75;
		}

		
	}

	@Override
	public void buffRelease() {
		this.def /=1.25;
		enemy.def = enemy_initial_def;
		
	}



}

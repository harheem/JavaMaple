package MapleWeapon;


public class ���� extends Weapon {

	public ����() {
		this.wpName = new String[] { "����", "�̱�ũ��", "��� �׽���" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "�Ǿ��", "��������" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/MarksmanWeapon1.png");
		wpIcon.add("../image/wp/MarksmanWeapon2.png");
		wpIcon.add("../image/wp/MarksmanWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/MarksmanSkill1.png");
		skillIcon.add("../image/skillIcon/MarksmanSkill2.png");
		skillIcon.add("../image/skillIcon/ArcherBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/MarksmanSkill1Effect.png");
		skillEffect.add("../image/skilleffect/MarksmanSkill2Effect.png");
		skillEffect.add("../image/skilleffect_e/MarksmanSkill1Effect.png");
		skillEffect.add("../image/skilleffect_e/MarksmanSkill2Effect.png");
		skillEffect.add("../image/skilleffect/ArcherBuffEffect_p.png");
		skillEffect.add("../image/skilleffect_e/ArcherBuffEffect.png");
	}



}

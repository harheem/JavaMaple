package MapleWeapon;


public class �μհ� extends Weapon {

	public �μհ�() {
		this.wpName = new String[] { "���", "��Ǫ", "�����ڴ�" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "����Ʈ", "����� ����" };
		this.skillMP = new int[] { 20, 60 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/PaladinWeapon1.png");
		wpIcon.add("../image/wp/PaladinWeapon2.png");
		wpIcon.add("../image/wp/PaladinWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/PaladinSkill1.png");
		skillIcon.add("../image/skillIcon/PaladinSkill2.png");
		skillIcon.add("../image/skillIcon/PaladinBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/PaladinSkill1Effect.png");
		skillEffect.add("../image/skilleffect/PaladinSkill2Effect.png");
		skillEffect.add("../image/skilleffect_e/PaladinSkill1Effect.png");
		skillEffect.add("../image/skilleffect_e/PaladinSkill2Effect.png");
		skillEffect.add("../image/skilleffect/PaladinBuffEffect_p.png");
		skillEffect.add("../image/skilleffect_e/PaladinBuffEffect.png");
	}

}

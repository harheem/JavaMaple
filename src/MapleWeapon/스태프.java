package MapleWeapon;



public class ������ extends Weapon {

	public ������() {
		this.wpName = new String[] { "����������", "��ũ������", "�巡�ｺ����" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "�ݵ��", "����Ʈ�� ���Ǿ�" };
		this.skillMP = new int[] { 50, 150 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/ThunderWeapon1.png");
		wpIcon.add("../image/wp/ThunderWeapon2.png");
		wpIcon.add("../image/wp/ThunderWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/ThunderSkill1.png");
		skillIcon.add("../image/skillIcon/ThunderSkill2.png");
		skillIcon.add("../image/skillIcon/WizardBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/ThunderSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ThunderSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ThunderSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ThunderSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/WizardBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/WizardBuffEffect.gif");
	}


}

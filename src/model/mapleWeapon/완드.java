package model.mapleWeapon;


public class �ϵ� extends Weapon {

	public �ϵ�() {
		this.wpName = new String[] { "���ϵ�", "������ϵ�", "�巡��ϵ�" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "�䷲������", "���׿�" };
		this.skillMP = new int[] { 50, 150 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/FireWeapon1.png");
		wpIcon.add("../image/wp/FireWeapon2.png");
		wpIcon.add("../image/wp/FireWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/FireSkill1.png");
		skillIcon.add("../image/skillIcon/FireSkill2.png");
		skillIcon.add("../image/skillIcon/WizardBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/FireSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/FireSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/FireSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/FireSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/WizardBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/WizardBuffEffect.gif");
		
		
		//��ų����(��ų1, ��ų2, ���� ����)
		skillExplanation.add("�ټ��� ���� ���� �ð����� �����Ű�� ���� �������� �ش�");
		skillExplanation.add("�ϴ÷κ��� ��� ��ȯ�Ͽ� �ټ��� ������ ������ ȭ�� ������ ���Ѵ�");
		skillExplanation.add("Ȱ��ȭ �� �޴� �������� �Ϻθ� MP�� ����Ѵ�. ��, MP�� 0�� ��쿡�� �״�� HP�� �Һ��ϰ� �ȴ�.");
		
	}


}

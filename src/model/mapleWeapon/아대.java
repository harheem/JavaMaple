package model.mapleWeapon;


public class �ƴ� extends Weapon {

	public �ƴ�() {
		this.wpName = new String[] { "���Ͼ�", "��ƿ����", "����ũ����" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "���巯�ý��ο�", "��緹�̵�" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/NightLordWeapon1.png");
		wpIcon.add("../image/wp/NightLordWeapon2.png");
		wpIcon.add("../image/wp/NightLordWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/NightLordSkill1.png");
		skillIcon.add("../image/skillIcon/NightLordSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/NightLordSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/NightLordSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/NightLordSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/NightLordSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
		
		//��ų����(��ų1, ��ų2, ���� ����)
		skillExplanation.add("�������� ǥâ�� ���� �����Ѵ�");
		skillExplanation.add("�����ִ� ������� �ѵ����Ͽ� ��ü�� �ҹٴٷ� �����");
		skillExplanation.add("���� �ð����� �ڽŰ� �Ȱ��� �ൿ�� �ϴ� �׸��� ���Ḧ ��ȯ�Ѵ�");
	}
}

package model.mapleWeapon;


public class �ܰ� extends Weapon {

	public �ܰ�() {
		this.wpName = new String[] { "�ĸ������", "�±غ�ä", "������" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "�θ޶�����", "�ϻ�" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		//��������� �̹������
		wpIcon.add("../image/wp/ShadowerWeapon1.png");
		wpIcon.add("../image/wp/ShadowerWeapon2.png");
		wpIcon.add("../image/wp/ShadowerWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/ShadowerSkill1.png");
		skillIcon.add("../image/skillIcon/ShadowerSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/ShadowerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ShadowerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadowerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadowerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
		
		//��ų����(��ų1, ��ų2, ���� ����)
		skillExplanation.add("�����ӵ��� �ټ��� ������ ����");
		skillExplanation.add("���� �޼Ҹ� �����Ͽ� ��û�� �������� �ش�");
		skillExplanation.add("���� �ð����� �ڽŰ� �Ȱ��� �ൿ�� �ϴ� �׸��� ���Ḧ ��ȯ�Ѵ�");
		
	}

}

package MapleWeapon;


public class �ܰ� extends Weapon {

	public �ܰ�() {
		this.wpName = new String[] { "�ĸ������", "�±غ�ä", "������" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "�θ޶�����", "�ϻ�" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		//��������� �̹������
		wpIcon.add("../image/wp/ShadwerWeapon1.png");
		wpIcon.add("../image/wp/ShadwerWeapon2.png");
		wpIcon.add("../image/wp/ShadwerWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/ShadwerSkill1.png");
		skillIcon.add("../image/skillIcon/ShadwerSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/ShadwerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ShadwerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadwerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadwerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
	}

}

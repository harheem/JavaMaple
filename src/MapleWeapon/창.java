package MapleWeapon;


public class â extends Weapon {

	public â() {
		this.wpName = new String[] { "��â", "���Ȼ��", "�ǳ�ī" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "��ũ������", "�ñ״� ��Ʈ" };
		this.skillMP = new int[] { 20, 60 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/DarkKnightWeapon1.png");
		wpIcon.add("../image/wp/DarkKnightWeapon2.png");
		wpIcon.add("../image/wp/DarkKnightWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/DarkKnightSkill1.png");
		skillIcon.add("../image/skillIcon/DarkKnightSkill2.png");
		skillIcon.add("../image/skillIcon/DarkKnightBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/DarkKnightSkill1Effect.png");
		skillEffect.add("../image/skilleffect/DarkKnightSkill2Effect.png");
		skillEffect.add("../image/skilleffect_e/DarkKnightSkill1Effect.png");
		skillEffect.add("../image/skilleffect_e/DarkKnightSkill2Effect.png");
		skillEffect.add("../image/skilleffect/DarkKnightBuffEffect_p.png");
		skillEffect.add("../image/skilleffect_e/DarkKnightBuffEffect.png");
		

	}

}

package MapleWeapon;


public class Ȱ extends Weapon {

	public Ȱ() {
		this.wpName = new String[] { "�� ����", "�ø�Ǫ��", "������" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "���ο� �÷���", "��ī���ͺ� ���ο�" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/BowMasterWeapon1.png");
		wpIcon.add("../image/wp/BowMasterWeapon2.png");
		wpIcon.add("../image/wp/BowMasterWeapon3.png");
		//��ų�����ܰ� ���� ������ �̹������
		skillIcon.add("../image/skillIcon/BowMasterSkill1.png");
		skillIcon.add("../image/skillIcon/BowMasterSkill2.png");
		skillIcon.add("../image/skillIcon/ArcherBuff.png");
		//��ų����Ʈ �÷��̾� ��ų 2��, ��뽺ų 2�� ���� �÷��̾�, ��벨
		skillEffect.add("../image/skilleffect/BowMasterSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/BowMasterSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/BowMasterSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/BowMasterSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ArcherBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ArcherBuffEffect.gif");
				
		//��ų����(��ų1, ��ų2, ���� ����)
		skillExplanation.add("ȭ���� ���� �߻��Ѵ�. ");
		skillExplanation.add("����� Ư������ ���� �� �� ���� ���� ȭ���� ���������� �������� ���.");
		skillExplanation.add("�����ð����� ���� ������ ã�� ġ����� ������");
	}

}

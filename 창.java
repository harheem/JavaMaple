package TeamProject;
//��ũ����Ʈ
public class â extends Weapon {

	public â(Player p)
	{
		super(p);
		this.weaponConstant = 1.49;
		this.name = new String[] {"��â","���Ȼ��","�ǳ�ī"};
		this.skillName = new String[] {"��ũ������", "�ñ״� ��Ʈ"};
		this.skillMP = new int[] {20,70};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint = 1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint = 1.8;
	}
}

package TeamProject;
//���츶����
public class Ȱ extends Weapon {

	public Ȱ(Player p)
	{
		super(p);
		this.weaponConstant = 1.3;
		this.name = new String[] {"�� ����","�ø�Ǫ��","������"};
		this.skillName = new String[] {"��ī���ͺ� �ַο�", "�ַο� �÷���"};
		this.skillMP = new int[] {30,80};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

package TeamProject;
//�ű�
public class ���� extends Weapon {
	public ����(Player p)
	{
		super(p);
		this.weaponConstant = 1.30;
		this.name = new String[] {"����","�̱�ũ��","��� �׽���"};
		this.skillName = new String[] {"�Ǿ��","��������"};
		this.skillMP = new int[] {30,90};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

package TeamProject;
//�ȶ��
public class �μհ� extends Weapon {

	public �μհ�(Player p)
	{
		super(p);
		this.weaponConstant = 1.20;
		this.name = new String[] {"���","��Ǫ","�����ڴ�"};
		this.skillName = new String[] {"����Ʈ", "����� ����"};
		this.skillMP = new int[] {20,60};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

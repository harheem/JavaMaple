package TeamProject;
//����Ʈ�ε�
public class �ƴ� extends Weapon {

	public �ƴ�(Player p)
	{
		super(p);
		this.weaponConstant = 1.75;
		this.name = new String[] {"���Ͼ�","��ƿ����","����ũ����"};
		this.skillName = new String[] {"���巯�ý��ο�", "��緹�̵�"};
		this.skillMP = new int[] {30,80};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

package TeamProject;
//����Ʈ�ε�
public class �ƴ� extends Weapon {

	public �ƴ�(Player p)
	{
		super(p);
		this.weaponConstant = 1.30;
		this.name = new String[] {"���Ͼ�","��ƿ����","����ũ����"};
		this.skillName = new String[] {"���巯�ý��ο�", "��緹�̵�"};
		this.skillMP = new int[] {30,90};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
		//������ ������ ����Ʈ�� ������ ��û ���ٴ� ������ ��׿�
		//������ ��Ʈ�� ���� 6��... ���� �����°� ������ Ư¡�߿� �ϳ��� 
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
	   //��������Ʈ�� ���� 2�� ������ �����Ϸ��� 
}

package TeamProject;
//����
public class ������ extends Weapon {

	public ������(Player p) 
	{
		super(p);
		this.weaponConstant = 1.0;
		this.name = new String[] {"����������","��ũ������","�巡�ｺ����"};
		this.skillName = new String[] {"�ݵ��", "����Ʈ�� ���Ǿ�"};
		this.skillMP = new int[] {50,150};
	}
	protected void setSkill1(Player owner) {//5%Ȯ���� ���� 2�� ��(�ൿ�Ұ�). skipTurn+=2
		this.skillPoint=1.2;
		if(Math.random()<0.05)
			owner.getEnemy().skipTurn+=2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}

}

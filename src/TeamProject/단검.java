package TeamProject;
//������
public class �ܰ� extends Weapon {
	public �ܰ�(Player p)
	{
		super(p);
		this.weaponConstant = 1.3;
		this.name = new String[] {"�ĸ������","�±غ�ä","������"};
		this.skillName = new String[] {"�θ޶�����","�ϻ�"};
		this.skillMP = new int[] {30,90};
		
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) { //�ϻ�, 5%Ȯ���� ���
		if(Math.random()<=0.05) {
			owner.getEnemy().setHp(0);
			System.out.println("����� �ϰ�!");
			//�ʹ����ƴѰ�;; Ȯ���� ������ ����
		}
		else
			this.skillPoint=1.8;
		
	}
}

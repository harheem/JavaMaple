package TeamProject;
public abstract class ���� extends Player {

	public ����(int point, boolean user)
	{
		super(point,user);
		this.m_hp = 200;
		this.m_mp = 100;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		
	}
	public void buff() {}		
    public void buffRelease() {}
    public void ��ȭ�ϱ�() {}
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	this.hp-=realDamage;	
	    }
}
//�Ϸ�

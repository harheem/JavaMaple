package TeamProject;
public abstract class ������ extends Player {
    public ������(int point, boolean user)
    {
    	super(point,user);
		this.m_hp = 100;
		this.m_mp = 200;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 150;
    	this.def = 100;
    	this.skillName = "��������";
    	this.skillMP = 80;
    }
    public void buff() 
    {
    	if(this.mp<this.skillMP) return;
    	else 
    	{
    		this.mp-=this.skillMP;
    		this.time = 3;
    	}
    }
    public void buffRelease() {/*���� ������ �����ϴ�*/}
    public void attackted(int damage) 
    {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "�� ������ ȸ���߽��ϴ�!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	if(time>=0) //�������� ����������
    	{
    		System.out.println("��������� �������� 85%�� mp�� ����մϴ�!!");
    		int change = (int) Math.min(realDamage*0.85, this.mp);
    		this.mp-=change;
    		this.hp-=realDamage-change;
    		System.out.println("HP����:" + (realDamage - change));
    		System.out.println("MP����:" + (change));
    	}
    	else this.hp-=realDamage;
    }
}

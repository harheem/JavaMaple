package TeamProject;
public abstract class ���� extends Player {

	public ����(int point, boolean user)
	{
		super(point,user);
		this.m_hp = (int)(200*(1 + 0.2*(this.point-1)));
		this.m_mp = (int)(100*(1 + 0.2*(this.point-1)));
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		
	}
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	��ȭ�ϱ�();
    }  
    public abstract void buffRelease();
    public abstract void ��ȭ�ϱ�();
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    	System.out.println(this.name + "(��)�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	this.hp-=realDamage;	
	    }
}
package TeamProject;
public abstract class ���� extends Player {
	public ����(int point, boolean user)
	{
		super(point,user);
		this.m_hp = (int)(600*(1 + 0.2*(this.point-1)));
		this.m_mp = (int)(600*(1 + 0.2*(this.point-1)));
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.skillName = "������ ��Ʈ��";
		this.skillMP = 50;
	}
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	��ȭ�ϱ�();
    }
    public void buffRelease() {
    	this.power /=1.6; 
    }
    public void ��ȭ�ϱ�() {
    	//������ ��Ʈ�ʶ�� ��ų�� �׸��� �н��� ���� ������ �ι� �ϴ� ��ų�Դϴ�
        //60�� ��ŭ�� �߰��������� ������ ������ (�ι� �����ϴ� �̹����� �� �����Ͱ����ϴ�)
    	//2�� ���ӵ˴ϴ�
    	this.power *=1.6;
    	//�ι� �����ϴ� �ǹ̷� ���������ϴ�
    	this.time = 2;
    }
    public void attackted(int damage) 
    {
        int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
        if(Math.random()<0.3) 
    	{
    		System.out.println(this.name + "�� ��ũ����Ʈ�� ����Ͽ� ������ ȸ���߽��ϴ�!");
    		realDamage=0;
    	}
        System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
        this.hp-=realDamage;
    }
 }
    

package TeamProject;
public abstract class �ü� extends Player implements ��ȭ�ϱ�{
	public �ü�(int point, boolean user)
	{
		super(point,user);
		this.m_hp = 150;
		this.m_mp = 150;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.skillName = "����������";
		this.skillMP = 50;
	}
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;	
    	��ȭ�ϱ�();
    }
    public void buffRelease() {
    //	this.power =
    //�ؾ���
    //ũ��Ƽ�� �ѹ�	
    }
    public void ��ȭ�ϱ�() {  	
    //	this.power = (int)((1.3)*(this.power));
    //���ݷ��� �����ϴ°ɷ�
    //ũ��Ƽ��	
    //	this.time =3;
    }
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "�� ������ ȸ���߽��ϴ�!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	this.hp-=realDamage;	
    	
    }	      		
}

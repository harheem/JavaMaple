package TeamProject;
public class ��ũ����Ʈ extends ���� implements ��ȭ�ϱ� {
   // private â â;
    public ��ũ����Ʈ(int point, boolean user)
    {
    	super(point, user);
    	this.name = "��ũ����Ʈ";
    	this.power = 120;
    	this.def = 150;
    	this.w = new â(this);
    	this.skillName = "�����۹ٵ�";
    	this.skillMP = 30; //�����۹ٵ� �Ҹ��� mp
    }
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	��ȭ�ϱ�();
    }  // ��ȭ�ϱ� �޼ҵ尡 �޶� �̰� ������ߵǴ°ǰ�
    public void ��ȭ�ϱ�()
    {
    	this.m_hp = 320;
    	this.m_mp = 160;
    	this.time =3;	
    }
      // �� �ƴ�
    public void buffRelease() 
    {
		this.m_hp = 200;
		this.m_mp = 100;
		if(this.hp>this.m_hp) this.hp=this.m_hp;
		if(this.mp>this.m_mp) this.mp=this.m_mp;
    }
     // �굵 �ƴ�
    //public void attackted(int damage) 
    //{
    //	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    //	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    //	this.hp-=realDamage;
    //}
    // ��ӹ޽��ϴ�.
}
//�Ϸ�


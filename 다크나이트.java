package TeamProject;
public class ��ũ����Ʈ extends ���� implements ��ȭ�ϱ� {
	private final int initial_m_hp;
	private final int initial_m_mp;
    public ��ũ����Ʈ(int point, boolean user)
    {
    	super(point, user);
    	this.name = "��ũ����Ʈ";
    	this.power = 120;
    	this.def = 150;
    	this.w = new â(this);
    	this.skillName = "�����۹ٵ�";
    	this.skillMP = 30; //�����۹ٵ� �Ҹ��� mp
    	
    	this.initial_m_hp = m_hp;
    	this.initial_m_mp = m_mp;
    }
    
    public void ��ȭ�ϱ�()
    {
    	this.m_hp = (int)(this.m_hp*1.6);
    	this.m_mp = (int)(this.m_mp*1.6);
    	this.time =3;	
    }
    public void buffRelease() 
    {
		this.m_hp = initial_m_hp;
		this.m_mp = initial_m_mp;
		if(this.hp>this.m_hp) this.hp=this.m_hp;
		if(this.mp>this.m_mp) this.mp=this.m_mp;
    }
}


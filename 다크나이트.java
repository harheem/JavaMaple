package TeamProject;
public class 다크나이트 extends 전사 implements 강화하기 {
	private final int initial_m_hp;
	private final int initial_m_mp;
    public 다크나이트(int point, boolean user)
    {
    	super(point, user);
    	this.name = "다크나이트";
    	this.power = 120;
    	this.def = 150;
    	this.w = new 창(this);
    	this.skillName = "하이퍼바디";
    	this.skillMP = 30; //하이퍼바디 소모할 mp
    	
    	this.initial_m_hp = m_hp;
    	this.initial_m_mp = m_mp;
    }
    
    public void 강화하기()
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


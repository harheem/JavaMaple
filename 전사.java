package TeamProject;
public abstract class 전사 extends Player {

	public 전사(int point, boolean user)
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
    	강화하기();
    }  
    public abstract void buffRelease();
    public abstract void 강화하기();
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    	System.out.println(this.name + "(이)가 " + realDamage + "만큼의 피해를 입습니다!");
    	this.hp-=realDamage;	
	    }
}
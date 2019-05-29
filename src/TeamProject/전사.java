package TeamProject;
public abstract class 전사 extends Player {

	public 전사(int point, boolean user)
	{
		super(point,user);
		this.m_hp = 200;
		this.m_mp = 100;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		
	}
	public void buff() {}		
    public void buffRelease() {}
    public void 강화하기() {}
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    	System.out.println(this.name + "가 " + realDamage + "만큼의 피해를 입습니다!");
    	this.hp-=realDamage;	
	    }
}
//완료

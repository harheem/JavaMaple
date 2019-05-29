package TeamProject;
public abstract class 마법사 extends Player {
    public 마법사(int point, boolean user)
    {
    	super(point,user);
		this.m_hp = 100;
		this.m_mp = 200;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 150;
    	this.def = 100;
    	this.skillName = "매직가드";
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
    public void buffRelease() {/*넣을 내용이 없습니다*/}
    public void attackted(int damage) 
    {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "이 공격을 회피했습니다!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "이 " + realDamage + "만큼의 피해를 입습니다!");
    	if(time>=0) //매직가드 켜져있으면
    	{
    		System.out.println("매직가드로 데미지의 85%를 mp로 대신합니다!!");
    		int change = (int) Math.min(realDamage*0.85, this.mp);
    		this.mp-=change;
    		this.hp-=realDamage-change;
    		System.out.println("HP피해:" + (realDamage - change));
    		System.out.println("MP피해:" + (change));
    	}
    	else this.hp-=realDamage;
    }
}

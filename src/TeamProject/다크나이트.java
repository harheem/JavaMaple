package TeamProject;
public class 다크나이트 extends 전사 implements 강화하기 {
   // private 창 창;
    public 다크나이트(int point, boolean user)
    {
    	super(point, user);
    	this.name = "다크나이트";
    	this.power = 120;
    	this.def = 150;
    	this.w = new 창(this);
    	this.skillName = "하이퍼바디";
    	this.skillMP = 30; //하이퍼바디 소모할 mp
    }
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	강화하기();
    }  // 강화하기 메소드가 달라서 이건 살려놔야되는건가
    public void 강화하기()
    {
    	this.m_hp = 320;
    	this.m_mp = 160;
    	this.time =3;	
    }
      // 얜 아님
    public void buffRelease() 
    {
		this.m_hp = 200;
		this.m_mp = 100;
		if(this.hp>this.m_hp) this.hp=this.m_hp;
		if(this.mp>this.m_mp) this.mp=this.m_mp;
    }
     // 얘도 아님
    //public void attackted(int damage) 
    //{
    //	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    //	System.out.println(this.name + "가 " + realDamage + "만큼의 피해를 입습니다!");
    //	this.hp-=realDamage;
    //}
    // 상속받습니다.
}
//완료


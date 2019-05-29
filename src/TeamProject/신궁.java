package TeamProject;
public class 신궁 extends 궁수 {
//    private 석궁 석궁;

    public 신궁(int point, boolean user)
    {
    	super(point, user);
    	this.name = "신궁";
    	this.power = 150;
    	this.def = 100;
    	this.w = new 석궁(this);
    	this.skillName = "샤프아이즈";
    	this.skillMP = 50; //샤프아이즈 소모할 mp
    }
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	강화하기();
    }
    //상속받는데 강화하기가 신궁과 달라서 행여 안될까 남겨놓겠습니다
    public void 강화하기()
    {
       this.power = 225;
    	this.time =3; //이런스킬은 다크나이트랑 같이 3턴 유지되게 일치시켰습니다.	   
    	//스킬 주석은 보우마스터와 같습니다
    }
    public void buffRelease() 
    {
        this.power = 150;
        //스킬 주석은 보우마스터와 같습니다
       
    }
    //public void attackted(int damage) 
    //{
    //	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    //	if(Math.random()<0.1) 
    //	{
    //		System.out.println(this.name + "가 공격을 회피했습니다!");
    //		realDamage=0;
    //	}
    //	System.out.println(this.name + "가 " + realDamage + "만큼의 피해를 입습니다!");
    //	this.hp-=realDamage;
    //}
    //상속받습니다
}
//완료

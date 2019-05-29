package TeamProject;
public class 보우마스터 extends 궁수 {
//    private 활 활;
    public 보우마스터(int point, boolean user)
    {
    	super(point, user);
    	this.name = "보우마스터";
    	this.power = 120;
    	this.def = 130;
    	this.w = new 활(this);
    	this.skillName = "샤프아이즈";
    	this.skillMP = 50; //샤프아이즈 소모할 mp
    	
    }
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	강화하기();
    }
    //상속받는데 강화하기가 신궁과 달라서 행여 안될까 살려놓겠습니다 
    public void 강화하기()
    {   
    	this.power = 180;
        //크리티컬 확률20%, 크리티컬데미지 15%증가  ->공격력(power) 150% 증가로 변경
    	this.time =3; //이런스킬은 다크나이트랑 같이 3턴 유지되게 일치시켰습니다.		
    }
    public void buffRelease() 
    {   this.power = 120;
		//크리티컬확률, 크리티컬 데미지  롤백 ->공격력(power) 롤백
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

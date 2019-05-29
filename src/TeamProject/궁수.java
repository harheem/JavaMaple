package TeamProject;
public abstract class 궁수 extends Player implements 강화하기{
	public 궁수(int point, boolean user)
	{
		super(point,user);
		this.m_hp = 150;
		this.m_mp = 150;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.skillName = "샤프아이즈";
		this.skillMP = 50;
	}
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;	
    	강화하기();
    }
    public void buffRelease() {
    //	this.power =
    //해야함
    //크리티컬 롤백	
    }
    public void 강화하기() {  	
    //	this.power = (int)((1.3)*(this.power));
    //공격력을 증가하는걸로
    //크리티컬	
    //	this.time =3;
    }
    public void attackted(int damage) {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "가 공격을 회피했습니다!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "가 " + realDamage + "만큼의 피해를 입습니다!");
    	this.hp-=realDamage;	
    	
    }	      		
}

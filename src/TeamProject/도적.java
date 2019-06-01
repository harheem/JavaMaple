package TeamProject;
public abstract class 도적 extends Player {
	public 도적(int point, boolean user)
	{
		super(point,user);
		this.m_hp = (int)(600*(1 + 0.2*(this.point-1)));
		this.m_mp = (int)(600*(1 + 0.2*(this.point-1)));
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.skillName = "쉐도우 파트너";
		this.skillMP = 50;
	}
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	강화하기();
    }
    public void buffRelease() {
    	this.power /=1.6; 
    }
    public void 강화하기() {
    	//쉐도우 파트너라는 스킬은 그림자 분신을 만들어서 공격을 두번 하는 스킬입니다
        //60퍼 만큼의 추가데미지를 입히는 쪽으로 (두번 공격하는 이미지면 더 좋을것같습니다)
    	//2턴 지속됩니다
    	this.power *=1.6;
    	//두번 공격하는 의미로 나눠놨습니다
    	this.time = 2;
    }
    public void attackted(int damage) 
    {
        int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
        if(Math.random()<0.3) 
    	{
    		System.out.println(this.name + "가 다크사이트를 사용하여 공격을 회피했습니다!");
    		realDamage=0;
    	}
        System.out.println(this.name + "가 " + realDamage + "만큼의 피해를 입습니다!");
        this.hp-=realDamage;
    }
 }
    

package TeamProject;
import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected int hp;
    protected int mp;
    protected double power;
    protected double def;
    protected int point; //플레이어 포인트(레벨)
    protected int m_hp; //최대 hp
    protected int m_mp; //최대 mp
    protected Weapon w;
    //
    protected int time; //버프스킬 사용할때 남은 시간(턴) 초기값 -1 (0일때는 버프해제시켜주는 메서드 구현)
    protected boolean isUser;
    protected String skillName;
    protected int skillMP;
    //
    protected int skipTurn;
    //
    protected Player enemy;
    

    public Player(int point, boolean user) {
    	this.point = point;
    	this.time=-1; 
    	this.isUser = user;
    	this.skipTurn = 0;
    	this.enemy=null;
    	}
    
    public abstract void buff();
    public abstract void buffRelease();
    public abstract void attackted(int damage);
    
    public void setEnemy(Player e) {
    	this.enemy=e;
    }
    //public void setEnemy(Player e, double power, double def) {
    // this.enemy= e;
    //  this.power = power;
    //  this.def = def;
    // }
    //private으로 유지한다면
    
    public Player getEnemy() {
    	return this.enemy;
    }
    
    public boolean checkTurn() {
    	if(skipTurn>0) {
    		this.skipTurn--;
    		System.out.println(this.name+" 은 행동 불능 상태입니다!");
    		return false;
    	}
    	return true;
    }
    
    public void attack(Player p)
    {
		if(this.time==0) buffRelease(); //버프해제
    	if(!this.isUser) //플레이어가 컴퓨터고 HP,MP가 낮으면 물약먹기
    	{

			if((double)this.hp/this.m_hp <= 0.3) { drinkHPpotion(); this.time--; return;}
			else if((double)this.mp/this.m_mp <= 0.3) { drinkMPpotion(); this.time--; return;}
    	}
    	if(this.time<=0) //버프스킬 사용할지 물어보기
    	{
    		if(this.isUser) showUser();
    		else buff();
    	}
    	w.attack(p); //공격스킬
    	this.time--;
    }
    
    public void showUser() 
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("MP" + this.skillMP + "을 사용하여 " + this.skillName + "를(을) 사용하시겠습니까? (1.예 2.아니요)");
       	if(input.nextInt()==1)
    	{
        	if(this.mp<this.skillMP) 
        	{
        		System.out.println("MP가 부족합니다!!");
        		return;
        	}
        	else buff();
    	}
    }
    public void showCondition()
    {
    	System.out.println("=====<삼태>=====");
    	System.out.println(" name: " + this.name);
    	System.out.println("maxhp: " + this.m_hp);
    	System.out.println("maxmp: " + this.m_mp);
    	System.out.println("   hp: " + this.hp);
    	System.out.println("   mp: " + this.mp);
    	System.out.println("power: " + this.power);
    	System.out.println("  def: " + this.def);
    	System.out.println("point: " + this.point);
    	System.out.println("bufftime: " + this.time);
    	System.out.println("==============");
    	
    }

    public void drinkHPpotion()
    {
    	System.out.println(this.name + "이(가) HP물약을 사용합니다! HP의 50%가 회복됩니다."); 
    	System.out.print("현재hp: " + this.hp);
    	this.hp = Math.min(m_hp, (int)(this.m_hp*0.5) + this.hp);
    	if(time==0) buffRelease();
    	time--;
    	System.out.println(" -> " + this.hp);
    
    }

    public void drinkMPpotion()
    {
    	System.out.println(this.name + "이(가) MP물약을 사용합니다! MP의 50%가 회복됩니다."); 
    	System.out.print("현재mp: " + this.mp);
    	this.mp = Math.min(m_mp, (int)(this.m_mp*0.5) + this.mp);
    	if(time==0) buffRelease();
       	time--;
    	System.out.println(" -> " + this.mp);
    }

    public void addStats(){
    }
    
    
    public String getName() {return this.name;}
    public boolean getIsUser() {return this.isUser;}
    public int getPoint() {return this.point;}
    public double getPower() {return this.power;}
    public double getDef() {return this.def;}
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
}

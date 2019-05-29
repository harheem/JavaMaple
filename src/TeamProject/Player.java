package TeamProject;
import java.util.Scanner;

public abstract class Player {
    protected String name;
    protected int hp;
    protected int mp;
    protected double power;
    protected double def;
    protected int point; //�÷��̾� ����Ʈ(����)
    protected int m_hp; //�ִ� hp
    protected int m_mp; //�ִ� mp
    protected Weapon w;
    //
    protected int time; //������ų ����Ҷ� ���� �ð�(��) �ʱⰪ -1 (0�϶��� �������������ִ� �޼��� ����)
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
    //private���� �����Ѵٸ�
    
    public Player getEnemy() {
    	return this.enemy;
    }
    
    public boolean checkTurn() {
    	if(skipTurn>0) {
    		this.skipTurn--;
    		System.out.println(this.name+" �� �ൿ �Ҵ� �����Դϴ�!");
    		return false;
    	}
    	return true;
    }
    
    public void attack(Player p)
    {
		if(this.time==0) buffRelease(); //��������
    	if(!this.isUser) //�÷��̾ ��ǻ�Ͱ� HP,MP�� ������ ����Ա�
    	{

			if((double)this.hp/this.m_hp <= 0.3) { drinkHPpotion(); this.time--; return;}
			else if((double)this.mp/this.m_mp <= 0.3) { drinkMPpotion(); this.time--; return;}
    	}
    	if(this.time<=0) //������ų ������� �����
    	{
    		if(this.isUser) showUser();
    		else buff();
    	}
    	w.attack(p); //���ݽ�ų
    	this.time--;
    }
    
    public void showUser() 
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("MP" + this.skillMP + "�� ����Ͽ� " + this.skillName + "��(��) ����Ͻðڽ��ϱ�? (1.�� 2.�ƴϿ�)");
       	if(input.nextInt()==1)
    	{
        	if(this.mp<this.skillMP) 
        	{
        		System.out.println("MP�� �����մϴ�!!");
        		return;
        	}
        	else buff();
    	}
    }
    public void showCondition()
    {
    	System.out.println("=====<����>=====");
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
    	System.out.println(this.name + "��(��) HP������ ����մϴ�! HP�� 50%�� ȸ���˴ϴ�."); 
    	System.out.print("����hp: " + this.hp);
    	this.hp = Math.min(m_hp, (int)(this.m_hp*0.5) + this.hp);
    	if(time==0) buffRelease();
    	time--;
    	System.out.println(" -> " + this.hp);
    
    }

    public void drinkMPpotion()
    {
    	System.out.println(this.name + "��(��) MP������ ����մϴ�! MP�� 50%�� ȸ���˴ϴ�."); 
    	System.out.print("����mp: " + this.mp);
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

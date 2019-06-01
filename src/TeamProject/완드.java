package TeamProject;
//불독
public class 완드  extends Weapon{
	private int dot;
	private final int DOTDAMAGE = 100;
	public 완드(Player p)
	{
		super(p);
		this.weaponConstant = 1.1;
		this.name = new String[] {"우드완드","위저드완드","드래곤완드"};
		this.skillName = new String[] {"페럴라이즈", "메테오"};
		this.skillMP = new int[] {50,150};
	}
    public void attack(Player p)
    {
       if(owner.getIsUser()) showUser();
       else //상대는 (스킬2 스킬1 기본공격) 을 우선으로 사용
       {
    	   if(skill2())
    		   if(skill1())
    			   basicAttack();
       }
       int damage = (int) (((double)owner.getPoint()*0.1 + 1) * owner.getPower() * weaponConstant * (Math.random()/4 + 0.75) * skillPoint);
       
       if(dot>0) damage +=DOTDAMAGE;
       
       System.out.print(owner.getName() + "이(가) " + name[owner.getPoint()/3] + "울(를) 사용하여 ");
       if(this.skillPoint==1) System.out.print("기본공격으로 ");
       else System.out.print(skillName[skillNum] + "(으)로 ");
       System.out.println(p.getName() + "에게 " + damage + "만큼 공격합니다 !");
       p.attackted(damage);
       ct--;
       dot--;
    }
    public int getDot() {return this.dot;}
    public void minusDot() {this.dot-=1;}
    public int getDotDamage() {return DOTDAMAGE;}
	protected void setSkill1(Player owner) 
	{
		if(dot<=0) dot=3;
		this.skillPoint = 1.2;
	}
	protected void setSkill2(Player owner) 
	{
		if(dot<=0) dot=3;
		this.skillPoint = 1.8;
	}
}

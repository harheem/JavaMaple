package TeamProject;
//�ҵ�
public class �ϵ�  extends Weapon{
	private int dot;
	private final int DOTDAMAGE = 100;
	public �ϵ�(Player p)
	{
		super(p);
		this.weaponConstant = 1.1;
		this.name = new String[] {"���ϵ�","������ϵ�","�巡��ϵ�"};
		this.skillName = new String[] {"�䷲������", "���׿�"};
		this.skillMP = new int[] {50,150};
	}
    public void attack(Player p)
    {
       if(owner.getIsUser()) showUser();
       else //���� (��ų2 ��ų1 �⺻����) �� �켱���� ���
       {
    	   if(skill2())
    		   if(skill1())
    			   basicAttack();
       }
       int damage = (int) (((double)owner.getPoint()*0.1 + 1) * owner.getPower() * weaponConstant * (Math.random()/4 + 0.75) * skillPoint);
       
       if(dot>0) damage +=DOTDAMAGE;
       
       System.out.print(owner.getName() + "��(��) " + name[owner.getPoint()/3] + "��(��) ����Ͽ� ");
       if(this.skillPoint==1) System.out.print("�⺻�������� ");
       else System.out.print(skillName[skillNum] + "(��)�� ");
       System.out.println(p.getName() + "���� " + damage + "��ŭ �����մϴ� !");
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

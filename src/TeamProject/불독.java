package TeamProject;
public class �ҵ� extends ������ {
	private Player opponent;
	public �ҵ�(int point, boolean user)
	{
		super(point,user);
		this.name = "�ҵ�";
		this.w = new �ϵ�(this);
	}
    public void attack(Player p) //��Ʈ������ �����ϱ� ���� ���� �������̵�
    {
    	this.opponent = p;
    	if(!this.isUser)
    	{
			if((double)this.hp/this.m_hp <= 0.3) { drinkHPpotion(); this.time--; dot(p); return;}
			else if((double)this.mp/this.m_mp <= 0.3) { drinkMPpotion(); this.time--; dot(p); return;}
    	}
    	if(this.time<=0) 
    	{
    		if(this.time==0) buffRelease();
    		if(this.isUser) showUser();
    		else buff();
    	}
    	w.attack(p);
    	this.time--;
    }
    public void drinkHPpotion()
    {
    	super.drinkHPpotion();
    	if(((�ϵ�)this.w).getDot()>0) dot(opponent);
    }
    public void drinkMPpotion()
    {
    	super.drinkMPpotion();
    	if(((�ϵ�)this.w).getDot()>0) dot(opponent);
    }
    private void dot(Player p)
    {
    	if(((�ϵ�)this.w).getDot()>0) System.out.println(p.getName() + "��(��) �ҿ� Ÿ " + ((�ϵ�)w).getDotDamage() + "��ŭ ���ظ� �Խ��ϴ�!");
    	p.setHp(p.getHp()-((�ϵ�)w).getDotDamage());
    	((�ϵ�)this.w).minusDot();
    }
}

package TeamProject;
public class �ҵ� extends ������ {
	public �ҵ�(int point, boolean user)
	{
		super(point,user);
		this.name = "�ҵ�";
		this.w = new �ϵ�(this);
	}
    public void attack(Player p) //��Ʈ������ �����ϱ� ���� ���� �������̵�
    {
    	this.enemy = p;
    	if(!this.isUser)
    	{
			if((double)this.hp/this.m_hp <= 0.3) { if(drinkHPpotion()) { this.time--; dot(p); return;}}
			else if((double)this.mp/this.m_mp <= 0.3) { if(drinkMPpotion()) {this.time--; dot(p); return;}}
    	}
    	w.attack(p);
    	this.time--;
    	this.hpPotionCooltime--;
    	this.mpPotionCooltime--;
    }
    public boolean drinkHPpotion()
    {
    	boolean rt = super.drinkHPpotion();
    	if(rt==true) if(((�ϵ�)this.w).getDot()>0) dot(enemy);
    	return rt;
    }
    public boolean drinkMPpotion()
    {
    	boolean rt = super.drinkMPpotion();
    	if(rt==true) if(((�ϵ�)this.w).getDot()>0) dot(enemy);
    	return rt;
    }
    private void dot(Player p)
    {
    	if(((�ϵ�)this.w).getDot()>0) System.out.println(p.getName() + "��(��) �ҿ� Ÿ " + ((�ϵ�)w).getDotDamage() + "��ŭ ���ظ� �Խ��ϴ�!");
    	p.setHp(p.getHp()-((�ϵ�)w).getDotDamage());
    	((�ϵ�)this.w).minusDot();
    }
}

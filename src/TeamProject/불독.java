package TeamProject;
public class 불독 extends 마법사 {
	private Player opponent;
	public 불독(int point, boolean user)
	{
		super(point,user);
		this.name = "불독";
		this.w = new 완드(this);
	}
    public void attack(Player p) //도트데미지 구현하기 위해 따로 오버라이딩
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
    	if(((완드)this.w).getDot()>0) dot(opponent);
    }
    public void drinkMPpotion()
    {
    	super.drinkMPpotion();
    	if(((완드)this.w).getDot()>0) dot(opponent);
    }
    private void dot(Player p)
    {
    	if(((완드)this.w).getDot()>0) System.out.println(p.getName() + "이(가) 불에 타 " + ((완드)w).getDotDamage() + "만큼 피해를 입습니다!");
    	p.setHp(p.getHp()-((완드)w).getDotDamage());
    	((완드)this.w).minusDot();
    }
}

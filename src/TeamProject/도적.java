package TeamProject;
public abstract class 도적 extends Player {
	public 도적(int point, boolean user)
	{
		super(point,user);
		this.m_hp = 150;
		this.m_mp = 150;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.skillName = "다크사이트";
		this.skillMP = 50;
	}
    public void buff() {}
    public void buffRelease() {}
    public void attackted(int damage) {}
}

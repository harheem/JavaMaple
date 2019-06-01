package TeamProject;
//팔라딘
public class 두손검 extends Weapon {

	public 두손검(Player p)
	{
		super(p);
		this.weaponConstant = 1.20;
		this.name = new String[] {"목검","왕푸","라투핸더"};
		this.skillName = new String[] {"블래스트", "디바인 차지"};
		this.skillMP = new int[] {20,60};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

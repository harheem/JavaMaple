package TeamProject;
//다크나이트
public class 창 extends Weapon {

	public 창(Player p)
	{
		super(p);
		this.weaponConstant = 1.49;
		this.name = new String[] {"죽창","장팔사모","피나카"};
		this.skillName = new String[] {"다크임페일", "궁그닐 디센트"};
		this.skillMP = new int[] {20,70};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint = 1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint = 1.8;
	}
}

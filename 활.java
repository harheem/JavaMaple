package TeamProject;
//보우마스터
public class 활 extends Weapon {

	public 활(Player p)
	{
		super(p);
		this.weaponConstant = 1.3;
		this.name = new String[] {"워 보우","올림푸스","메투스"};
		this.skillName = new String[] {"언카운터블 애로우", "애로우 플래터"};
		this.skillMP = new int[] {30,80};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

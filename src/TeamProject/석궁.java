package TeamProject;
//½Å±Ã
public class ¼®±Ã extends Weapon {
	public ¼®±Ã(Player p)
	{
		super(p);
		this.weaponConstant = 1.30;
		this.name = new String[] {"¼®±Ã","ÀÌ±ÛÅ©·Î","°ñµç ³×½¦¸£"};
		this.skillName = new String[] {"ÇÇ¾î½Ì","½º³ªÀÌÇÎ"};
		this.skillMP = new int[] {30,90};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

package TeamProject;
//´ÙÅ©³ªÀÌÆ®
public class Ã¢ extends Weapon {

	public Ã¢(Player p)
	{
		super(p);
		this.weaponConstant = 1.49;
		this.name = new String[] {"Á×Ã¢","ÀåÆÈ»ç¸ð","ÇÇ³ªÄ«"};
		this.skillName = new String[] {"´ÙÅ©ÀÓÆäÀÏ", "±Ã±×´Ò µð¼¾Æ®"};
		this.skillMP = new int[] {20,70};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint = 1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint = 1.8;
	}
}

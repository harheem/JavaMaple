package TeamProject;
//나이트로드
public class 아대 extends Weapon {

	public 아대(Player p)
	{
		super(p);
		this.weaponConstant = 1.75;
		this.name = new String[] {"가니어","스틸가즈","레드크리븐"};
		this.skillName = new String[] {"쿼드러플스로우", "써든레이드"};
		this.skillMP = new int[] {30,80};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
}

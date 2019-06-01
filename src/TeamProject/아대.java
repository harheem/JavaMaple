package TeamProject;
//나이트로드
public class 아대 extends Weapon {

	public 아대(Player p)
	{
		super(p);
		this.weaponConstant = 1.30;
		this.name = new String[] {"가니어","스틸가즈","레드크리븐"};
		this.skillName = new String[] {"쿼드러플스로우", "써든레이드"};
		this.skillMP = new int[] {30,90};
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
		//세번씩 때리는 이펙트가 나가면 엄청 좋겟단 생각이 드네요
		//쉐도우 파트너 쓰면 6번... 많이 때리는게 도적의 특징중에 하나라서 
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}
	   //쉐도우파트너 쓰면 2번 때리게 가능하려나 
}

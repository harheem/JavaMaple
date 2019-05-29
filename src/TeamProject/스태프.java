package TeamProject;
//썬콜
public class 스태프 extends Weapon {

	public 스태프(Player p) 
	{
		super(p);
		this.weaponConstant = 1.0;
		this.name = new String[] {"나무스태프","아크스태프","드래곤스태프"};
		this.skillName = new String[] {"콜드빔", "라이트닝 스피어"};
		this.skillMP = new int[] {50,150};
	}
	protected void setSkill1(Player owner) {//5%확률로 적을 2턴 얼림(행동불가). skipTurn+=2
		this.skillPoint=1.2;
		if(Math.random()<0.05)
			owner.getEnemy().skipTurn+=2;
	}
	protected void setSkill2(Player owner) {
		this.skillPoint=1.8;
	}

}

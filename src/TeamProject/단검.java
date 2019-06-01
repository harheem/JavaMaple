package TeamProject;
//섀도어
public class 단검 extends Weapon {
	public 단검(Player p)
	{
		super(p);
		this.weaponConstant = 1.3;
		this.name = new String[] {"후르츠대거","태극부채","블러드대거"};
		this.skillName = new String[] {"부메랑스텝","암살"};
		this.skillMP = new int[] {30,90};
		
	}
	protected void setSkill1(Player owner) {
		this.skillPoint=1.2;
	}
	protected void setSkill2(Player owner) { //암살, 5%확률로 즉사
		if(Math.random()<=0.05) {
			owner.getEnemy().setHp(0);
			System.out.println("즉사의 일격!");
			//너무사기아닌가;; 확률은 낮지만 무섭
		}
		else
			this.skillPoint=1.8;
		
	}
}

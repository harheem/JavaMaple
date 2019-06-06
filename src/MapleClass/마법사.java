package MapleClass;

public abstract class 마법사 extends Player {
	
	public 마법사() {
		this.m_hp = 500;
		this.m_mp = 1000;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 180;
    	this.def = 120;
	}
	
	public void passive(double realDamage) {
		System.out.println(this.name + "이 " + realDamage + "만큼의 피해를 입습니다!");
    	System.out.println("매직가드로 데미지의 60%를 mp로 대신합니다!!");
    	int change = (int) Math.min(realDamage*0.60, this.mp);
    	this.mp-=change;
    	this.hp-=realDamage-change;
    	System.out.println("HP피해:" + (realDamage - change));
    	System.out.println("MP피해:" + (change));
	}
	public void buffRelease() {}
	public void buffskill() {}
}

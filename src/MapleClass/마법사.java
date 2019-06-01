package MapleClass;

public abstract class 마법사 extends Player {
	
	public 마법사() {
		this.m_hp = 500;
		this.m_mp = 500;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 180;
    	this.def = 120;
	}
	
	public void passive() {
		//매직가드
	}

}

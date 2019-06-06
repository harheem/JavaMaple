package MapleClass;

import MapleWeapon.µÎ¼Õ°Ë;

public class ÆÈ¶óµò extends Àü»ç {

	public ÆÈ¶óµò() {
		this.w = new µÎ¼Õ°Ë();
		this.name = "ÆÈ¶óµò";
		this.power = 100 + w.getWpPower()[w.getWpIndex()];
		this.def = 160;
		this.buffSkillName = "À§Çù";
		this.buffSkillMp = 30; // À§Çù ¼Ò¸ðÇÒ mp
	}


	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.m_hp += point * 5;
		this.m_mp += point * 5;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.power += point * 5;
	}
	
	@Override
	public void buffskill() {
		this.def *=1.5;
		enemy.def*=0.75;
		
	}

	@Override
	public void buffRelease() {
		this.def /=1.5;
		enemy.def/=0.75;
		
	}



}

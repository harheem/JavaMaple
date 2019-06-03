package MapleClass;

import Maple.Attackable;
import Maple.Reinforcable;
import MapleWeapon.Weapon;

public abstract class Player implements Attackable, Reinforcable {
	protected String name;
	protected int hp;
	protected int mp;
	protected int def;
	protected int point = 1;
	protected int power;
	protected int m_hp;
	protected int m_mp;
	protected int buffTime;
	protected String buffSkillName;
	protected int buffSkillMp;
    protected int hpPotionCooltime;
    protected int mpPotionCooltime;
    protected Weapon w;

    public boolean drinkHPpotion()
    {
    	if(this.hpPotionCooltime<=0) this.hpPotionCooltime = 2;
    	else 
    	{
    		System.out.println("아직 HP포션을 사용할 수 없습니다! 남은 시간 : " + this.hpPotionCooltime);
    		return false;
    	}
    	System.out.println(this.name + "이(가) HP물약을 사용합니다! HP의 50%가 회복됩니다."); 
    	System.out.print("현재hp: " + this.hp);
    	this.hp = Math.min(m_hp, (int)(this.m_hp*0.5) + this.hp);
    	System.out.println(" -> " + this.hp);
    	this.mpPotionCooltime--;
    	return true;    
    }

    public boolean drinkMPpotion()
    {
    	if(this.mpPotionCooltime<=0) this.mpPotionCooltime = 2;
    	else 
    	{
    		System.out.println("아직 HP포션을 사용할 수 없습니다! 남은 시간 : " + this.mpPotionCooltime);
    		return false;
    	}
    	System.out.println(this.name + "이(가) MP물약을 사용합니다! MP의 50%가 회복됩니다."); 
    	System.out.print("현재mp: " + this.mp);
    	this.mp = Math.min(m_mp, (int)(this.m_mp*0.5) + this.mp);
    	System.out.println(" -> " + this.mp);    
    	this.hpPotionCooltime--;
    	return true;
    }

	public void attack(Player enemy) {
		w.attack(enemy);
		//if(enemy==마법사) passive(this.power - enemy.def/100);
		/*else*/ enemy.hp -= (this.power - enemy.def/100);
		System.out.println("가한 데미지 : " + (this.power - enemy.def/100));
		System.out.println("적 남은 체력 :" +enemy.hp);
	}

	public void skillAttack(Player enemy, int skillNum) {
		System.out.println(this.name + "의 " + w.getSkillName()[skillNum] + "!");
		int damage = (this.power*(w.getSkillPower()[skillNum]/10) - enemy.def/100);
		//if(enemy==마법사) passive(this.power - enemy.def/100);
		/*else*/ enemy.hp -= damage;
		System.out.println("가한 데미지 : " + damage);
		System.out.println("적 남은 체력 :" +enemy.hp);
	}
	public void passive(int realDamage) {
		//마법사 메서드에서만 오버라이딩
	}
	public abstract void reinforce();
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getM_hp() {
		return m_hp;
	}

	public void setM_hp(int m_hp) {
		this.m_hp = m_hp;
	}

	public int getM_mp() {
		return m_mp;
	}

	public void setM_mp(int m_mp) {
		this.m_mp = m_mp;
	}

	public int getBuffTime() {
		return buffTime;
	}

	public void setBuffTime(int buffTime) {
		this.buffTime = buffTime;
	}

	public String getBuffSkillName() {
		return buffSkillName;
	}

	public void setBuffSkillName(String buffSkillName) {
		this.buffSkillName = buffSkillName;
	}

	public int getBuffSkillMp() {
		return buffSkillMp;
	}

	public void setBuffSkillMp(int buffSkillMp) {
		this.buffSkillMp = buffSkillMp;
	}

	public int getHpPotionCooltime() {
		return hpPotionCooltime;
	}

	public void setHpPotionCooltime(int hpPotionCooltime) {
		this.hpPotionCooltime = hpPotionCooltime;
	}

	public int getMpPotionCooltime() {
		return mpPotionCooltime;
	}

	public void setMpPotionCooltime(int mpPotionCooltime) {
		this.mpPotionCooltime = mpPotionCooltime;
	}

}

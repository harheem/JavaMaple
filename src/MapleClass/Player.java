package MapleClass;

import java.util.ArrayList;

import Maple.Attackable;
import Maple.Buffable;
import Maple.Reinforcable;
import MapleWeapon.Weapon;

public abstract class Player implements Attackable, Reinforcable, Buffable{
	protected String name;
	protected int hp;
	protected int mp;
	protected double def;
	protected int point = 1;
	protected double power;
	protected int m_hp;
	protected int m_mp;
	protected int buffTime;
	protected String buffSkillName;
	protected int buffSkillMp;
    protected Player enemy;
    protected Weapon w;
    protected ArrayList<String> imageIcon = new ArrayList<String>();
    //플레이어이미지 1.나, 2.상대, 미니플레이어 3.나, 4.상대
    public Player()
    {
    }
    public void drinkHPpotion()
    
    {
    	System.out.println(this.name + "이(가) HP물약을 사용합니다! HP의 50%가 회복됩니다."); 
    	System.out.print("현재hp: " + this.hp);
    	this.hp = Math.min(m_hp, (int)(this.m_hp*0.5) + this.hp);
    	System.out.println(" -> " + this.hp);
    }

    public void drinkMPpotion()
    {

    	System.out.println(this.name + "이(가) MP물약을 사용합니다! MP의 50%가 회복됩니다."); 
    	System.out.print("현재mp: " + this.mp);
    	this.mp = Math.min(m_mp, (int)(this.m_mp*0.5) + this.mp);
    	System.out.println(" -> " + this.mp);    
    }

    public void attack() {}
	public void skillAttack(int skillNum) {
		System.out.println(this.name + "의 " + w.getSkillName()[skillNum] + "!");
		int damage = (int)(((this.power*(w.getSkillPower()[skillNum]/10)) / (enemy.def/100) *(0.75+Math.random()/2)));
		if(enemy instanceof 마법사) enemy.passive(damage);
		else enemy.hp -= damage;
		enemy.hp = Math.max(enemy.hp, 0);
		this.mp-=  w.getSkillMP()[skillNum];
		System.out.println("가한 데미지 : " + damage);
		System.out.println("적 남은 체력 :" +Math.max(0,enemy.hp));
		this.buffTime--;
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

	public double getDef() {
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

	public double getPower() {
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

	public Player getEnemy() {
		return enemy;
	}

	public void setEnemy(Player enemy) {
		this.enemy = enemy;
	}
	public abstract void buffskill();
	public abstract void buffRelease();
	public Weapon getW() {
		return w;
	}
	public ArrayList<String> getImageIcon() {
		return imageIcon;
	}
	public void setImageIcon(ArrayList<String> imageIcon) {
		this.imageIcon = imageIcon;
	}
}

package MapleWeapon;

import Maple.Attackable;
import Maple.Reinforcable;
import MapleClass.Player;

public abstract class Weapon implements Attackable, Reinforcable {
	protected String[] wpName;
	protected String[] skillName;
	protected int[] wpPower;
	protected int[] skillMP;
	protected int skillNum;
	protected int wpIndex = 0;
	protected int[] skillPower;

	@Override
	public void attack() {
		System.out.println(this.getWpName()[this.wpIndex] + "(으)로 적에게 공격합니다.");
	}

	@Override
	public void reinforce() {
		System.out.println(wpName[wpIndex - 1] + " -> " + wpName[wpIndex]);
		System.out.println(wpPower[wpIndex - 1] + " -> " + wpPower[wpIndex]);
	}

	public String[] getWpName() {
		return wpName;
	}

	public void setWpName(String[] wpName) {
		this.wpName = wpName;
	}

	public String[] getSkillName() {
		return skillName;
	}

	public void setSkillName(String[] skillName) {
		this.skillName = skillName;
	}

	public int[] getWpPower() {
		return wpPower;
	}

	public void setWpPower(int[] wpPower) {
		this.wpPower = wpPower;
	}

	public int[] getSkillMP() {
		return skillMP;
	}

	public void setSkillMP(int[] skillMP) {
		this.skillMP = skillMP;
	}

	public int getSkillNum() {
		return skillNum;
	}

	public void setSkillNum(int skillNum) {
		this.skillNum = skillNum;
	}

	public int getWpIndex() {
		return wpIndex;
	}

	public void setWpIndex(int wpIndex) {

		this.wpIndex = wpIndex;
	}
	

	public int[] getSkillPower() {

		return skillPower;
	}
	

	public void setSkillPower(int[] skillPower) {
		this.skillPower = skillPower;
	}

}

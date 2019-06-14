package MapleWeapon;

import java.util.ArrayList;

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
    protected ArrayList<String> wpIcon = new ArrayList<String>(); 	//�÷��̾��� ���� ������ 3��
    protected ArrayList<String> skillIcon = new ArrayList<String>(); 	//��ų������ 2�� ���������� 1��
    protected ArrayList<String> skillEffect = new ArrayList<String>();	//��ų����Ʈ 2�� ��������Ʈ 1�� ��벨���� �ؼ� �� 6��
    protected ArrayList<String> skillExplanation = new ArrayList<String>();
    
    
	@Override
	public void attack() {
		System.out.println(this.getWpName()[this.wpIndex] + "(��)�� ������ �����մϴ�.");
	}

	@Override
	public void reinforce() {
		System.out.println(wpName[wpIndex - 1] + " -> " + wpName[wpIndex]);
		System.out.println(wpPower[wpIndex - 1] + " -> " + wpPower[wpIndex]);
	}

	public ArrayList<String> getWpIcon() {
		return wpIcon;
	}

	public void setWpIcon(ArrayList<String> wpIcon) {
		this.wpIcon = wpIcon;
	}

	public ArrayList<String> getSkillIcon() {
		return skillIcon;
	}

	public void setSkillIcon(ArrayList<String> skillIcon) {
		this.skillIcon = skillIcon;
	}

	public ArrayList<String> getSkillEffect() {
		return skillEffect;
	}

	public void setSkillEffect(ArrayList<String> skillEffect) {
		this.skillEffect = skillEffect;
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

	public ArrayList<String> getSkillExplanation() {
		return skillExplanation;
	}

}

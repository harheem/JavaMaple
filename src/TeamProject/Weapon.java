package TeamProject;
import java.util.Scanner;

public abstract class Weapon implements Attackable {
	protected double weaponConstant;
	protected Player owner; // 소유자
	protected String[] name;
	protected String[] skillName;
	protected int[] skillMP;
	protected double skillPoint;
	protected int skillNum;
	protected int ct; // 쿨타임

	public Weapon(Player p) {
		this.owner = p;
	}

	public void attack(Player p) {
		if (owner.getIsUser())
			showUser();
		else // 컴퓨터 플레이어는 (스킬2 ->스킬1 ->기본공격) 우선순위로 사용
		{
			if (!skill2())
				if (!skill1())
					basicAttack();
		}
		int damage = (int) (((double) owner.getPoint() * 0.1 + 1) * owner.getPower() * weaponConstant
				* (Math.random() / 4 + 0.75) * skillPoint);
		System.out.print(owner.getName() + "이(가) " + name[owner.getPoint() / 3] + "울(를) 사용하여 ");
		if (this.skillPoint == 1)
			System.out.print("기본공격으로 ");
		else
			System.out.print(skillName[skillNum] + "(으)로 ");
		System.out.println(p.getName() + "에게 " + damage + "만큼 공격합니다 !");
		p.attackted(damage);
		ct--;

		System.out.println(owner.getName() + "의 스킬포인트 : " + skillPoint);
	}

	public void basicAttack() {
		this.skillPoint = 1;
	}

	public void showUser() {
		int menu;
		Scanner input = new Scanner(System.in);
		System.out.println("사용할 스킬을 선택해주세요!");
		System.out.println("1.기본공격");
		System.out.println("2." + skillName[0] + "(mp" + skillMP[0] + "소모)");
		System.out.println("3." + skillName[1] + "(mp" + skillMP[1] + "소모)");
		menu = input.nextInt();
		if (menu == 3) {
			if (skill2())
				return;
			else if (ct > 0)
				System.out.println("아직 쿨타임입니다!");
			else
				System.out.println("mp가 부족합니다!");
		} else if (menu == 2) {
			if (!skill1())
				System.out.println("mp가 부족합니다!");
			else
				return;
		}
		basicAttack();
	}

	public boolean skill1() {
		if (owner.getMp() < skillMP[0])
			return false;
		this.skillNum = 0;
		owner.setMp(owner.getMp() - skillMP[0]);
		setSkill1(owner);
		return true;
	}

	public boolean skill2() {
		if (owner.getMp() < skillMP[1] || ct > 0)
			return false;
		owner.setMp(owner.getMp() - skillMP[1]);
		this.skillNum = 1;
		this.ct = 3;
		setSkill2(owner);
		return true;
	}

	protected abstract void setSkill1(Player owner);

	protected abstract void setSkill2(Player owner);
}

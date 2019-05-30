package TeamProject;
import java.util.Scanner;

public abstract class Weapon implements Attackable {
	protected double weaponConstant;
	protected Player owner; // ������
	protected String[] name;
	protected String[] skillName;
	protected int[] skillMP;
	protected double skillPoint;
	protected int skillNum;
	protected int ct; // ��Ÿ��

	public Weapon(Player p) {
		this.owner = p;
	}

	public void attack(Player p) {
		if (owner.getIsUser())
			showUser();
		else // ��ǻ�� �÷��̾�� (��ų2 ->��ų1 ->�⺻����) �켱������ ���
		{
			if (!skill2())
				if (!skill1())
					basicAttack();
		}
		int damage = (int) (((double) owner.getPoint() * 0.1 + 1) * owner.getPower() * weaponConstant
				* (Math.random() / 4 + 0.75) * skillPoint);
		System.out.print(owner.getName() + "��(��) " + name[owner.getPoint() / 3] + "��(��) ����Ͽ� ");
		if (this.skillPoint == 1)
			System.out.print("�⺻�������� ");
		else
			System.out.print(skillName[skillNum] + "(��)�� ");
		System.out.println(p.getName() + "���� " + damage + "��ŭ �����մϴ� !");
		p.attackted(damage);
		ct--;

		System.out.println(owner.getName() + "�� ��ų����Ʈ : " + skillPoint);
	}

	public void basicAttack() {
		this.skillPoint = 1;
	}

	public void showUser() {
		int menu;
		Scanner input = new Scanner(System.in);
		System.out.println("����� ��ų�� �������ּ���!");
		System.out.println("1.�⺻����");
		System.out.println("2." + skillName[0] + "(mp" + skillMP[0] + "�Ҹ�)");
		System.out.println("3." + skillName[1] + "(mp" + skillMP[1] + "�Ҹ�)");
		menu = input.nextInt();
		if (menu == 3) {
			if (skill2())
				return;
			else if (ct > 0)
				System.out.println("���� ��Ÿ���Դϴ�!");
			else
				System.out.println("mp�� �����մϴ�!");
		} else if (menu == 2) {
			if (!skill1())
				System.out.println("mp�� �����մϴ�!");
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

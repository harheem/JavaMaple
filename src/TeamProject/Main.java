package TeamProject;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int userNum; //������ ���� ���� ��ȣ, ���������� �ö󰡸� ��ü�� ������ϱ� ����
		int stage = 1; //���������� �ö󰡸鼭 ���� �÷��̾�����Ʈ�� 1�� �����մϴ�.
		Player user;
		Player enemy;
		Scanner input = new Scanner(System.in);
		userNum = showChoose();
		user = choosePlayer(userNum,5,true);
		System.out.println(user.getName() + "��(��) ���õǾ����ϴ�!");
		
		Loop1: while(true) //���� ����
		{
				System.out.println(stage + "�ܰ踦 �����մϴ�!!");
				enemy = choosePlayer(r.nextInt(7)+1,stage++,false);
				user.setEnemy(enemy);
				enemy.setEnemy(user);
		
				Loop2: while(user.checkTurn()) //�������� ����
				{
				showMenu();
				switch(input.nextInt())
				{
				case 1: user.attack(enemy); break;
				case 2: user.showCondition(); continue Loop2; 
				case 3: if(user.drinkHPpotion()) break; else continue Loop2;
				case 4: if(user.drinkMPpotion()) break; else continue Loop2;
				default:  break Loop1;
				}
				if(enemy.getHp()<0) 
				{
					System.out.println("���� ����Ͽ����ϴ�. �¸��Դϴ�!! �����ܰ�� �̵��մϴ�. ���� hp: " + enemy.getHp());
					user = choosePlayer(userNum,5,true);
					break Loop2;
					}
				System.out.println("����� ���������Դϴ�!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(enemy.checkTurn())
				enemy.attack(user);
				if(user.getHp()<0)
				{
					System.out.println("�÷��̾ ����Ͽ����ϴ�. �й��Դϴ�!! �÷��̾���hp: " + user.getHp());
					break Loop1;
				}
			}
		}
		System.out.println("���α׷��� �����մϴ�!!");
		input.close();
	}
	public static void showMenu()
	{
		System.out.println("=====menu======");
		System.out.println("1.�����ϱ�");
		System.out.println("2.���º���");
		System.out.println("3.hp����Ա�");
		System.out.println("4.mp����Ա�");
		System.out.println("5.����");
		System.out.println("==============");
	}
	public static int showChoose() //�÷��̾� ����ȭ�� ���̱�
	{
		Scanner input = new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("�÷��̾ �������ּ���!!");
			System.out.println("============");
			System.out.println("1.��ũ����Ʈ");
			System.out.println("2.�ȶ��");
			System.out.println("3.����");
			System.out.println("4.�ҵ�");
			System.out.println("5.���츶����");
			System.out.println("6.�ű�");
			System.out.println("7.����Ʈ�ε�");
			System.out.println("8.������");
			System.out.println("============");
			choice = input.nextInt();
			if(choice<1 || choice>8) System.out.println("1~8�� ���ڸ� �Է��� �ּ���!!");
			else break;
		}
		return choice;
	}
	public static Player choosePlayer(int choiceNum, int playerPoint, boolean isPlayer) //��ȣ�� �´� �÷��̾ ����
	{
		Player rt;
		switch(choiceNum)
		{
		case 1: rt = new ��ũ����Ʈ(playerPoint, isPlayer); break;
		case 2: rt = new �ȶ��(playerPoint, isPlayer); break;
		case 3: rt = new ����(playerPoint, isPlayer); break;
		case 4: rt = new �ҵ�(playerPoint, isPlayer); break;
		case 5: rt = new ���츶����(playerPoint, isPlayer); break;
		case 6: rt = new �ű�(playerPoint, isPlayer); break;
		case 7: rt = new ����Ʈ�ε�(playerPoint, isPlayer); break;
		case 8: rt = new ������(playerPoint, isPlayer); break;
		default: System.out.println("�߸��� �����Դϴ�!!"); return null;
		}
		
		if(isPlayer==false) System.out.println("���� " + rt.getName() + "�Դϴ�!");
		return rt;
	}
}

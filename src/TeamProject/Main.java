package TeamProject;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Player a = new ��ũ����Ʈ(1,false);
		Player b = new �ȶ��(1,true);
		Player c = new �ҵ�(1,true);
		Player d = new ����(1,true);
		Player e = new ���츶����(1,true);
		Player f = new �ű�(3,true);
		Player g = new ����Ʈ�ε�(1,true);
		Player h = new ������(1,true);
		
		Scanner input = new Scanner(System.in);
		
		Player play;
		play = b;
		Player enem;
		enem = a;
		play.setEnemy(enem);
		enem.setEnemy(play);
		
		Loop: while(play.checkTurn())
		{
			showMenu();
			switch(input.nextInt())
			{
			case 1: play.attack(a); break;
			//�ڹ��� �߰�, �����ϱ⿡ ��ų�� ����ϰ���?
			case 2: play.buff(); break;
			case 3: play.showCondition(); break;
			case 4: play.drinkHPpotion(); break;
			case 5: play.drinkMPpotion(); break;
			default:  break Loop;
			}
			while(enem.checkTurn())
				enem.attack(play);
		}
	}
	public static void showMenu()
	{
		System.out.println("1.�����ϱ�");
		System.out.println("2.��������ϱ�");
		System.out.println("3.���º���");
		System.out.println("4.hp����Ա�");
		System.out.println("5.mp����Ա�");
		System.out.println("6.����");
	}
}

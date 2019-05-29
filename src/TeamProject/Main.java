package TeamProject;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Player a = new 다크나이트(1,false);
		Player b = new 팔라딘(1,true);
		Player c = new 불독(1,true);
		Player d = new 썬콜(1,true);
		Player e = new 보우마스터(1,true);
		Player f = new 신궁(3,true);
		Player g = new 나이트로드(1,true);
		Player h = new 섀도어(1,true);
		
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
			//자버프 추가, 공격하기에 스킬을 사용하겟죠?
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
		System.out.println("1.공격하기");
		System.out.println("2.버프사용하기");
		System.out.println("3.상태보기");
		System.out.println("4.hp물약먹기");
		System.out.println("5.mp물약먹기");
		System.out.println("6.종료");
	}
}

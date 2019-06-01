package TeamProject;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		int userNum; //유저의 직업 선택 번호, 스테이지가 올라가면 객체를 재생성하기 위해
		int stage = 1; //스테이지가 올라가면서 적의 플레이어포인트가 1씩 증가합니다.
		Player user;
		Player enemy;
		Scanner input = new Scanner(System.in);
		userNum = showChoose();
		user = choosePlayer(userNum,5,true);
		System.out.println(user.getName() + "가(이) 선택되었습니다!");
		
		Loop1: while(true) //게임 진행
		{
				System.out.println(stage + "단계를 진행합니다!!");
				enemy = choosePlayer(r.nextInt(7)+1,stage++,false);
				user.setEnemy(enemy);
				enemy.setEnemy(user);
		
				Loop2: while(user.checkTurn()) //스테이지 진행
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
					System.out.println("적이 사망하였습니다. 승리입니다!! 다음단계로 이동합니다. 적의 hp: " + enemy.getHp());
					user = choosePlayer(userNum,5,true);
					break Loop2;
					}
				System.out.println("상대의 공격차례입니다!");
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
					System.out.println("플레이어가 사망하였습니다. 패배입니다!! 플레이어의hp: " + user.getHp());
					break Loop1;
				}
			}
		}
		System.out.println("프로그램을 종료합니다!!");
		input.close();
	}
	public static void showMenu()
	{
		System.out.println("=====menu======");
		System.out.println("1.공격하기");
		System.out.println("2.상태보기");
		System.out.println("3.hp물약먹기");
		System.out.println("4.mp물약먹기");
		System.out.println("5.종료");
		System.out.println("==============");
	}
	public static int showChoose() //플레이어 선택화면 보이기
	{
		Scanner input = new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("플레이어를 선택해주세요!!");
			System.out.println("============");
			System.out.println("1.다크나이트");
			System.out.println("2.팔라딘");
			System.out.println("3.썬콜");
			System.out.println("4.불독");
			System.out.println("5.보우마스터");
			System.out.println("6.신궁");
			System.out.println("7.나이트로드");
			System.out.println("8.섀도어");
			System.out.println("============");
			choice = input.nextInt();
			if(choice<1 || choice>8) System.out.println("1~8의 숫자를 입력해 주세요!!");
			else break;
		}
		return choice;
	}
	public static Player choosePlayer(int choiceNum, int playerPoint, boolean isPlayer) //번호에 맞는 플레이어를 생성
	{
		Player rt;
		switch(choiceNum)
		{
		case 1: rt = new 다크나이트(playerPoint, isPlayer); break;
		case 2: rt = new 팔라딘(playerPoint, isPlayer); break;
		case 3: rt = new 썬콜(playerPoint, isPlayer); break;
		case 4: rt = new 불독(playerPoint, isPlayer); break;
		case 5: rt = new 보우마스터(playerPoint, isPlayer); break;
		case 6: rt = new 신궁(playerPoint, isPlayer); break;
		case 7: rt = new 나이트로드(playerPoint, isPlayer); break;
		case 8: rt = new 섀도어(playerPoint, isPlayer); break;
		default: System.out.println("잘못된 선택입니다!!"); return null;
		}
		
		if(isPlayer==false) System.out.println("상대는 " + rt.getName() + "입니다!");
		return rt;
	}
}

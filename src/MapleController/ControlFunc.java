package MapleController;

import java.util.Random;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc {

	public static Player p;
	
	public ControlFunc() {}
	
	public static void logInFunc() {
		// login실행
		Login lg = new Login(new UserDataList());
		while (true) {
			if (lg.isVisible())
				System.out.print("");
			else {
				break;
			}
		}
	}

	public static void selectFunc() {
		// if(lg.getS() = true){
		SelectView sv = new SelectView();
		while (true) {
			if (sv.isVisible())
				System.out.print("");
			else {
				break;
			}
		}
		creator(p,sv.getIndex());
	}
	
	public static void checkViewFunc() {
		
		CheckView cv=new CheckView(new 다크나이트(), new 팔라딘(), 1);
		
	}

	public static void battleFunc() {
		Random rand = new Random();
		int enem=rand.nextInt(8);
		Player e=null;
		creator(e,enem);
		
		Player p1=new 다크나이트();
		Player e1=new 팔라딘();
		e1.setEnemy(p1);
		p1.setEnemy(e1);
		BattleView bv=new BattleView(p1, e1);		//인자 전달을 static값으로 보내주니까 static 메서드가 못씀.

		// e
		// new BattleView(p1, e)
		// if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		// BattleView.dispose();
		// new nextView();
	}
	
	public static void creator(Player x,int i) {
		switch (i) {
		case 0: x=new 팔라딘();
		break;
		case 1: x=new 다크나이트();
		break;
		case 2: x=new 보우마스터();
		break;
		case 3: x=new 신궁();
		break;
		case 4: x=new 불독();
		break;
		case 5: x=new 썬콜();
		break;
		case 6: x=new 나이트로드();
		break;
		case 7: x=new 섀도어();
		break;
		}	
	}

}

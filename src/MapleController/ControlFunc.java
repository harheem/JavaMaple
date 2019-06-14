package MapleController;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc {

	public static Player p;
	
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
		switch (sv.getIndex()) {
		case 0: p=new 팔라딘();
		break;
		case 1: p=new 다크나이트();
		break;
		case 2: p=new 보우마스터();
		break;
		case 3: p=new 신궁();
		break;
		case 4: p=new 불독();
		break;
		case 5: p=new 썬콜();
		break;
		case 6: p=new 나이트로드();
		break;
		case 7: p=new 섀도어();
		break;
		}
	}

	public static void battleFunc() {

		BattleView bv=new BattleView(p, new 팔라딘());		// 적 객체를 랜덤으로 생성기능 구현 필요

		// e
		// new BattleView(p1, e)
		// if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		// BattleView.dispose();
		// new nextView();
	}

}

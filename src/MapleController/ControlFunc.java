package MapleController;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc {

	public static Player p;
	
	public static void logInFunc() {
		// login����
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
		case 0: p=new �ȶ��();
		break;
		case 1: p=new ��ũ����Ʈ();
		break;
		case 2: p=new ���츶����();
		break;
		case 3: p=new �ű�();
		break;
		case 4: p=new �ҵ�();
		break;
		case 5: p=new ����();
		break;
		case 6: p=new ����Ʈ�ε�();
		break;
		case 7: p=new ������();
		break;
		}
	}

	public static void battleFunc() {

		BattleView bv=new BattleView(p, new �ȶ��());		// �� ��ü�� �������� ������� ���� �ʿ�

		// e
		// new BattleView(p1, e)
		// if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		// BattleView.dispose();
		// new nextView();
	}

}

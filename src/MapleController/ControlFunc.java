package MapleController;

import java.util.Random;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc {

	public static Player p;
	
	public ControlFunc() {}
	
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
		creator(p,sv.getIndex());
	}
	
	public static void checkViewFunc() {
		
		CheckView cv=new CheckView(new ��ũ����Ʈ(), new �ȶ��(), 1);
		
	}

	public static void battleFunc() {
		Random rand = new Random();
		int enem=rand.nextInt(8);
		Player e=null;
		creator(e,enem);
		
		Player p1=new ��ũ����Ʈ();
		Player e1=new �ȶ��();
		e1.setEnemy(p1);
		p1.setEnemy(e1);
		BattleView bv=new BattleView(p1, e1);		//���� ������ static������ �����ִϱ� static �޼��尡 ����.

		// e
		// new BattleView(p1, e)
		// if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		// BattleView.dispose();
		// new nextView();
	}
	
	public static void creator(Player x,int i) {
		switch (i) {
		case 0: x=new �ȶ��();
		break;
		case 1: x=new ��ũ����Ʈ();
		break;
		case 2: x=new ���츶����();
		break;
		case 3: x=new �ű�();
		break;
		case 4: x=new �ҵ�();
		break;
		case 5: x=new ����();
		break;
		case 6: x=new ����Ʈ�ε�();
		break;
		case 7: x=new ������();
		break;
		}	
	}

}

package MapleView;

import MapleClass.*;
import control.UserDataList;

public class Main {

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {
		//login class 
		Login lg = new Login(new UserDataList());
		while(true)
		{
			if(lg.isVisible()) System.out.print("");
			else break;
		}
		//if(lg.getS() = true){
		SelectView sv = new SelectView();
		while(true)
		{
			if(sv.isVisible()) System.out.print("");
			else break;
		}
		switch(sv.getIndex()) {
		case 1: //�ȶ�� ��ü�� ����
			//p11
		}
		new BattleView(new ��ũ����Ʈ(), new �ȶ��());
		//�� ��ü�� �������� ����
		//e
		// new BattleView(p1, e)
		//if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		//BattleView.dispose();
		//new nextView();
		
	}
}
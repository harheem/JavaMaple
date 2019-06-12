package MapleView;

import MapleClass.*;
import control.UserDataList;

public class Main {

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {
		//login class 
		new Login(new UserDataList());
		//if(lg.getS() = true){
		SelectView sv = new SelectView();
		switch(sv.getIndex()) {
		case 1: //ÆÈ¶óµò °´Ã¼¸¦ »ý¼º
			//p1
		}
		new BattleView(new ´ÙÅ©³ªÀÌÆ®(), new ÆÈ¶óµò());
		//Àû °´Ã¼¸¦ ·£´ýÀ¸·Î »ý¼º
		//e
		// new BattleView(p1, e)
		//if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		//BattleView.dispose();
		//new nextView();
		
	}
}
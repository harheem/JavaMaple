package MapleController;

import MapleClass.*;
import MapleView.*;
import MapleController.*;
import MapleWeapon.*;
import control.UserDataList;

public class Main {

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {

		ControlFunc ct=new ControlFunc();
		
		ct.logInFunc();
		ct.selectFunc();
		for(int i=0;i<2;i++) {
			ct.checkViewFunc();
			ct.battleFunc();
		}

	}
}
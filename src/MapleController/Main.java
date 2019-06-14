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

		//ControlFunc.logInFunc();
		ControlFunc.selectFunc();
		ControlFunc.checkViewFunc();
		ControlFunc.battleFunc();

	}
}
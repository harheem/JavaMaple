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

		ControlFunc ct = new ControlFunc();
		ct.logInFunc(); // 로그인은 처음에한번만
		while (true) {
			ct.selectFunc();
			ct.checkViewFunc();
			if (ct.battleFunc()){ // 플레이어가 처음으로를 누르면
				ct = new ControlFunc(); // 객체 다시 생성
			} else break; 
		} System.exit(0);// 아니면 종료
	}
}
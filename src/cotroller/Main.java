package cotroller;

import cotroller.*;
import model.control.UserDataList;
import model.mapleClass.*;
import model.mapleWeapon.*;
import view.mapleView.*;

public class Main {

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;

	public static void main(String[] args) {

		ControlFunc ct = new ControlFunc();
		ct.logInFunc(); // �α����� ó�����ѹ���
		while (true) {
			ct.selectFunc();
			ct.checkViewFunc();
			if (ct.battleFunc()){ // �÷��̾ ó�����θ� ������
				ct = new ControlFunc(); // ��ü �ٽ� ����
			} else break; 
		} System.exit(0);// �ƴϸ� ����
	}
}
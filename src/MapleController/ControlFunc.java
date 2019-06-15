package MapleController;

import java.util.Random;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc { // 메인에서 Controller 객체생성해서 쓰게 메서드 변수 전부 non-static으로 바꿔만들기

	private Player p;
	private Player e;
	
	public ControlFunc() {}
	
	public void logInFunc() {
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

	public void selectFunc() {
		// if(lg.getS() = true){
		SelectView sv = new SelectView();
		while (true) {
			if (sv.isVisible())
				System.out.print("");
			else {
				break;
			}
		}
		creator(this.p,sv.getIndex());
	}
	
	public void checkViewFunc() {
		Random rand = new Random();
		int enem=rand.nextInt(8);
		creator(this.e,enem);
		
		CheckView cv=new CheckView(this.p, this.e);
		while (true) {
			if (cv.isVisible())
				System.out.print("");
			else {
				break;
			}
		}
		
	}

	public void battleFunc() {
		this.e.setEnemy(this.p);
		this.p.setEnemy(this.e);
		BattleView bv=new BattleView(this.p, this.e);		//인자 전달을 static값으로 보내주니까 static 메서드가 못씀.

		while(true) {
		if(p.isDead())
			//
		if(e.isDead())
			//
			break;
		}
		// e
		// new BattleView(p1, e)
		// if(p1.getHp == 0 { lose, if(e.getHP == 0) win
		// BattleView.dispose();
		// new nextView();
	}
	
	public void creator(Player x,int i) {
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

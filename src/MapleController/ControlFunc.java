package MapleController;

import java.util.Random;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc { // 메인에서 Controller 객체생성해서 쓰게 메서드 변수 전부 non-static으로 바꿔만들기

	private Player p;
	private Player e;
	private int playerIndex;
	private int enemyIndex;
	private int round;
	private BattleView bv;
	private CheckView cv;
	private CheckView finCheck;

	public ControlFunc() {
		this.round = 1;
	}

	// 로그인뷰를 제어하는 메소드
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

	// 셀렉트뷰를 제어하는 메소드
	public void selectFunc() {
		SelectView sv = new SelectView();
		while (true) {
			if (sv.isVisible())
				System.out.print("");
			else
				break;
		}
		playerIndex = sv.getIndex();
		p = creator(playerIndex);
	}

	// 체크뷰를 제어하는 메소드
	public void checkViewFunc() {
		Random rand = new Random();
		enemyIndex = rand.nextInt(8);
		e = creator(enemyIndex);
		CheckView cv = new CheckView(this.p, this.e);
		while (true) {
			if (cv.isVisible())
				System.out.print("");
			else
				break;
		}
		for (int i = 1; i < round; i++)
			e.reinforce();
	}

	// 플레이어가 다시하기를 선택했을 때 실행되는 메소드
	public void reBattle() {
		p = creator(playerIndex); // 능력치 초기화하기
		e = creator(enemyIndex); // 능력치 초기화하기
		for (int i = 1; i < round; i++) { // 해당 라운드 만큼 강화하기
			p.reinforce();
			e.reinforce();
		}
	}

	public void threadSleep(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	// 배틀뷰를 제어하는 메소드
	public boolean battleFunc() {
		this.e.setEnemy(this.p);
		this.p.setEnemy(this.e);
		bv = new BattleView(this.p, this.e);

		while (true) {
			if (p.isDead()) {// 플레이어가 죽었으면
				closeBattleView();
				cv = new CheckView(p, e, false); // 체크뷰에 결과를 인자로 전달하기
				while (cv.isVisible())
					System.out.print(""); // 입력 기다리기
				if (!cv.restart()) {
					reBattle();
					return battleFunc();
				} else return true;
			} else if (e.isDead()) { // 플레이어가 이겼으면
				closeBattleView();
				cv = new CheckView(p, e, true);
				threadSleep(3000);
				cv.dispose();
				if (round == 3) {
					finCheck = new CheckView(p); // final view
					while (finCheck.isVisible())
						System.out.print(""); // 입력 기다리기
					return finCheck.restart(); // 다시하거나 종료하기
				} else {
					round++;
					p.reinforce(); // 강화하기
					checkViewFunc(); // 다음 라운드 시작화면 보이기
					return battleFunc(); // 다시호출
				}
			}
			System.out.print("");
		}
	}

	// 배틀뷰에 있는 쓰레드와 배틀뷰를 끄는 메소드
	public void closeBattleView() {
		bv.dispose();
		bv.threadStop();
	}

	private Player creator(int i) {
		Player x = null;
		switch (i) {
		case 0:
			x = new 팔라딘();
			break;
		case 1:
			x = new 다크나이트();
			break;
		case 2:
			x = new 보우마스터();
			break;
		case 3:
			x = new 신궁();
			break;
		case 4:
			x = new 불독();
			break;
		case 5:
			x = new 썬콜();
			break;
		case 6:
			x = new 나이트로드();
			break;
		case 7:
			x = new 섀도어();
			break;
		}
		return x;
	}
}

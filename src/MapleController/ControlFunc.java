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
	
	public ControlFunc() {this.round = 1;}
	
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
		playerIndex = sv.getIndex();
		p = creator(playerIndex);
	}
	
	public void checkViewFunc() {
		Random rand = new Random();
		enemyIndex=rand.nextInt(8);
		e = creator(enemyIndex);
		CheckView cv=new CheckView(this.p, this.e);
		while (true) {
			if (cv.isVisible())
				System.out.print("");
			else {
				break;
			}
		}
		for(int i =1; i<round; i++) e.reinforce();
		
	}

	public boolean battleFunc() {
		this.e.setEnemy(this.p);
		this.p.setEnemy(this.e);
		BattleView bv = new BattleView(this.p, this.e);		//인자 전달을 static값으로 보내주니까 static 메서드가 못씀.

		while(true) {
		if(p.isDead()) //졌으면
		{
			bv.dispose();
			bv.threadStop();
			CheckView temp = new CheckView(p,e,false);
			while(temp.isVisible()) System.out.print(""); //입력 기다리기
			if(!temp.restart()) //다시 싸울거면
			{
				p = creator(playerIndex); //능력치 초기화하기
				e = creator(enemyIndex); //능력치 초기화하기
				for(int i=1; i<round; i++) //해당 라운드만큼 다시 강화하기
				{
					p.reinforce();
					e.reinforce();
				}
				return battleFunc();
			}
			else return true;
		}	
		else if(e.isDead()) //이겼으면
		{
			bv.dispose();
			bv.threadStop();
			CheckView temp = new CheckView(p,e,true); //이겼다는 화면 보이기
			try {
				Thread.sleep(3000); //3초동안 멈추기
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			temp.dispose();
			if(round==3)
			{
				CheckView finCheck = new CheckView(p); //final view
				while(finCheck.isVisible()) System.out.print(""); //입력 기다리기
				return finCheck.restart(); //다시하거나 종료하기
			}
			else
			{
				round++;
				p.reinforce(); //강화하기
				checkViewFunc(); //다음 라운드 시작화면 보이기
				return battleFunc(); //다시호출
			}
		}
		System.out.print(""); //이거없으면 while문이 실행안돼요..
		}
	}
	
	private Player creator(int i) {
		Player x = null;
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
		return x;
	}
}

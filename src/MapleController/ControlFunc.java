package MapleController;

import java.util.Random;

import MapleClass.*;
import MapleView.*;
import control.UserDataList;

public class ControlFunc { // ���ο��� Controller ��ü�����ؼ� ���� �޼��� ���� ���� non-static���� �ٲ㸸���

	private Player p;
	private Player e;
	private int playerIndex;
	private int enemyIndex;
	private int round;
	
	public ControlFunc() {this.round = 1;}
	
	public void logInFunc() {
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
		BattleView bv = new BattleView(this.p, this.e);		//���� ������ static������ �����ִϱ� static �޼��尡 ����.

		while(true) {
		if(p.isDead()) //������
		{
			bv.dispose();
			bv.threadStop();
			CheckView temp = new CheckView(p,e,false);
			while(temp.isVisible()) System.out.print(""); //�Է� ��ٸ���
			if(!temp.restart()) //�ٽ� �ο�Ÿ�
			{
				p = creator(playerIndex); //�ɷ�ġ �ʱ�ȭ�ϱ�
				e = creator(enemyIndex); //�ɷ�ġ �ʱ�ȭ�ϱ�
				for(int i=1; i<round; i++) //�ش� ���常ŭ �ٽ� ��ȭ�ϱ�
				{
					p.reinforce();
					e.reinforce();
				}
				return battleFunc();
			}
			else return true;
		}	
		else if(e.isDead()) //�̰�����
		{
			bv.dispose();
			bv.threadStop();
			CheckView temp = new CheckView(p,e,true); //�̰�ٴ� ȭ�� ���̱�
			try {
				Thread.sleep(3000); //3�ʵ��� ���߱�
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			temp.dispose();
			if(round==3)
			{
				CheckView finCheck = new CheckView(p); //final view
				while(finCheck.isVisible()) System.out.print(""); //�Է� ��ٸ���
				return finCheck.restart(); //�ٽ��ϰų� �����ϱ�
			}
			else
			{
				round++;
				p.reinforce(); //��ȭ�ϱ�
				checkViewFunc(); //���� ���� ����ȭ�� ���̱�
				return battleFunc(); //�ٽ�ȣ��
			}
		}
		System.out.print(""); //�̰ž����� while���� ����ȵſ�..
		}
	}
	
	private Player creator(int i) {
		Player x = null;
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
		return x;
	}
}

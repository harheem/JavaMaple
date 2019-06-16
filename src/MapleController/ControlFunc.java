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
	private BattleView bv;
	private CheckView cv;
	private CheckView finCheck;

	public ControlFunc() {
		this.round = 1;
	}

	// �α��κ並 �����ϴ� �޼ҵ�
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

	// ����Ʈ�並 �����ϴ� �޼ҵ�
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

	// üũ�並 �����ϴ� �޼ҵ�
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

	// �÷��̾ �ٽ��ϱ⸦ �������� �� ����Ǵ� �޼ҵ�
	public void reBattle() {
		p = creator(playerIndex); // �ɷ�ġ �ʱ�ȭ�ϱ�
		e = creator(enemyIndex); // �ɷ�ġ �ʱ�ȭ�ϱ�
		for (int i = 1; i < round; i++) { // �ش� ���� ��ŭ ��ȭ�ϱ�
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

	// ��Ʋ�並 �����ϴ� �޼ҵ�
	public boolean battleFunc() {
		this.e.setEnemy(this.p);
		this.p.setEnemy(this.e);
		bv = new BattleView(this.p, this.e);

		while (true) {
			if (p.isDead()) {// �÷��̾ �׾�����
				closeBattleView();
				cv = new CheckView(p, e, false); // üũ�信 ����� ���ڷ� �����ϱ�
				while (cv.isVisible())
					System.out.print(""); // �Է� ��ٸ���
				if (!cv.restart()) {
					reBattle();
					return battleFunc();
				} else return true;
			} else if (e.isDead()) { // �÷��̾ �̰�����
				closeBattleView();
				cv = new CheckView(p, e, true);
				threadSleep(3000);
				cv.dispose();
				if (round == 3) {
					finCheck = new CheckView(p); // final view
					while (finCheck.isVisible())
						System.out.print(""); // �Է� ��ٸ���
					return finCheck.restart(); // �ٽ��ϰų� �����ϱ�
				} else {
					round++;
					p.reinforce(); // ��ȭ�ϱ�
					checkViewFunc(); // ���� ���� ����ȭ�� ���̱�
					return battleFunc(); // �ٽ�ȣ��
				}
			}
			System.out.print("");
		}
	}

	// ��Ʋ�信 �ִ� ������� ��Ʋ�並 ���� �޼ҵ�
	public void closeBattleView() {
		bv.dispose();
		bv.threadStop();
	}

	private Player creator(int i) {
		Player x = null;
		switch (i) {
		case 0:
			x = new �ȶ��();
			break;
		case 1:
			x = new ��ũ����Ʈ();
			break;
		case 2:
			x = new ���츶����();
			break;
		case 3:
			x = new �ű�();
			break;
		case 4:
			x = new �ҵ�();
			break;
		case 5:
			x = new ����();
			break;
		case 6:
			x = new ����Ʈ�ε�();
			break;
		case 7:
			x = new ������();
			break;
		}
		return x;
	}
}

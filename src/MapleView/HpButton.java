package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class HpButton extends JButton implements MouseListener, Runnable{

	private Player p;
	private Thread t;
	public HpButton(Player player) { //HpButton�� HpPotion ��ư�̿���. Hp�ٴ� ProgressBar�� ǥ���մϴ�.
		this.p=player;
	    this.setSize(65, 35);
	    this.setText("HP");
		this.addMouseListener(this);
	} 
	public void start() {t.start();}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setEnabled(false);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setEnabled(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(this.isEnabled()) {
			this.p.drinkHPpotion();
			t= new Thread(this);
			t.start();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// "Hp�����ư�Դϴ�" + ȿ�� �� ��Ÿ�� ����

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	
}


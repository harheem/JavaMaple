package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class MpButton extends JButton implements MouseListener, Runnable{

	private Player p;
	private Thread t;
	public MpButton(Player player) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p=player;
	    this.setSize(65, 35);
	    this.setText("mp");
	    this.addMouseListener(this);
	}
	public void start() {t.start();}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setEnabled(false);
		if(p.getHp()>0) this.p.drinkMPpotion();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setEnabled(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
			if(this.isEnabled())
			{
				t = new Thread(this);
				start();
			}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
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

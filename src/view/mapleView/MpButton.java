package view.mapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.Main;
import model.mapleClass.Player;

public class MpButton extends JButton implements MouseListener, Runnable{

	private Player p;
	private Thread t;
	public MpButton(Player player) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p=player;
		this.setIcon(new ImageIcon(Main.class.getResource("../image/skillIcon/MpButton.png")));
		 this.setToolTipText("MP의 50%를 회복한다");
	    this.setSize(60, 60);
	    this.addMouseListener(this);
	}
	public void start() {t.start();}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setEnabled(false);
		this.p.drinkMPpotion();
		try {
			Thread.sleep(2000); //쿨타임
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

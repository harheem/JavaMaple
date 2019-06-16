package view.mapleView;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.Main;
import model.mapleClass.Player;

public class BuffEffectButton extends JButton implements Runnable {
	private Thread t;
	private Player p;

	public BuffEffectButton(Player p) {
		this.p = p;
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setFocusPainted(false);
		this.setVisible(false);
		this.setSize(200, 200);
	}

	public void start(String s) {
		this.setVisible(true);
		this.setIcon(new ImageIcon(Main.class.getResource(s)));
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setVisible(false);
		this.setIcon(null);
	}
}

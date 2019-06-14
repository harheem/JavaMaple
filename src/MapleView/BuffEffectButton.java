package MapleView;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.Main;

public class BuffEffectButton extends JButton implements Runnable{
	private Thread t;
	private Player p;
	public BuffEffectButton(Player p)
	{
		this.p = p;
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.setVisible(false);
		this.setSize(70,70);
	}
	public void start() 
	{
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillEffect().get(2))));
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.setVisible(true);
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

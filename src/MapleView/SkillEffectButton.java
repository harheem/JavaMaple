package MapleView;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SkillEffectButton extends JButton implements Runnable{
	
	private Thread t;
	public SkillEffectButton()
	{
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.setVisible(false);
		this.setSize(400,250);
	}
	public void start(String s)
	{
		this.setIcon(new ImageIcon(Main.class.getResource(s)));
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		this.setVisible(true);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setIcon(null);
		this.setVisible(false);
		
	}

}

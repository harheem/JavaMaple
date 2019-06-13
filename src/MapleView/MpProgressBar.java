package MapleView;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

import MapleClass.Player;

public class MpProgressBar extends JProgressBar implements Runnable{

	private Thread t = new Thread(this);
	private Player p;
	private JLabel lb;
	public MpProgressBar(Player p, JLabel lb)
	{
		this.p = p;
		this.lb = lb;
		this.setMaximum(p.getM_mp());
		this.setValue(p.getMp());
		this.setStringPainted(true);
		this.setForeground(Color.BLUE);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(200,30);
		start();
	}
	public void start()
	{
		t.start();
	}
	@Override
	public void run() {
		while(true)
		{
			lb.setText(p.getMp() + " / " + p.getM_mp());
			this.setMaximum(p.getM_mp());
			this.setValue(p.getMp());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void stop() {t.stop();}

}

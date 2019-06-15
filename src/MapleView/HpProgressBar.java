package MapleView;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

import MapleClass.Player;

public class HpProgressBar extends JProgressBar implements Runnable{
	private Thread t = new Thread(this);
	private Player p;
	private JLabel lb;
	public HpProgressBar(Player p, JLabel lb)
	{
		this.p = p;
		this.lb =lb;
		this.setMaximum(p.getM_hp());
		this.setValue(p.getHp());
		this.setStringPainted(true);
		this.setForeground(Color.RED);
		this.setBackground(Color.LIGHT_GRAY);
		this.setSize(200,20);
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
			this.lb.setText(p.getHp() + " / " + p.getM_hp());
			this.setMaximum(p.getM_hp());
			this.setValue(p.getHp());
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

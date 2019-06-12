package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;
import MapleClass.마법사;

public class BuffButton extends JButton implements MouseListener, Runnable{
	private Player p;
	private Thread t;
	
	public BuffButton(Player p)
	{
		this.p = p;
		this.setText("buff");
		if(p instanceof 마법사) this.setVisible(false);
		this.setSize(65,35);
		this.addMouseListener(this);
	}
	@Override
	public void run() {
		this.setEnabled(false);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.buffRelease();
		this.setEnabled(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(this.isEnabled())
		{
			p.buffskill();
			t = new Thread(this);
			t.start();
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}

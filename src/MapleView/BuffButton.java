package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleClass.마법사;
import MapleController.Main;

public class BuffButton extends JButton implements MouseListener, Runnable{
	private Player p;
	private Thread t;
	private BuffEffectButton beb; //버프이펙트
	private JButton bi; //버프아이콘
	public BuffButton(Player p, BuffEffectButton beb, JButton bi)
	{
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.beb = beb;
		this.p = p;
		this.bi = bi;
		this.bi.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
		this.setText("buff");
		if(p instanceof 마법사) this.setVisible(false);
		this.setSize(65,35);
		this.addMouseListener(this);
	}
	@Override
	public void run() {
		p.buffskill();
		bi.setVisible(true);
		this.setEnabled(false);
		beb.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.buffRelease();
		bi.setVisible(false);
		this.setEnabled(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(this.isEnabled())
		{
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

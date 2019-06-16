package view.mapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.Main;
import model.mapleClass.Player;
import model.mapleClass.마법사;

public class BuffButton extends JButton implements MouseListener, Runnable {
	private Player p;
	private Thread t;
	private BuffEffectButton beb; // 버프이펙트
	private JButton bi; // 버프아이콘

	public BuffButton(Player p, BuffEffectButton beb, JButton bi) {
		this.beb = beb;
		this.p = p;
		
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.bi = bi;
		this.bi.setBorderPainted(false);
		this.bi.setContentAreaFilled(false);
		this.bi.setFocusPainted(false);
		this.bi.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(2))));
		this.setToolTipText(p.getW().getSkillExplanation().get(2));
		if (p instanceof 마법사) {
			this.setEnabled(false);
			bi.setVisible(true);
		}
		this.setSize(60, 60);
		this.addMouseListener(this);
	}

	@Override
	public void run() {
		p.buffskill();
		bi.setVisible(true);
		this.setEnabled(false);
		beb.start(p.getW().getSkillEffect().get(4));
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
		if (this.isEnabled()) {
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

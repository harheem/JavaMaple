package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.Main;

public class SkillButton1 extends JButton implements MouseListener{ //쿨타임 없는데 넣으려면 쓰레드 추가해야합니다!!

	private Player p;
	private SkillEffectButton seb;
	public SkillButton1(Player p, SkillEffectButton seb) { //player의 SkillButton1
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.seb = seb;
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(0))));
		this.setToolTipText(p.getW().getSkillExplanation().get(0));
		this.setSize(60, 60);
		this.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		p.skillAttack(0);
		seb.start(p.getW().getSkillEffect().get(0));
		
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


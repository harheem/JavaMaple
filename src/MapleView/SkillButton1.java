package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton1 extends JButton implements MouseListener{

	private Player p;
	private SkillEffectButton seb;
	public SkillButton1(Player p, SkillEffectButton seb) { //player의 SkillButton1
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.seb = seb;
		this.setText("skill1");
		this.setSize(65, 35);
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
		// "(스킬명)" + 스킬효과 및 쿨타임 설명

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


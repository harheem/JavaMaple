package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton2 extends JButton implements MouseListener{

	private Player p;
	
	public SkillButton2(Player player) {
		this.p=player;
		this.setSize(65, 35);
		this.addAction();
	}
	
	public SkillButton2 () {
	}

	public void addAction() {
		this.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		p.skillAttack(1);
		
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


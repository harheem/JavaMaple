package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton1 extends JButton implements MouseListener{

	private Player p;
	
	public SkillButton1(Player player) {
		this.p=player
	}
	
	public void addAction() {
		MpButton.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		p.skillAttack(0);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// "(��ų��)" + ��ųȿ�� �� ��Ÿ�� ����

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


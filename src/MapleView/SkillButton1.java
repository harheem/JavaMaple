package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton1 extends JButton implements MouseListener{

	private Player p;
	
	public SkillButton1(Player p) { //player�� SkillButton1
		this.p = p;
		this.setBounds(80, 320, 65, 35);
	}
	public SkillButton1 () { //enemy�� ��ư�� �������� ����� ���� ��üx
		this.setBounds(680, 320, 65, 35);	
	}

	
	public void addAction() {
		this.addMouseListener(this);
		
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


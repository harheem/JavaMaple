package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class SelectButton extends JButton implements MouseListener{

	
	// 8개씩 버튼 생성
	
	private int index;
	JButton[] nameButton = {};
	JButton[] imgButton = {};

	public int getIndex() {
		return index;
	}
	
	public void addAction() {
		for (int i = 0; i < nameButton.length; i++) {
			nameButton[i].addMouseListener(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for (int i = 0; i < nameButton.length; i++) {
			if (e.getSource() == nameButton[i]) {
				index = i;
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		for (int i = 0; i < nameButton.length; i++) {
			if (e.getSource() == nameButton[i]) {
				imgButton[i].setVisible(true);
			}
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		for (int i = 0; i < nameButton.length; i++) {
			imgButton[i].setVisible(false);
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

}

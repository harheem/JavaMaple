package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SelectButton extends JButton implements MouseListener{ //View���� ��ư�� ������ �߰� �� Location ����. Button���� ��ư�� ������ �� ������ ����.
	
	JButton[] nameButton = {};
	JButton[] imgButton = {};
	
	public SelectButton() {
		this.nameButton = new JButton[8];
		this.imgButton = new JButton[8];
		
		for(int i=0;i<8;i++) {
			/*
			 * ��ư���� �̹��� �����ϱ�
			this.imgButton[i].setIcon(~~);
			this.nameButton[i].setIcon(~~);
			*/
			this.imgButton[i] = new JButton();
			this.nameButton[i] = new JButton();
			this.imgButton[i].setSize(150,150);
			this.nameButton[i].setSize(100,30);
		}
		this.addAction();
	}
	
	public void addAction() {
		for (int i = 0; i < nameButton.length; i++) {
			nameButton[i].addMouseListener(this);
		}
	}

	// View�� ������ �ʿ��ϹǷ� SelectView���� ������.
	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	/*
	public int getIndex() {
		return this.index;
	}
	*/
}

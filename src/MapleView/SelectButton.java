package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SelectButton extends JButton implements MouseListener{ //View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.
	
	JButton[] nameButton = {};
	JButton[] imgButton = {};
	
	public SelectButton() {
		this.nameButton = new JButton[8];
		this.imgButton = new JButton[8];
		
		for(int i=0;i<8;i++) {
			/*
			 * 버튼마다 이미지 설정하기
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

	// View쪽 접근이 필요하므로 SelectView에서 정의함.
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

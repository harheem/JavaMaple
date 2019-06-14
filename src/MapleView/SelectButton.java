package MapleView;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.Main;

public class SelectButton extends JButton implements MouseListener{ //View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.
	
	JButton[] nameButton;
	JButton[] imgButton;
	private ImageIcon[] img, name;
	
	public SelectButton() {
		this.nameButton = new JButton[8];
		this.imgButton = new JButton[8];
		this.img=new ImageIcon[8];
		this.name=new ImageIcon[8];
		
		for(int i=0;i<8;i++) {			
			this.imgButton[i] = new JButton();
			this.nameButton[i] = new JButton();
			this.img[i]=new ImageIcon(Main.class.getResource("../image/characterByNum/"+i+".png"));
			this.imgButton[i].setIcon(this.img[i]);
			this.name[i]=new ImageIcon(Main.class.getResource("../image/charNameByNum/"+i+".png"));
			this.nameButton[i].setIcon(this.name[i]);
			this.imgButton[i].setSize(500,600); // setSize 말고 사진이 잘려보이지 않는 다른 기능
			this.nameButton[i].setSize(180,50);
			this.setBorderPainted(false);
		      this.setContentAreaFilled(false);
		      this.setFocusPainted(false);
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

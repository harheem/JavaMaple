package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartButton extends JButton implements MouseListener { 
	
	public StartButton(){   
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
	    this.setIcon(new ImageIcon(Main.class.getResource("../image/check/startButton.png")));
	    this.setSize(310, 160);
	    this.addMouseListener(this);
	}
	   

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//기능은 체크뷰에서 구현
		
		//or
		//new BattleView(1); 
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

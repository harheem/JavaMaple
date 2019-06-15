package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleController.*;

public class RestartButton extends JButton implements MouseListener {
	
	public RestartButton(){   
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
	    this.setIcon(new ImageIcon(Main.class.getResource("../image/check/restartButton.png")));
	    this.setSize(310, 160);
	    this.addMouseListener(this);
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

	}


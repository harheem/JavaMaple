package MapleView;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleController.*;

public class WinButton extends JButton { 
	public WinButton() {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		this.setFocusPainted(false);
		this.setSize(240, 140); //�ӽ� 
		}

}


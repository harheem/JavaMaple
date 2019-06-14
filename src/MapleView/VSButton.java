package MapleView;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import MapleController.*;

public class VSButton extends JButton {
	public VSButton() {
	this.setBorderPainted(false);
	this.setContentAreaFilled(false);
	this.setIcon(new ImageIcon(Main.class.getResource("../image/check/vsimg.png")));
	this.setFocusPainted(false);
	this.setSize(160, 110); //юс╫ц 
	}
}

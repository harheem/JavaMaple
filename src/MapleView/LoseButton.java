package MapleView;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleController.*;

public class LoseButton extends JButton { 
	public LoseButton() {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setIcon(new ImageIcon(Main.class.getResource("../image/check/Loseicon.png")));
		this.setFocusPainted(false);
		this.setSize(240, 140); //юс╫ц 
		}

}

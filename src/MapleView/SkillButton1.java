package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton1 extends JButton implements ActionListener{
	
	Player p;
	
	public SkillButton1(Player p) {
		this.p = p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		p.skillAttack(0);
		
	}

}

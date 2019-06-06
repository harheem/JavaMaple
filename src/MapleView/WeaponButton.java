package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;
import MapleWeapon.Weapon;

public class WeaponButton extends JButton {
	
	Player p;
	Weapon w;
	
	public WeaponButton(Player p) {
		this.p = p;
		//this.w = p.getW();
		//이미지아이콘 w.getSkillName[w.getWpIndex()];
		
	}


}

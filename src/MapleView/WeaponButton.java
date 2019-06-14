package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleWeapon.Weapon;

public class WeaponButton extends JButton {
	
	private Player p;
	//this.w = p.getW();
	//이미지아이콘 w.getSkillName[w.getWpIndex()];
	public WeaponButton(Player p) { //WeaponButton은 ppt에 나온게 없어 임의로 정사각형 크기로 설정하였습니다.
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.setSize(75, 75 ); 
		this.p = p;
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getWpIcon().get(p.getW().getWpIndex()))));
	}
	
	// public WeaponButton() {}


}

package view.mapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.Main;
import model.mapleClass.Player;
import model.mapleWeapon.Weapon;

public class WeaponButton extends JButton {

	public WeaponButton(Player p) { 
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.setSize(75, 75 ); 
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getWpIcon().get(p.getW().getWpIndex()))));
	}

}

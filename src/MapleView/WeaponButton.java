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
	//�̹��������� w.getSkillName[w.getWpIndex()];
	public WeaponButton(Player p) { //WeaponButton�� ppt�� ���°� ���� ���Ƿ� ���簢�� ũ��� �����Ͽ����ϴ�.
		this.setSize(75, 75 ); 
		this.p = p;
		System.out.println(p.getW().getWpIcon().get(0));
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getWpIcon().get(0))));
	}
	
	// public WeaponButton() {}


}

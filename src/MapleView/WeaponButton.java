package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;
import MapleWeapon.Weapon;

public class WeaponButton extends JButton {
	
	Player p;
	Weapon w;
	//this.w = p.getW();
	//�̹��������� w.getSkillName[w.getWpIndex()];
	public WeaponButton(Player p) { //WeaponButton�� ppt�� ���°� ���� ���Ƿ� ���簢�� ũ��� �����Ͽ����ϴ�.
		this.p = p;
		this.setBounds(100, 425, 75, 75 ); //Player ��ų1,2 �ϴܿ� ��������ϴ�. ���� �����ϸ� �� �� �����ϴ�.
	}
	
	public WeaponButton() {
		this.setBounds(660, 425, 75, 75 ); //enemy ��ų �ϴܿ� "
	}


}

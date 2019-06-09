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
	//이미지아이콘 w.getSkillName[w.getWpIndex()];
	public WeaponButton(Player p) { //WeaponButton은 ppt에 나온게 없어 임의로 정사각형 크기로 설정하였습니다.
		this.p = p;
		this.setBounds(100, 425, 75, 75 ); //Player 스킬1,2 하단에 만들었습니다. 추후 조정하면 될 거 같습니다.
	}
	
	public WeaponButton() {
		this.setBounds(660, 425, 75, 75 ); //enemy 스킬 하단에 "
	}


}

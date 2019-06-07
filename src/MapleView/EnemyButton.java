package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class EnemyButton extends JButton {
	
	Player p;
	
	public EnemyButton(Player p) {
		this.p = p;
		//플레이어가 이미지경로 갖고 있게해서 이미지아이콘 설정
	}


}
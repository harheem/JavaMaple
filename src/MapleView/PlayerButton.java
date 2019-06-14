package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.*;

public class PlayerButton extends JButton{
	
	Player p;
	//체크뷰 생성자
	public PlayerButton(Player p, Player e) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(0))));
	}
	//배틀뷰 생성자
	public PlayerButton(Player p) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(353,353);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(2))));
		//플레이어가 이미지경로 갖고 있게해서 이미지아이콘 설정
	}

}

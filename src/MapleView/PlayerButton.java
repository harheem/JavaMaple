package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;

public class PlayerButton extends JButton implements ActionListener{ // ActionListener 기능 필요하신가요? 필요없으면 삭제바랍니다!
	
	Player p;
	
	public PlayerButton(Player p) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(150, 180);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(2))));
		//플레이어가 이미지경로 갖고 있게해서 이미지아이콘 설정
	}

	
	//기본공격 자동으로 실행되게, 쓰레드로
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

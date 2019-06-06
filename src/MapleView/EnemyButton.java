package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class EnemyButton extends JButton implements ActionListener{
	
	Player p;
	
	public EnemyButton(Player p) {
		this.p = p;
		//플레이어가 이미지경로 갖고 있게해서 이미지아이콘 설정
	}

	
	//기본공격 자동으로 실행되게, 쓰레드로
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
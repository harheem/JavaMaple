package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class EnemyButton extends JButton {
	
	Player p;
	
	public EnemyButton(Player p) {
		this.p = p;
		this.setSize(150, 180);
		//�÷��̾ �̹������ ���� �ְ��ؼ� �̹��������� ����
		//�ڵ����� �����尡 ���ư��� 
	}


}
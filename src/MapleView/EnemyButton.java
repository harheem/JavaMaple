package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import MapleClass.Player;

public class EnemyButton extends JButton implements ActionListener{
	
	Player p;
	
	public EnemyButton(Player p) {
		this.p = p;
		//�÷��̾ �̹������ ���� �ְ��ؼ� �̹��������� ����
	}

	
	//�⺻���� �ڵ����� ����ǰ�, �������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
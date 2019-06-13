package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;

public class PlayerButton extends JButton implements ActionListener{ // ActionListener ��� �ʿ��ϽŰ���? �ʿ������ �����ٶ��ϴ�!
	
	Player p;
	
	public PlayerButton(Player p) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(150, 180);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(2))));
		//�÷��̾ �̹������ ���� �ְ��ؼ� �̹��������� ����
	}

	
	//�⺻���� �ڵ����� ����ǰ�, �������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

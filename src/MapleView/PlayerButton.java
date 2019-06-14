package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.*;

public class PlayerButton extends JButton implements ActionListener{ // ActionListener ��� �ʿ��ϽŰ���? �ʿ������ �����ٶ��ϴ�!
	
	Player p;
	
	public PlayerButton(Player p) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(2))));
		//�÷��̾ �̹������ ���� �ְ��ؼ� �̹��������� ����
	}
              //checkView���� get(0)�� �޾ƿ���; �ϳ� �� �ͽ��ϴ�.
	public PlayerButton(Player p, Player e) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(0))));
	}

	
	//�⺻���� �ڵ����� ����ǰ�, �������
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

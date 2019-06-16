package view.mapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.*;
import model.mapleClass.Player;

public class PlayerButton extends JButton{
	
	Player p;
	//üũ�� ������
	public PlayerButton(Player p, Player e) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(450, 600);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(0))));
	}
	//��Ʋ�� ������
	public PlayerButton(Player p) {
		this.setBorderPainted(false);
	    this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.setSize(353,353);
		this.setIcon(new ImageIcon(Main.class.getResource(p.getImageIcon().get(2))));
		//�÷��̾ �̹������ ���� �ְ��ؼ� �̹��������� ����
	}

}

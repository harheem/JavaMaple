package view.mapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import cotroller.Main;
import model.mapleClass.Player;

public class SkillButton1 extends JButton implements MouseListener,Runnable{ //��Ÿ�� ���µ� �������� ������ �߰��ؾ��մϴ�!!

	private Player p;
	private SkillEffectButton seb;
	private Thread t;
	public SkillButton1(Player p, SkillEffectButton seb) { //player�� SkillButton1
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.seb = seb;
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(0))));
		this.setToolTipText(p.getW().getSkillExplanation().get(0));
		this.setSize(60, 60);
		this.addMouseListener(this);
	}
	public void run() {
		this.setEnabled(false);
		try {
			Thread.sleep(2000); //��Ÿ��
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setEnabled(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(isEnabled()) //�� ���ǹ� �ȴ޸� disabled �����ε� �������� ��찡 �־ �ѹ� �� �˻��߽��ϴ�
		{
		p.skillAttack(0);
		seb.start(p.getW().getSkillEffect().get(0));
		t = new Thread(this);
		//t.start();
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}


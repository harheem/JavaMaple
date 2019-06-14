package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import MapleClass.Player;
import MapleController.Main;

public class SkillButton2 extends JButton implements MouseListener, Runnable{

	private Player p;
	private Thread t;
	private SkillEffectButton seb;
	public SkillButton2(Player p, SkillEffectButton seb) {
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
	    this.setFocusPainted(false);
		this.p = p;
		this.seb = seb;
		this.setIcon(new ImageIcon(Main.class.getResource(p.getW().getSkillIcon().get(1))));
		this.setToolTipText(p.getW().getSkillExplanation().get(1));
		this.setSize(60, 60);
		this.addMouseListener(this);
	}
	public void run()
	{
		this.setEnabled(false);
		try {
			Thread.sleep(5000); //쿨타임
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setEnabled(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(isEnabled()) //이 조건문 안달면 disabled 상태인데 눌러지는 경우가 있어서 한번 더 검사했습니다
		{
			p.skillAttack(1);
			seb.start(p.getW().getSkillEffect().get(1));
			t = new Thread(this);
			t.start();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// "(스킬명)" + 스킬효과 및 쿨타임 설명

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


package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class SkillButton2 extends JButton implements MouseListener, Runnable{

	private Player p;
	private Thread t;
	private SkillEffectButton seb;
	public SkillButton2(Player p, SkillEffectButton seb) {
		this.p = p;
		this.seb = seb;
		this.setText("skill2");
		this.setSize(65, 35);
		this.addMouseListener(this);
	}
	public void run()
	{
		this.setEnabled(false);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setEnabled(true);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(isEnabled())
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


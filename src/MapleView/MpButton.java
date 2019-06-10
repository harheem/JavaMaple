package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class MpButton extends JButton implements MouseListener{

	private Player p;
	
	public MpButton(Player player) {//hp, mp버튼이 위아래로 붙어있다는 가정하에 만듦
		this.p=player;
		MpButton mb = new MpButton(p);
	    mb.setBounds(220, 435, 75, 35);
	}
	    
	public MpButton() {
	    MpButton mb = new MpButton();
	    mb.setBounds(630, 435, 75, 35); //적 mp버튼
	}
	
	public void addAction() {
		this.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			this.p.drinkMPpotion();
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// "Mp물약버튼입니다" + 효과 및 쿨타임 설명

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

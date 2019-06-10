package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class HpButton extends JButton implements MouseListener{

	private Player p;
	
	public HpButton(Player player) { //hp, mp 버튼이 스킬1,2 버튼처럼 위아래로 붙어있다는 가정하에 만듬
		this.p=player;
		HpButton hb = new HpButton(p);
	    hb.setBounds(220, 400, 75, 35);
	} 
	public HpButton() {
	    HpButton hb = new HpButton();
	    hb.setBounds(630, 400, 75, 35); //적 hp버튼
	}
	
	public void addAction() {
		this.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			this.p.drinkHPpotion();
			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		// "Hp물약버튼입니다" + 효과 및 쿨타임 설명

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


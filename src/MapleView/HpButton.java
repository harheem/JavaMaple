package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class HpButton extends JButton implements MouseListener{

	private Player p;
	
	public HpButton(Player player) { //HpButton은 HpPotion 버튼이에요. Hp바는 ProgressBar로 표시합니다.
		this.p=player;
	    this.setSize(65, 35);
		this.addAction();
	} 
	
	public HpButton() {
	    this.setSize(65, 35);
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


package MapleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import MapleClass.Player;

public class HpButton extends JButton implements MouseListener{

	private Player p;
	
	public HpButton(Player player) { //hp, mp ��ư�� ��ų1,2 ��ưó�� ���Ʒ��� �پ��ִٴ� �����Ͽ� ����
		this.p=player;
		HpButton hb = new HpButton(p);
	    hb.setBounds(220, 400, 75, 35);
	} 
	public HpButton() {
	    HpButton hb = new HpButton();
	    hb.setBounds(630, 400, 75, 35); //�� hp��ư
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
		// "Hp�����ư�Դϴ�" + ȿ�� �� ��Ÿ�� ����

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


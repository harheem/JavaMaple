package MapleView;

public class HpButton extends JButton implements MouseListener{

	private Player p;
	
	public MpButton(Player player) {
		this.p=player
	}
	
	public void addAction() {
		MpButton.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			this.p.drinkHpPotion();
			
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


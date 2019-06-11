package MapleView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MapleClass.Player;

public class SelectView extends JFrame{ //View���� ��ư�� ������ �߰� �� Location ����. Button���� ��ư�� ������ �� ������ ����.
	
	SelectButton sb;
	private int yLctn; // ������ ��ư y��ǥ
	private int index; // ����ڰ� ������ ���� �ε�����ȣ
	
	public SelectView() {
		this.sb = new SelectButton();
		this.yLctn = 110; //setBound���� �ʿ�. �켱 ���Ǽ����� ������.

		for (int i = 0; i < 8; i++) { 
			int num=i;
			
			sb.imgButton[num].setLocation(220, 440);
			sb.nameButton[num].setLocation(630, this.yLctn);
			sb.nameButton[num].addMouseListener(new MouseListener() { //View�� ���ٱ���� �ʿ��� ��ư�� View���� ���(��)����
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);					
					// ���� ȭ�� �Ѿ�� ���. ��� �����ϴ���... main���� ���ѷ��� üũ��? View���� ������? �� ��?
					dispose();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					sb.imgButton[num].setVisible(true); 
				}

				@Override
				public void mouseExited(MouseEvent e) {
					sb.imgButton[num].setVisible(false);
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}
				
			});
			this.yLctn += 50;
		}
	}
	

	public int getIndex() { 
		return this.index;
	}
	
	public void setIndex(int i) {
		this.index=i;
	}

}


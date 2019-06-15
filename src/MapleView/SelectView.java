package MapleView;

import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MapleClass.*;
import MapleController.Main;
import control.UserDataList;

public class SelectView extends JFrame{ //View���� ��ư�� ������ �߰� �� Location ����. Button���� ��ư�� ������ �� ������ ����.
	
	private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private SelectButton sb;
	private int yLctn; // ������ ��ư y��ǥ
	private int index; // ����ڰ� ������ ���� �ε�����ȣ
	
	public SelectView() {
		// ����̹���
		defaultViewSet();
		this.sb = new SelectButton();
		this.yLctn = 60; //setBound���� �ʿ�. �켱 ���Ǽ����� ������.

		for (int i = 0; i < 8; i++) { 
			int num=i;
			
			sb.imgButton[num].setLocation(250, 110);
			sb.imgButton[num].setVisible(false); // ����img��ư�� ����name��ư�� ���콺�� �÷��� ���̵��� ��.
			sb.nameButton[num].setLocation(1020, this.yLctn);
			sb.nameButton[num].addMouseListener(new MouseListener() { //View�� ���ٱ���� �ʿ��� ��ư�� View���� ���(��)����
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);					
					// ���� ȭ�� �Ѿ�� ���.
					dispose();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					sb.imgButton[num].setVisible(true); 
					show_msg(num);
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
			this.add(sb.imgButton[num]);
			this.add(sb.nameButton[num]);
			this.yLctn += 80;
		}
	}
	public void show_msg(int num) {
		switch(num) {
		case 0:
			sb.nameButton[num].setToolTipText(�ȶ��.getExplanation());
			break;
		case 1:
			sb.nameButton[num].setToolTipText(��ũ����Ʈ.getExplanation());	
			break;
		case 2:
			sb.nameButton[num].setToolTipText(���츶����.getExplanation());	
			break;
		case 3:
			sb.nameButton[num].setToolTipText(�ű�.getExplanation());	
			break;
		case 4:
			sb.nameButton[num].setToolTipText(�ҵ�.getExplanation());	
			break;
		case 5:
			sb.nameButton[num].setToolTipText(����.getExplanation());	
			break;
		case 6:
			sb.nameButton[num].setToolTipText(����Ʈ�ε�.getExplanation());	
			break;
		case 7:
			sb.nameButton[num].setToolTipText(������.getExplanation());	
			break;
		}
	}
	public void defaultViewSet()
	{
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(new Color(0, 0, 0, 0));
		this.selectBackground = new ImageIcon(Main.class.getResource("../image/background/ClassSelect.jpg")).getImage();
		this.setVisible(true);
		this.setLayout(null);
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(selectBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	public int getIndex() { 
		return this.index;
	}
	
	public void setIndex(int i) {
		this.index=i;
	}

}


package view.mapleView;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cotroller.Main;
import model.control.UserDataList;
import model.mapleClass.*;

public class SelectView extends JFrame { // View���� ��ư�� ������ �߰� �� Location ����. Button���� ��ư�� ������ �� ������ ����.

	JButton[] nameButton, imgButton;
	private ImageIcon[] img, name;
	private Image screenImage, selectBackground;
	private Graphics screenGraphic;
	private int yLctn; // ������ ��ư y��ǥ
	private int index; // ����ڰ� ������ ���� �ε�����ȣ

	public SelectView() {
		// ��ư
		this.nameButton = new JButton[8];
		this.imgButton = new JButton[8];
		this.img = new ImageIcon[8];
		this.name = new ImageIcon[8];

		for (int i = 0; i < 8; i++) {
			this.imgButton[i] = new JButton();
			this.nameButton[i] = new JButton();
			this.img[i] = new ImageIcon(Main.class.getResource("../image/characterByNum/" + i + ".png"));
			this.imgButton[i].setIcon(this.img[i]);
			this.name[i] = new ImageIcon(Main.class.getResource("../image/charNameByNum/" + i + ".png"));
			this.nameButton[i].setIcon(this.name[i]);
			this.imgButton[i].setSize(500, 600); // setSize ���� ������ �߷������� �ʴ� �ٸ� ���
			this.nameButton[i].setSize(260, 100);
			this.nameButton[i].setBorderPainted(false);
			this.nameButton[i].setContentAreaFilled(false);
			this.nameButton[i].setFocusPainted(false);
			this.imgButton[i].setBorderPainted(false);
			this.imgButton[i].setContentAreaFilled(false);
			this.imgButton[i].setFocusPainted(false);
		}
		// ����̹���
		defaultViewSet();
		this.yLctn = 60; // setBound���� �ʿ�. �켱 ���Ǽ����� ������.

		for (int i = 0; i < 8; i++) {
			int num = i;

			this.imgButton[num].setLocation(250, 110);
			this.imgButton[num].setVisible(false); // ����img��ư�� ����name��ư�� ���콺�� �÷��� ���̵��� ��.
			this.nameButton[num].setLocation(980, this.yLctn);
			this.nameButton[num].addMouseListener(new MouseListener() { // View�� ���ٱ���� �ʿ��� ��ư�� View���� ���(��)����
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);
					// ���� ȭ�� �Ѿ�� ���.
					dispose();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					imgButton[num].setVisible(true);
					show_msg(num);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					imgButton[num].setVisible(false);
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
			this.add(this.imgButton[num]);
			this.add(this.nameButton[num]);
			this.yLctn += 80;
		}
	}

	public void show_msg(int num) {
		switch (num) {
		case 0:
			this.nameButton[num].setToolTipText(�ȶ��.getExplanation());
			break;
		case 1:
			this.nameButton[num].setToolTipText(��ũ����Ʈ.getExplanation());
			break;
		case 2:
			this.nameButton[num].setToolTipText(���츶����.getExplanation());
			break;
		case 3:
			this.nameButton[num].setToolTipText(�ű�.getExplanation());
			break;
		case 4:
			this.nameButton[num].setToolTipText(�ҵ�.getExplanation());
			break;
		case 5:
			this.nameButton[num].setToolTipText(����.getExplanation());
			break;
		case 6:
			this.nameButton[num].setToolTipText(����Ʈ�ε�.getExplanation());
			break;
		case 7:
			this.nameButton[num].setToolTipText(������.getExplanation());
			break;
		}
	}

	public void defaultViewSet() {
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
		this.index = i;
	}

}
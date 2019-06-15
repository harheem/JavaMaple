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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import MapleClass.*;
import MapleController.Main;
import control.UserDataList;

public class SelectView extends JFrame { // View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.

	JButton[] nameButton, imgButton;
	private ImageIcon[] img, name;
	private Image screenImage, selectBackground;
	private Graphics screenGraphic;
	private int yLctn; // 직업명 버튼 y좌표
	private int index; // 사용자가 선택한 직업 인덱스번호

	public SelectView() {
		// 버튼
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
			this.imgButton[i].setSize(500, 600); // setSize 말고 사진이 잘려보이지 않는 다른 기능
			this.nameButton[i].setSize(180, 50);
			this.nameButton[i].setBorderPainted(false);
			this.nameButton[i].setContentAreaFilled(false);
			this.nameButton[i].setFocusPainted(false);
			this.imgButton[i].setBorderPainted(false);
			this.imgButton[i].setContentAreaFilled(false);
			this.imgButton[i].setFocusPainted(false);
		}
		// 배경이미지
		defaultViewSet();
		this.yLctn = 60; // setBound과정 필요. 우선 임의설정한 값들임.

		for (int i = 0; i < 8; i++) {
			int num = i;

			this.imgButton[num].setLocation(250, 110);
			this.imgButton[num].setVisible(false); // 직업img버튼은 직업name버튼에 마우스를 올려야 보이도록 함.
			this.nameButton[num].setLocation(1020, this.yLctn);
			this.nameButton[num].addMouseListener(new MouseListener() { // View쪽 접근기능이 필요한 버튼은 View에서 기능(재)정의
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);
					// 다음 화면 넘어가기 기능.
					dispose();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					this.imgButton[num].setVisible(true);
					show_msg(num);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					this.imgButton[num].setVisible(false);
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
			this.nameButton[num].setToolTipText(팔라딘.getExplanation());
			break;
		case 1:
			this.nameButton[num].setToolTipText(다크나이트.getExplanation());
			break;
		case 2:
			this.nameButton[num].setToolTipText(보우마스터.getExplanation());
			break;
		case 3:
			this.nameButton[num].setToolTipText(신궁.getExplanation());
			break;
		case 4:
			this.nameButton[num].setToolTipText(불독.getExplanation());
			break;
		case 5:
			this.nameButton[num].setToolTipText(썬콜.getExplanation());
			break;
		case 6:
			this.nameButton[num].setToolTipText(나이트로드.getExplanation());
			break;
		case 7:
			this.nameButton[num].setToolTipText(섀도어.getExplanation());
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

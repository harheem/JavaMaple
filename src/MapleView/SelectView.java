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

public class SelectView extends JFrame{ //View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.
	
	private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private SelectButton sb;
	private int yLctn; // 직업명 버튼 y좌표
	private int index; // 사용자가 선택한 직업 인덱스번호
	
	public SelectView() {
		// 배경이미지
		defaultViewSet();
		this.sb = new SelectButton();
		this.yLctn = 60; //setBound과정 필요. 우선 임의설정한 값들임.

		for (int i = 0; i < 8; i++) { 
			int num=i;
			
			sb.imgButton[num].setLocation(250, 110);
			sb.imgButton[num].setVisible(false); // 직업img버튼은 직업name버튼에 마우스를 올려야 보이도록 함.
			sb.nameButton[num].setLocation(1020, this.yLctn);
			sb.nameButton[num].addMouseListener(new MouseListener() { //View쪽 접근기능이 필요한 버튼은 View에서 기능(재)정의
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);					
					// 다음 화면 넘어가기 기능.
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
			sb.nameButton[num].setToolTipText(팔라딘.getExplanation());
			break;
		case 1:
			sb.nameButton[num].setToolTipText(다크나이트.getExplanation());	
			break;
		case 2:
			sb.nameButton[num].setToolTipText(보우마스터.getExplanation());	
			break;
		case 3:
			sb.nameButton[num].setToolTipText(신궁.getExplanation());	
			break;
		case 4:
			sb.nameButton[num].setToolTipText(불독.getExplanation());	
			break;
		case 5:
			sb.nameButton[num].setToolTipText(썬콜.getExplanation());	
			break;
		case 6:
			sb.nameButton[num].setToolTipText(나이트로드.getExplanation());	
			break;
		case 7:
			sb.nameButton[num].setToolTipText(섀도어.getExplanation());	
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


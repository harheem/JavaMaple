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
			this.nameButton[i].setSize(260, 100);
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
			this.nameButton[num].setLocation(980, this.yLctn);
			this.nameButton[num].addMouseListener(new MouseListener() { // View쪽 접근기능이 필요한 버튼은 View에서 기능(재)정의
				@Override
				public void mouseClicked(MouseEvent e) {
					setIndex(num);
					// 다음 화면 넘어가기 기능.
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
			this.nameButton[num].setToolTipText("<html>팔라딘: 절대 방어의 수호기사가 컨셉인 전사로 엘리멘탈의 힘을 충전하여 자신을 강화한다<br>버프스킬: 위협<br>MP 30소모, 자신의 방어력을 25%  증가, 적의 방어력을 25%  감소시킨다<br>공격스킬1: 블래스트 <br>MP 20소모, 검으로 적을 찌른다 <br>공격스킬2: 디바인차지   <br>MP60소모, 순간적으로 무기에 성 속성을 부여해 적들에게 성 속성 데미지를 입히고 침묵시킨다<html>");
			break;
		case 1:
			this.nameButton[num].setToolTipText("<html>다크나이트: 죽지않는 암흑기사가 컨셉인 전사로 어둠을 바탕으로 한 공격으로 쉽게 죽지않는다<br>버프 스킬: 하이퍼바디 <br>MP 30소모, 자신의 HP와 MP를 25% 증가 시킨다<br>공격 스킬1: 다크임페일 <br>MP 20소모, 어둠속성의 창을 휘두른다<br>공격 스킬2: 궁그닐 디센트 <br>MP 60소모, 거대한 신화 속의 창을 적의 머리 위에 떨어뜨려 피해를 입힌다<html>");
			break;
		case 2:
			this.nameButton[num].setToolTipText("<html>보우마스터: 다양한 속성의 화살을 사용하는 궁수로 시원한 속사포공격이 특징이다<br>버프스킬: 샤프아이즈<br>MP50소모, 자신의 공격력을 25%증가시킨다 <br>공격스킬1:  에로우 플래터 <br>MP30소모, 화살을 곡사로 발사한다<br>공격스킬2: 언카운터블 에로우 <br>MP90소모, 대상을 특정하지 않은 셀 수 없이 많은 화살을 순간적으로 전방으로 쏜다<html>");
			break;
		case 3:
			this.nameButton[num].setToolTipText("<html>신궁: 정확한 원샷 원킬의 스나이퍼가 컨셉인 궁수로 강력한 한발을 적에게 선사한다<br>버프스킬: 샤프아이즈 <br>MP50소모, 자신의 공격력을 25%증가시킨다 <br>공격스킬1: 피어싱 <brMP30소모, 강력한 관통화살을 쏜다 <br>공격스킬2: 스나이핑 <br>MP90소모, 적의 급소를 노려 치명적인 화살을 발사한다<html>");
			break;
		case 4:
			this.nameButton[num].setToolTipText("<html>불독: 불과 독속성의 치명적인 마법을 사용하는 마법사로 적에게 지속적인 피해를 입힌다<br>버프스킬: 매직가드<br>데미지의 80%를 MP로 대체한다 <br>공격스킬1: 페럴라이즈 <br>MP50소모, 독속성의 마법을 사용하여 적을 마비시킨다<br>공격스킬2: 메테오 <br>MP150소모, 하늘에 운석을 떨어뜨려 적에게 치명적인 데미지를 입힌다<html>");
			break;
		case 5:
			this.nameButton[num].setToolTipText("<html>썬콜: 얼음과 전기속성의 마법을 사용하는 마법사로 결빙된 적에게 크리티컬데미지로 공격한다<br>버프스킬: 매직가드 <br>데미지의 80%를 MP로 대체한다 <br>공격스킬1: 콜드 빔 <br>MP50소모, 날카로운 얼음 덩어리를 떨어뜨려 적에게 데미지를 준다<br>공격스킬2: 라이트닝 스피어 <br>MP150소모, 주위의  얼음소환한 뒤에 파괴시켜 광역적인 피해를 준다  <html>");
			break;
		case 6:
			this.nameButton[num].setToolTipText("<html>나이트로드: 표창을 사용하는 도적으로 원거리에서 강력하면서도 빠른 공격을 퍼붓는다<br>버프스킬: 섀도우파트너<br>MP50소모, 자신의 분신을 소환한다(분신의 공격력-> 본체의 25%)<br>MP30소모, 공격스킬1: 쿼드러플스로우 <br>표창 세개를 동시에 던진다<br>공격스킬2: 써든레이드 <br>MP90소모, 숨어 있던 동료들을 총동원하여 전체를 불바다로 만든다<html>");
			break;
		case 7:
			this.nameButton[num].setToolTipText("<html>섀도어: 단검을 주무기로 사용하는 암살자로  은신하여 적에게 다가가 치명적인 피해를 입힌다<br>버프스킬: 섀도우파트너 <br>MP50소모, 자신의 분신을 소환한다(분신의 공격력-> 본체의 25%) <br>공격스킬1: 부메랑 스텝<br>MP30소모, 은신하여 적에게 다가가 빠른 속도로 두 번 벤다 <br>공격스킬2: 암살<br>MP90소모, 은신하여 적에게 다가가 적의 급소를 연속 공격하여 엄청난 데미지를 준다<html>");
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

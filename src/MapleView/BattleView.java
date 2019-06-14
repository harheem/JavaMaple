package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import MapleClass.Player;
import MapleController.Main;

public class BattleView extends JFrame implements Runnable { // View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘
																// 설정.

	SkillButton1 sb1;
	SkillButton2 sb2; // 스킬버튼
	BuffButton buff;
	MpButton mb;
	HpButton hb;
	PlayerButton p1; // HP,MP버튼
	BuffEffectButton pbe, ebe; // 버프 이펙트
	JButton pbi, ebi; // 버프 아이콘
	EnemyButton p2;
	WeaponButton w1, w2; // 무기 버튼
	JProgressBar pHp, pMp, eHp, eMp; // 프로그레스바
	JLabel pn, en, ps1, ps2, pb, ph, pm, eh, em; // 레이블들
	JLabel timer;
	int time; // 진행시간
	boolean isUserWin; // 유저의 승리
	boolean isRestart = false; // 패배시 라운드 재시작
	Thread t = new Thread(this);
	SkillEffectButton pse, ese;
	Player p, e;
	private int stageNum;
	private Component[] cpns;
	private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;

	public BattleView(Player p, Player e) { // 사용자 : p , 적 : e. 교수님이 좋아하시는 생성자 구성
		this.p = p;
		this.e = e;
		this.stageNum = p.getW().getWpIndex() + 1; // 무기 index값+1이 스테이지 넘버
		defaultViewSet();
		this.creator();
		this.time = 0;
		this.timer = timerCreate();
		cpns = new Component[] { sb1, sb2, buff, mb, hb, p1, p2, w1, w2, pHp, pMp, eHp, eMp, pn, en, ps1, ps2, pb, ph,
				pm, eh, em, pse, ese, timer, pbe, ebe, pbi, ebi };
		this.setValue();
		this.cpnsSetLocation();
		this.cpnsAdd();
		this.setVisible(true);

		// 마우스 위치얻기위한 임시버튼
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}
		});
	}

	public void creator() {
		// JLabel
		this.pn = labelCreate(p.getName());
		this.en = labelCreate(e.getName());
		this.ps1 = labelCreate(p.getW().getSkillName()[0]);
		this.ps2 = labelCreate(p.getW().getSkillName()[1]);
		this.pb = labelCreate(p.getBuffSkillName());
		this.ph = labelCreate(null);
		this.pm = labelCreate(null);
		this.eh = labelCreate(null);
		this.em = labelCreate(null);

		this.pse = new SkillEffectButton();
		this.ese = new SkillEffectButton();

		this.pbe = new BuffEffectButton(p);
		this.ebe = new BuffEffectButton(e);

		this.pbi = buffIconCreate();
		this.ebi = buffIconCreate();

		this.sb1 = new SkillButton1(p, pse);
		this.sb2 = new SkillButton2(p, pse);
		this.buff = new BuffButton(p, pbe, pbi);
		this.mb = new MpButton(p);
		this.hb = new HpButton(p);
		this.p1 = new PlayerButton(p);
		this.p2 = new EnemyButton(e, ese, ebe, ebi);
		this.w1 = new WeaponButton(p);
		this.w2 = new WeaponButton(e);
		this.pHp = new HpProgressBar(p, ph); // 플레이어 hp
		this.pMp = new MpProgressBar(p, pm); // " mp
		this.eHp = new HpProgressBar(e, eh); // 적 hp
		this.eMp = new MpProgressBar(e, em); // " mp

	}

	public void run() {
		while (true) {
			timer.setText("경과시간:" + Double.toString((double) time / 10));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (p.getHp() <= 0 || e.getHp() <= 0) {
				JButton win = new JButton();
				JButton lose = new JButton();
				win.setText("win!");
				lose.setText("lose!");
				win.setSize(100, 30);
				lose.setSize(100, 30);
				this.add(win);
				this.add(lose);
				if (e.getHp() <= 0) {
					win.setLocation(240, 370);
					lose.setLocation(960, 370);
					this.isUserWin = true;
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				} else {
					win.setLocation(960, 370);
					lose.setLocation(240, 370);

					this.isUserWin = false;
					JButton restart = new JButton();
					JButton goSelect = new JButton();
					JButton exit = new JButton();
					restart.setSize(120, 30);
					goSelect.setSize(120, 30);
					exit.setSize(120, 30);
					restart.setText("다시하기");
					goSelect.setText("처음화면으로");
					exit.setText("종료");
					restart.setLocation(450, 500);
					goSelect.setLocation(600, 500);
					exit.setLocation(750, 500);
					this.add(restart);
					this.add(goSelect);
					this.add(exit);

					restart.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							isRestart = true;
							dispose();
						}

					});
					goSelect.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							isRestart = false;
							dispose();
						}

					});
					exit.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							JOptionPane.showMessageDialog(null, "프로그램을 종료합니다!");
							System.exit(0);
						}

					});
					t.stop();
				}
			}
			this.time++;
		}
	}

	public JButton buffIconCreate() {
		JButton rt = new JButton();
		rt.setSize(60, 60);
		rt.setVisible(false);
		return rt;
	}

	public JLabel timerCreate() {
		JLabel rt = new JLabel();
		rt.setForeground(Color.BLACK);
		rt.setHorizontalAlignment(SwingConstants.CENTER);
		rt.setFont(new Font("굴림", Font.BOLD, 24));
		rt.setSize(200, 50);
		t.start();
		return rt;
	}

	public JLabel labelCreate(String name) {
		JLabel rt = new JLabel();
		rt.setSize(80, 30);
		rt.setForeground(Color.BLACK);
		rt.setHorizontalAlignment(SwingConstants.CENTER);
		rt.setFont(new Font("굴림", Font.BOLD, 10));
		rt.setText(name);
		return rt;
	}

	public void defaultViewSet() {
		selectBackground = new ImageIcon(Main.class.getResource("../image/background/stage" + stageNum + ".jpg"))
				.getImage();
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(new Color(0, 0, 0, 0));
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

	public void setValue() {
		this.pHp.setValue(p.getHp());
		this.pMp.setValue(p.getMp());
		this.eHp.setValue(e.getHp());
		this.eMp.setValue(e.getMp());
	}

	public void cpnsAdd() {
		for (int i = 0; i < this.cpns.length; i++)
			add(this.cpns[i]);
	}

	public void cpnsSetLocation() {
		this.sb1.setLocation(20, 400);
		this.sb2.setLocation(20, 485);
		this.buff.setLocation(20, 320);
		this.hb.setLocation(110, 370);
		this.mb.setLocation(110, 445);
		this.p1.setLocation(100, 120);
		this.p2.setLocation(850, 120);
		this.w1.setLocation(150, 600);
		this.w2.setLocation(870, 600);
		this.pHp.setLocation(230, 600);
		this.pMp.setLocation(230, 650);
		this.eHp.setLocation(950, 600);
		this.eMp.setLocation(950, 650);

		// label
		this.pn.setLocation(220, 573);
		this.en.setLocation(930, 573);
		this.ps1.setLocation(15, 375);
		this.ps2.setLocation(15, 460);
		this.pb.setLocation(15, 285);
		this.ph.setLocation(430, 600);
		this.pm.setLocation(430, 650);
		this.eh.setLocation(1150, 600);
		this.em.setLocation(1150, 650);

		this.pse.setLocation(450, 250);
		this.ese.setLocation(680, 250);

		this.timer.setLocation(550, 250);

		this.pbe.setLocation(230, 220);
		this.ebe.setLocation(850, 220);

		this.pbi.setLocation(300, 220);
		this.ebi.setLocation(1000, 220);
	}

}

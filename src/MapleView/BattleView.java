package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import MapleClass.Player;
import MapleController.Main;

public class BattleView extends JFrame implements Runnable { // View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘
																// 설정.

	SkillButton1 sb1; // 스킬1버튼
	SkillButton2 sb2; // 스킬2버튼
	BuffButton buff; // 버프버튼
	HpButton hb; // hp버튼
	MpButton mb; // mp버튼
	PlayerButton p1; // HP,MP버튼
	BuffEffectButton pbe, ebe; // 버프 이펙트
	JButton pbi, ebi; // 버프 아이콘
	EnemyButton p2; // enemy버튼(쓰레드)
	WeaponButton w1, w2; // 무기 버튼
	JProgressBar pHp, pMp, eHp, eMp; // 프로그레스바
	JLabel pn, en, ps1, ps2, pb, ph, pm, eh, em, hp, mp;// 레이블들
	JLabel timer; // 타이머
	SkillEffectButton pse, ese; // 스킬이펙트버튼

	private Player p, e;
	private Thread t = new Thread(this); // 타이머쓰레드
	private int stageNum; // 스테이지 화면표시
	private int time; // 타이머 표현하기위한 변수
	private Component[] cpns; // 컨포넌트들 담아서 한번에추가
	private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;

	// 각각 mp가 없을때 버프사용을 막기위한 변수입니다. true면 mp가 없어서 스킬을 못쓰는 상태입니다.
	private boolean buffIssue;
	private boolean skill1Issue;
	private boolean skill2Issue;

	public BattleView(Player p, Player e) { // 사용자 : p , 적 : e. 교수님이 좋아하시는 생성자 구성

		// 플레이어 두명 설정하기
		this.p = p;
		this.e = e;

		// 스킬사용 가능하게하기
		buffIssue = false;
		skill1Issue = false;
		skill2Issue = false;
		// 스테이지 배경 설정하기
		this.stageNum = p.getW().getWpIndex() + 1; // 무기 index값+1이 스테이지 넘버
		defaultViewSet();

		// 타이머쓰레드 실행
		this.time = 0;
		this.timer = timerCreate();
		// 컴포넌트 생성-부착하기
		this.creator();
		cpns = new Component[] { sb1, sb2, buff, mb, hb, p1, p2, w1, w2, pHp, pMp, eHp, eMp, pn, en, ps1, ps2, pb, ph,
				pm, eh, em, pse, ese, timer, pbe, ebe, pbi, ebi, hp, mp };
		this.cpnsSetLocation();
		this.cpnsAdd();

		this.setVisible(true);

		// 마우스 위치얻기위한 임시이벤트리스너 (나중에 삭제요망!)
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}
		});
	}

	// 프레임 설정 위한 메서드
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

	// 컴포넌트 생성 메서드
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
		this.hp = labelCreate("HP");
		this.mp = labelCreate("MP");
		this.pse = new SkillEffectButton();
		this.ese = new SkillEffectButton();

		// Button
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

		// ProgressBar
		this.pHp = new HpProgressBar(p, ph); // 플레이어 hp
		this.pMp = new MpProgressBar(p, pm); // " mp
		this.eHp = new HpProgressBar(e, eh); // 적 hp
		this.eMp = new MpProgressBar(e, em); // " mp

	}

	public JButton buffIconCreate() {
		JButton rt = new JButton();
		rt.setSize(60, 60);
		rt.setVisible(false);
		return rt;
	}

	public JLabel timerCreate() {
		JLabel rt = new JLabel();
		rt.setForeground(Color.white);
		rt.setOpaque(true);
		rt.setBackground(Color.black);
		rt.setHorizontalAlignment(SwingConstants.CENTER);
		rt.setFont(new Font("Gothic", Font.ITALIC, 30));
		rt.setSize(150, 50);
		t.start();
		return rt;
	}

	public JLabel labelCreate(String name) {
		JLabel rt = new JLabel();
		rt.setSize(100, 30);
		rt.setForeground(Color.BLACK);
		rt.setHorizontalAlignment(SwingConstants.CENTER);
		rt.setFont(new Font("굴림", Font.BOLD, 12));
		rt.setText(name);
		return rt;
	}

	// 컴포넌트 위치설정
	public void cpnsSetLocation() {

		this.timer.setLocation(1130, 10); // 타이머

		// button
		this.buff.setLocation(50, 320); // 버프버튼
		this.sb1.setLocation(50, 410); // 스킬1버튼
		this.sb2.setLocation(50, 505); // 스킬2버튼

		this.hb.setLocation(140, 370); // hp물약버튼
		this.mb.setLocation(140, 465); // mp물악버튼

		this.p1.setLocation(190, 250); // 플레이어
		this.p2.setLocation(850, 250); // enemy

		this.w1.setLocation(180, 590); // 플레이어 무기
		this.w2.setLocation(870, 590); // enemy 무기

		this.pHp.setLocation(260, 600); // 플레이어 hp프로그레스바
		this.pMp.setLocation(260, 630); // 플레이어 mp프로그레스바
		this.eHp.setLocation(950, 600); // 에너미 hp프로그레스바
		this.eMp.setLocation(950, 630); // 에너미 mp프로그레스바

		this.pbe.setLocation(160, 120); // 플레이어 버프 이펙트
		this.ebe.setLocation(1050, 120); // enemy 버프 이펙트
		this.pbi.setLocation(360, 220); // 플레이어 버프 아이콘( 버프사용시 플레이어 머리위에 뜸)
		this.ebi.setLocation(1000, 220); // enmy 버프 아이콘

		this.pse.setLocation(480, 250); // 플레이어 스킬이펙트
		this.ese.setLocation(580, 250); // enemy 스킬이펙트

		// label
		this.pn.setLocation(250, 573); // 플레이어이름
		this.en.setLocation(930, 573); // 적이름

		this.pb.setLocation(35, 285); // 플레이어 버프스킬이름
		this.ps1.setLocation(35, 385); // 플레이어스킬1이름
		this.ps2.setLocation(35, 480); // 플레이어스킬2이름

		this.hp.setLocation(120, 340);
		this.mp.setLocation(120, 435);

		this.ph.setLocation(460, 600); // 플레이어 hp상태보이기
		this.pm.setLocation(460, 630); // 플레이어 mp상태보이기
		this.eh.setLocation(1150, 600); // enemy hp상태보이기
		this.em.setLocation(1150, 630); // enemy mp상태보이기

	}

	// 컴포넌트 프레임에 부착
	public void cpnsAdd() {
		for (int i = 0; i < this.cpns.length; i++)
			add(this.cpns[i]);
	}

	// 쓰레드(타이머)실행 + 스킬버튼에서 mp가 부족하면 스킬 못쓰게 막기
	public void run() {
		while (true) {
			timer.setText("Time:" + Double.toString((double) time / 10));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.time++;
			checkMpIssue();// 스킬버튼 관리

		}
	}

	// 플레이어의 mp에따른 스킬사용가능여부 조사
	public void checkMpIssue() {
		// buff
		if (this.buffIssue == false && buff.isEnabled() && p.getMp() < p.getBuffSkillMp()) // 버프버튼을 쓸 수 있지만 mp가 부족한경우
		{
			buff.setEnabled(false);
			this.buffIssue = true;
		} else if (this.buffIssue == true && p.getMp() >= p.getBuffSkillMp()) // mp문제로 버프버튼을 쓸 수 없었지만 mp가 회복된 경우
		{
			buff.setEnabled(true);
			this.buffIssue = false;
		}

		// skill1
		if (this.skill1Issue == false && sb1.isEnabled() && p.getMp() < p.getW().getSkillMP()[0]) {
			sb1.setEnabled(false);
			this.skill1Issue = true;
		} else if (this.skill1Issue == true && p.getMp() >= p.getW().getSkillMP()[0]) // mp문제로 버프버튼을 쓸 수 없었지만 mp가 회복된 경우
		{
			sb1.setEnabled(true);
			this.skill1Issue = false;
		}

		// skill2
		if (this.skill2Issue == false && sb2.isEnabled() && p.getMp() < p.getW().getSkillMP()[1]) {
			sb2.setEnabled(false);
			this.skill2Issue = true;
		} else if (this.skill2Issue == true && p.getMp() >= p.getW().getSkillMP()[1]) // mp문제로 버프버튼을 쓸 수 없었지만 mp가 회복된 경우
		{
			sb2.setEnabled(true);
			this.skill2Issue = false;
		}
	}

	public int getTime() {
		return this.time;
	} // 타이머 시간 return 나중에 기록으로 쓰시려면 Control에서 배틀뷰 닫을때 타임을 받아가면 될 것 같습니다!
	
	public void threadStop() //게임 종료시 쓰레드를 모두 종료시키는 메서드
	{
		t.stop(); //타이머쓰레드
		p2.stop(); //에너미 버튼 쓰레드 
	}
}


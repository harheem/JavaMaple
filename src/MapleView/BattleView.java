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

public class BattleView extends JFrame implements Runnable { // View���� ��ư�� ������ �߰� �� Location ����. Button���� ��ư�� ������ �� ������
																// ����.

	SkillButton1 sb1; // ��ų1��ư
	SkillButton2 sb2; // ��ų2��ư
	BuffButton buff; // ������ư
	HpButton hb; // hp��ư
	MpButton mb; // mp��ư
	PlayerButton p1; // HP,MP��ư
	BuffEffectButton pbe, ebe; // ���� ����Ʈ
	JButton pbi, ebi; // ���� ������
	EnemyButton p2; // enemy��ư(������)
	WeaponButton w1, w2; // ���� ��ư
	JProgressBar pHp, pMp, eHp, eMp; // ���α׷�����
	JLabel pn, en, ps1, ps2, pb, ph, pm, eh, em, hp, mp;// ���̺��
	JLabel timer; // Ÿ�̸�
	SkillEffectButton pse, ese; // ��ų����Ʈ��ư

	private Player p, e;
	private Thread t = new Thread(this); // Ÿ�̸Ӿ�����
	private int stageNum; // �������� ȭ��ǥ��
	private int time; // Ÿ�̸� ǥ���ϱ����� ����
	private Component[] cpns; // ������Ʈ�� ��Ƽ� �ѹ����߰�
	private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;

	// ���� mp�� ������ ��������� �������� �����Դϴ�. true�� mp�� ��� ��ų�� ������ �����Դϴ�.
	private boolean buffIssue;
	private boolean skill1Issue;
	private boolean skill2Issue;

	public BattleView(Player p, Player e) { // ����� : p , �� : e. �������� �����Ͻô� ������ ����

		// �÷��̾� �θ� �����ϱ�
		this.p = p;
		this.e = e;

		// ��ų��� �����ϰ��ϱ�
		buffIssue = false;
		skill1Issue = false;
		skill2Issue = false;
		// �������� ��� �����ϱ�
		this.stageNum = p.getW().getWpIndex() + 1; // ���� index��+1�� �������� �ѹ�
		defaultViewSet();

		// Ÿ�̸Ӿ����� ����
		this.time = 0;
		this.timer = timerCreate();
		// ������Ʈ ����-�����ϱ�
		this.creator();
		cpns = new Component[] { sb1, sb2, buff, mb, hb, p1, p2, w1, w2, pHp, pMp, eHp, eMp, pn, en, ps1, ps2, pb, ph,
				pm, eh, em, pse, ese, timer, pbe, ebe, pbi, ebi, hp, mp };
		this.cpnsSetLocation();
		this.cpnsAdd();

		this.setVisible(true);

		// ���콺 ��ġ������� �ӽ��̺�Ʈ������ (���߿� �������!)
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " " + e.getY());
			}
		});
	}

	// ������ ���� ���� �޼���
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

	// ������Ʈ ���� �޼���
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
		this.pHp = new HpProgressBar(p, ph); // �÷��̾� hp
		this.pMp = new MpProgressBar(p, pm); // " mp
		this.eHp = new HpProgressBar(e, eh); // �� hp
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
		rt.setFont(new Font("����", Font.BOLD, 12));
		rt.setText(name);
		return rt;
	}

	// ������Ʈ ��ġ����
	public void cpnsSetLocation() {

		this.timer.setLocation(1130, 10); // Ÿ�̸�

		// button
		this.buff.setLocation(50, 320); // ������ư
		this.sb1.setLocation(50, 410); // ��ų1��ư
		this.sb2.setLocation(50, 505); // ��ų2��ư

		this.hb.setLocation(140, 370); // hp�����ư
		this.mb.setLocation(140, 465); // mp���ǹ�ư

		this.p1.setLocation(190, 250); // �÷��̾�
		this.p2.setLocation(850, 250); // enemy

		this.w1.setLocation(180, 590); // �÷��̾� ����
		this.w2.setLocation(870, 590); // enemy ����

		this.pHp.setLocation(260, 600); // �÷��̾� hp���α׷�����
		this.pMp.setLocation(260, 630); // �÷��̾� mp���α׷�����
		this.eHp.setLocation(950, 600); // ���ʹ� hp���α׷�����
		this.eMp.setLocation(950, 630); // ���ʹ� mp���α׷�����

		this.pbe.setLocation(160, 120); // �÷��̾� ���� ����Ʈ
		this.ebe.setLocation(1050, 120); // enemy ���� ����Ʈ
		this.pbi.setLocation(360, 220); // �÷��̾� ���� ������( �������� �÷��̾� �Ӹ����� ��)
		this.ebi.setLocation(1000, 220); // enmy ���� ������

		this.pse.setLocation(480, 250); // �÷��̾� ��ų����Ʈ
		this.ese.setLocation(580, 250); // enemy ��ų����Ʈ

		// label
		this.pn.setLocation(250, 573); // �÷��̾��̸�
		this.en.setLocation(930, 573); // ���̸�

		this.pb.setLocation(35, 285); // �÷��̾� ������ų�̸�
		this.ps1.setLocation(35, 385); // �÷��̾ų1�̸�
		this.ps2.setLocation(35, 480); // �÷��̾ų2�̸�

		this.hp.setLocation(120, 340);
		this.mp.setLocation(120, 435);

		this.ph.setLocation(460, 600); // �÷��̾� hp���º��̱�
		this.pm.setLocation(460, 630); // �÷��̾� mp���º��̱�
		this.eh.setLocation(1150, 600); // enemy hp���º��̱�
		this.em.setLocation(1150, 630); // enemy mp���º��̱�

	}

	// ������Ʈ �����ӿ� ����
	public void cpnsAdd() {
		for (int i = 0; i < this.cpns.length; i++)
			add(this.cpns[i]);
	}

	// ������(Ÿ�̸�)���� + ��ų��ư���� mp�� �����ϸ� ��ų ������ ����
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
			checkMpIssue();// ��ų��ư ����

		}
	}

	// �÷��̾��� mp������ ��ų��밡�ɿ��� ����
	public void checkMpIssue() {
		// buff
		if (this.buffIssue == false && buff.isEnabled() && p.getMp() < p.getBuffSkillMp()) // ������ư�� �� �� ������ mp�� �����Ѱ��
		{
			buff.setEnabled(false);
			this.buffIssue = true;
		} else if (this.buffIssue == true && p.getMp() >= p.getBuffSkillMp()) // mp������ ������ư�� �� �� �������� mp�� ȸ���� ���
		{
			buff.setEnabled(true);
			this.buffIssue = false;
		}

		// skill1
		if (this.skill1Issue == false && sb1.isEnabled() && p.getMp() < p.getW().getSkillMP()[0]) {
			sb1.setEnabled(false);
			this.skill1Issue = true;
		} else if (this.skill1Issue == true && p.getMp() >= p.getW().getSkillMP()[0]) // mp������ ������ư�� �� �� �������� mp�� ȸ���� ���
		{
			sb1.setEnabled(true);
			this.skill1Issue = false;
		}

		// skill2
		if (this.skill2Issue == false && sb2.isEnabled() && p.getMp() < p.getW().getSkillMP()[1]) {
			sb2.setEnabled(false);
			this.skill2Issue = true;
		} else if (this.skill2Issue == true && p.getMp() >= p.getW().getSkillMP()[1]) // mp������ ������ư�� �� �� �������� mp�� ȸ���� ���
		{
			sb2.setEnabled(true);
			this.skill2Issue = false;
		}
	}

	public int getTime() {
		return this.time;
	} // Ÿ�̸� �ð� return ���߿� ������� ���÷��� Control���� ��Ʋ�� ������ Ÿ���� �޾ư��� �� �� �����ϴ�!
	
	public void threadStop() //���� ����� �����带 ��� �����Ű�� �޼���
	{
		t.stop(); //Ÿ�̸Ӿ�����
		p2.stop(); //���ʹ� ��ư ������ 
	}
}


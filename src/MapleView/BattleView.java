package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import MapleClass.Player;


public class BattleView extends JFrame { //View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.
	
		SkillButton1 sb1; SkillButton2 sb2; BuffButton buff; MpButton mb; HpButton hb; PlayerButton p1;
		EnemyButton p2; WeaponButton w1, w2; JProgressBar pHp, pMp, eHp, eMp;
		JLabel pn, en, ps1, ps2, pb, es1, es2, eb, ph, pm, eh, em;
		SkillEffectButton pse,ese;
		private Component[] cpns;
		private Image screenImage;
		private Image selectBackground = new ImageIcon(Main.class.getResource("../image/background/Stage1.png")).getImage();
		private Graphics screenGraphic;
	public BattleView(Player p, Player e) { // 사용자 : p , 적 : e. 교수님이 좋아하시는 생성자 구성
		defaultViewSet();
		this.creator(p, e);
		cpns = new Component[]{sb1,sb2,buff,mb,hb,p1,p2,w1,w2,pHp,pMp,eHp,eMp,pn,en,ps1,ps2,pb,es1,es2,eb,ph,pm,eh,em,pse,ese};
		this.setValue(p, e);
		this.cpnsSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
		
		//마우스 위치얻기위한 임시버튼
		this.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				System.out.println(e.getX() + " " + e.getY());
			}
		});
	}
	public void creator(Player p, Player e) {
		//JLabel
		this.pn = labelCreate("이름: " + p.getName());
		this.en = labelCreate("이름: " + e.getName());
		this.ps1 = labelCreate("스킬1: " + p.getW().getSkillName()[0]);
		this.ps2 = labelCreate("스킬2: " + p.getW().getSkillName()[1]);
		this.pb = labelCreate("버프: " +p.getBuffSkillName());
		this.es1 = labelCreate("스킬1: " +e.getW().getSkillName()[0]);
		this.es2 = labelCreate("스킬2: " +e.getW().getSkillName()[1]);
		this.eb = labelCreate("버프: " +e.getBuffSkillName());
		this.ph = labelCreate(null);
		this.pm = labelCreate(null);
		this.eh = labelCreate(null);
		this.em = labelCreate(null);
		
		this.pse = new SkillEffectButton();
		this.ese = new SkillEffectButton();
		
		this.sb1 = new SkillButton1(p,pse);
		this.sb2 = new SkillButton2(p,pse);
		this.buff = new BuffButton(p);
		this.mb = new MpButton(p);
		this.hb = new HpButton(p);
		this.p1 = new PlayerButton(p);
		this.p2 = new EnemyButton(e,ese);
		this.w1 = new WeaponButton(p);
		this.w2 = new WeaponButton(e);
		this.pHp= new HpProgressBar(p,ph); //플레이어 hp
		this.pMp= new MpProgressBar(p,pm); // " mp
		this.eHp= new HpProgressBar(e,eh); //적 hp
		this.eMp= new MpProgressBar(e,em); // " mp
	
	}
	public JLabel labelCreate(String name)
	{
		JLabel rt = new JLabel();
		rt.setSize(300,30);
		rt.setForeground(Color.YELLOW);
		rt.setFont(new Font("굴림", Font.BOLD, 18));
		rt.setText(name);
		return rt;
	}
	public void defaultViewSet()
	{
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
	public void setValue(Player p, Player e) {
		this.pHp.setValue(p.getHp());
		this.pMp.setValue(p.getMp());
		this.eHp.setValue(e.getHp());
		this.eMp.setValue(e.getMp());
	}
	
	public void cpnsAdd() {
		for(int i=0;i<this.cpns.length;i++)
			add(this.cpns[i]);  
	}
	public void cpnsSetLocation() {
		this.sb1.setLocation(20,380);
		this.sb2.setLocation(20,435);
		this.buff.setLocation(20,320);
		this.hb.setLocation(110,380);
		this.mb.setLocation(110,435);
		this.p1.setLocation(230,400);
		this.p2.setLocation(950,400);
		this.w1.setLocation(150,500);
		this.w2.setLocation(1110,500);
		this.pHp.setLocation(230,600);
		this.pMp.setLocation(230,650);
		this.eHp.setLocation(950,600);
		this.eMp.setLocation(950,650);
		
		//label
		this.pn.setLocation(230,100);
		this.en.setLocation(950,100);
		this.ps1.setLocation(230,150);
		this.ps2.setLocation(230,200);
		this.pb.setLocation(230,250);
		this.es1.setLocation(950,150);
		this.es2.setLocation(950,200);
		this.eb.setLocation(950,250);
		this.ph.setLocation(430,600);
		this.pm.setLocation(430,650);
		this.eh.setLocation(1150,600);
		this.em.setLocation(1150,650);
		
		this.pse.setLocation(380,400);
		this.ese.setLocation(680,400);
	}

}

package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import MapleClass.Player;
import MapleController.Main;
//import MapleView.BattleView;

public class CheckView extends JFrame implements ActionListener{
    
	PlayerButton pb;
	EnemyButton eb;
	Player p,e;
	private int stageNum;
	private Component[] cpns;
    private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private int win; //������ �����ϱ����� �Ķ���� 
	private String lose; // ������ �����ϱ����� �Ķ����	
	private boolean restart; //�ٽ� ���������� ����
	
	JButton sb = new JButton(); //startButton ������ ��Ʋ��� �Ѿ
	JButton vb = new JButton(); // VSButton ��ɾ��� 
	JButton wb = new JButton(); //WinButton ��ɾ���
	JButton lb = new JButton(); //LoseButton ��ɾ���
	JButton rb = new JButton(); // RestartButton ������ ���� ���������� ��Ʋ��� �ٽ� �Ѿ
	JButton bb = new JButton(); // BackButton ������ ����Ʈ��� �Ѿ 
   
	//��Ʋ ȭ�� �����ϱ�
	public CheckView(Player p, Player e) { 
		this.p = p;
		this.e = e;
		this.stageNum = p.getW().getWpIndex() + 1; // ���� index��+1�� �������� �ѹ�
		defaultViewSet(); 
		this.creator();
		cpns = new Component[] {sb,vb,pb,eb}; 
		this.cpnsSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
	}
	
	//�̱�ų� ���� ��
	public CheckView(Player p, Player e, boolean win) {
		this.p =p;
		this.e =e;
		this.stageNum = p.getW().getWpIndex() + 1; // ���� index��+1�� �������� �ѹ�
		defaultViewSet();
		if(win) //�̰��� ��
		{
			this.winCreator();
			this.winSetLocation();
		}
		else //���� ��
		{
			this.loseCreator();
			this.loseSetLocation();
		}
		cpns = new Component[] {wb,lb,rb,bb,pb,eb};
		this.buttonAddActionListener(); //rb�� bb�� �����ʴޱ�
		this.cpnsAdd();
		this.setVisible(true);
		
		
	}
	
	//finalView
	public CheckView(Player p) {
		this.p =p;
		this.stageNum = p.getW().getWpIndex() + 1;// ���� index��+1�� �������� �ѹ�
		defaultViewSet();
		this.finalCreator();
		cpns = new Component[] {wb,rb,bb,pb};
		this.finalSetLocation();
		this.cpnsAdd();
		this.buttonAddActionListener(); 
		this.setVisible(true);			
	}	
	
	public void creator() {
		sb.setBorderPainted(false);
	    sb.setContentAreaFilled(false);
	    sb.setFocusPainted(false);
	    sb.setSize(310, 160);
	    sb.setIcon(new ImageIcon(Main.class.getResource("../image/check/startButton.png")));
	    sb.addActionListener(this);
		
		vb.setBorderPainted(false);
		vb.setContentAreaFilled(false);
		vb.setIcon(new ImageIcon(Main.class.getResource("../image/check/vsimg.png")));
		vb.setFocusPainted(false);
		vb.setSize(160, 110);
		
		this.pb = new PlayerButton(p,null);
		
		this.eb = new EnemyButton(e);
		
			
	}
	public void loseCreator() {
        this.pb = new PlayerButton(p,null);
        pb.setEnabled(false);
		
        this.eb = new EnemyButton(e);
       
        wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140); 
		
		lb.setBorderPainted(false);
		lb.setContentAreaFilled(false);
		lb.setFocusPainted(false);
		lb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Loseicon.png")));
		lb.setSize(240, 140); 
		
		rb.setBorderPainted(false);
	    rb.setContentAreaFilled(false);
	    rb.setFocusPainted(false);
	    rb.setIcon(new ImageIcon(Main.class.getResource("../image/check/restartButton.png")));
	    rb.setSize(310, 160);
				
		bb.setBorderPainted(false);
	    bb.setContentAreaFilled(false);
	    bb.setFocusPainted(false);
	    bb.setIcon(new ImageIcon(Main.class.getResource("../image/check/backButton.png")));
	    bb.setSize(310, 160);
				
	}
	
	public void winCreator() {
	
		sb.setBorderPainted(false);
	    sb.setContentAreaFilled(false);
	    sb.setFocusPainted(false);
	    sb.setIcon(new ImageIcon(Main.class.getResource("../image/check/startButton.png")));
	    sb.setSize(310, 160);
	    sb.addActionListener(this);
		this.pb = new PlayerButton(p,null);
       
		
        this.eb = new EnemyButton(e);
        eb.setEnabled(false);
        
        wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140); 
		
		lb.setBorderPainted(false);
		lb.setContentAreaFilled(false);
		lb.setFocusPainted(false);
		lb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Loseicon.png")));
		lb.setSize(240, 140);
				
	}
	
	public void finalCreator() {
		
		
		this.pb = new PlayerButton(p,null);
		
		wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140);
	
		rb.setBorderPainted(false);
	    rb.setContentAreaFilled(false);
	    rb.setFocusPainted(false);
	    rb.setIcon(new ImageIcon(Main.class.getResource("../image/check/restartButton.png")));
	    rb.setSize(310, 160);
		bb.setBorderPainted(false);
	    bb.setContentAreaFilled(false);
	    bb.setFocusPainted(false);
	    bb.setIcon(new ImageIcon(Main.class.getResource("../image/check/backButton.png"))); //�̰͸� �ٲ��ָ� fianlview�� �ϼ��Դϴ�..�Ф� 
//	    bb.setIcon(new ImageIcon(Main.class.getResource("../image/check/????.png")));
	    bb.setSize(310, 160);
		//this.a = new JLabel();
		//a.setText("Stage1 : "+ bv.getTime() + " ��");
		//b.setText("Stage2 : "+ bv.getTime() + " ��"); 
		//c.setText("Stage3 : "+ bv.getTime() + " ��");
		
	}
	
			
	public void defaultViewSet() {
		selectBackground = new ImageIcon(Main.class.getResource("../image/background/stage"+ stageNum +".jpg")).getImage();
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(new Color(0, 0, 0, 0));
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
	public void cpnsAdd() {
		for(int i =0; i<this.cpns.length; i++)
			add(this.cpns[i]);
	}
	
	public void cpnsSetLocation() { 
		wb.setLocation(120, 80);
		lb.setLocation(870, 100 );
		sb.setLocation(490 ,500);
		vb.setLocation(550 ,400);
		pb.setLocation(40, 80);
		eb.setLocation(790, 110);
		rb.setLocation(490, 500);
		bb.setLocation(490, 400);
		
	}
	
	public void winSetLocation() {
		this.wb.setLocation(120, 80);
		this.lb.setLocation(870, 100 );
		this.sb.setLocation(490 ,500);
		this.pb.setLocation(40, 80);
		this.eb.setLocation(790, 110);
		
	}
	public void finalSetLocation() {
		this.wb.setLocation(120, 80);
		this.pb.setLocation(40, 80);
		this.rb.setLocation(870, 500);
		this.bb.setLocation(870, 400);
	}
	public void loseSetLocation() {
		this.wb.setLocation(870, 80);
		this.lb.setLocation(120, 90 );
		this.rb.setLocation(490, 500);
		this.bb.setLocation(490, 400);
		this.pb.setLocation(40, 80);
		this.eb.setLocation(790, 110);
	}

	public void buttonAddActionListener()
	{
		sb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		rb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				restart = false;
				dispose();
			}
		});
		bb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				restart = true;
				dispose();
			}
		});
	}
	public boolean restart() {return this.restart;}
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		
	}
	
}	

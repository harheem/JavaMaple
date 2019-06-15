package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import MapleClass.Player;
import MapleController.*;
//import MapleView.BattleView;
//�÷��̾ ������ �����ϰ� �� ���� ȭ����
//ĳ���� ū�� 2���� vs ��ư, �����ϱ� ��ư�� ��

//nameimg�� ���̺��̸� �����Ͱ���

public class CheckView extends JFrame {
    
	StartButton sb; //
	VSButton vb; 
	PlayerButton pb;
	EnemyButton eb;
	Player p,e;
	WinButton wb;
	LoseButton lb;
	RestartButton rb;
	BackButton bb;
	JLabel a,b,c;
	BattleView bv;
	private int stageNum;
	private Component[] cpns;
    private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private int win;
	private String lose;
	
	
	//BattleView ����
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
	
	//Lose
	//���Ƿ� �����ڸ� �����Ͽ����ϴ�...
	public CheckView(Player p, Player e, int a ) {
		this.p =p;
		this.e =e;
		this.stageNum = p.getW().getWpIndex() + 1; // ���� index��+1�� �������� �ѹ�
		defaultViewSet();
		this.creator();
		cpns = new Component[] {wb,lb,rb,bb,pb,eb};
		this.loseSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
		
		
	}
	//Win
	//�굵��...
	public CheckView(Player p, Player e, String w ) {
		this.p =p;
		this.e =e;
		this.stageNum = p.getW().getWpIndex() + 1;// ���� index��+1�� �������� �ѹ�
		defaultViewSet();
		this.creator();
		cpns = new Component[] {wb,lb,sb,pb,eb};
		this.winSetLocation();
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
		this.setVisible(true);
			
	}
		
		
	
	public void creator() {
		this.sb = new StartButton();
		sb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			
		});
		
		//����ȭ��(��Ʋ��)�� �Ѿ�� ��ư
		
		this.vb = new VSButton();
		// vs ��ư(��� ���� ��ġ��)
		
		this.pb = new PlayerButton(p,null);
	
		//�÷��̾� ū �̹����� �����;��� 
		
		this.eb = new EnemyButton(e);
		
		//���׹��� ū �̹����� �����;���
		
		this.wb = new WinButton();
		
		//win ��ư(��� ���� ��ġ��)
		
		this.lb = new LoseButton();
		
		//lose ��ư(��� ���� ��ġ��)
		this.rb = new RestartButton(); //�ٽ� �ϱ� ��ư(������ �� ������������ �ٽý���)
		rb.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
	});
		
		
		this.bb = new BackButton();
		//ó������ ��ư(������ selectView?�� �Ѿ) 
		bb.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		
	        }); 
	}
	//CheckView ������ �����ڿ�
	public void finalCreator() {
		
		
		this.pb = new PlayerButton(p,null);
		
		//�÷��̾� ū �̹����� �����;��� 
		
        this.wb = new WinButton();
		
		//win ��ư(��� ���� ��ġ��)
		
		this.lb = new LoseButton();
		
		//lose ��ư(��� ���� ��ġ��)
		this.rb = new RestartButton(); //�ٽ� �ϱ� ��ư(������ �� ������������ �ٽý���)
		rb.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}
	});
		
		
		this.bb = new BackButton();
		//ó������ ��ư(������ selectView?�� �Ѿ) 
		bb.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		
		
	        }); 
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
		this.wb.setLocation(120, 80);
		this.lb.setLocation(870, 100 );
		this.sb.setLocation(490 ,500);
		this.vb.setLocation(550 ,400);
		this.pb.setLocation(40, 80);
		this.eb.setLocation(790, 110);
		this.rb.setLocation(490, 500);
		this.bb.setLocation(490, 400);
		
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
}	

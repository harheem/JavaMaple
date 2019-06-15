package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import MapleClass.Player;
import MapleController.*;
//import MapleView.BattleView;

public class CheckView extends JFrame {
    
	PlayerButton pb;
	EnemyButton eb;
	Player p,e;
	private int stageNum;
	private Component[] cpns;
    private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private int win; //생성자 구별하기위한 파라미터 
	private String lose; // 생성자 구별하기위한 파라미터	
	
	JButton sb = new JButton(); //startButton 누르면 배틀뷰로 넘어감
	JButton vb = new JButton(); // VSButton 기능없음 
	JButton wb = new JButton(); //WinButton 기능없음
	JButton lb = new JButton(); //LoseButton 기능없음
	JButton rb = new JButton(); // RestartButton 누르면 졌던 스테이지의 배틀뷰로 다시 넘어감
	JButton bb = new JButton(); // BackButton 누르면 셀렉트뷰로 넘어감 
   
	//CheckView
	public CheckView(Player p, Player e) { 
		this.p = p;
		this.e = e;
		this.stageNum = p.getW().getWpIndex() + 1; // 무기 index값+1이 스테이지 넘버
		defaultViewSet(); 
		this.creator();
		cpns = new Component[] {sb,vb,pb,eb}; 
		this.cpnsSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
	}
	
	//LoseView
	//임의의 파라미터로 생성자를 구별하였습니다...
	public CheckView(Player p, Player e, int a ) {
		this.p =p;
		this.e =e;
		this.stageNum = p.getW().getWpIndex() + 1; // 무기 index값+1이 스테이지 넘버
		defaultViewSet();
		this.loseCreator();
		cpns = new Component[] {wb,lb,rb,bb,pb,eb};
		this.loseSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
		
		
	}
	//WinView
	//얘도요...
	public CheckView(Player p, Player e, String w ) {
		this.p =p;
		this.e =e;
		this.stageNum = p.getW().getWpIndex() + 1;// 무기 index값+1이 스테이지 넘버
		defaultViewSet();
		this.winCreator();
		cpns = new Component[] {wb,lb,sb,pb,eb};
		this.winSetLocation();
		this.cpnsAdd();
		this.setVisible(true);
	}
	    	
	//finalView
	public CheckView(Player p) {
		this.p =p;
		this.stageNum = p.getW().getWpIndex() + 1;// 무기 index값+1이 스테이지 넘버
		defaultViewSet();
		this.finalCreator();
		cpns = new Component[] {wb,rb,bb,pb};
		this.finalSetLocation();
		this.cpnsAdd();
		this.setVisible(true);			
	}	
	
	public void creator() {
		sb.setBorderPainted(false);
	    sb.setContentAreaFilled(false);
	    sb.setFocusPainted(false);
	    sb.setSize(310, 160);
	    sb.setIcon(new ImageIcon(Main.class.getResource("../image/check/startButton.png")));
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
				
		bb.setBorderPainted(false);
	    bb.setContentAreaFilled(false);
	    bb.setFocusPainted(false);
	    bb.setIcon(new ImageIcon(Main.class.getResource("../image/check/backButton.png")));
	    bb.setSize(310, 160);
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
	
	public void winCreator() {
	
		sb.setBorderPainted(false);
	    sb.setContentAreaFilled(false);
	    sb.setFocusPainted(false);
	    sb.setIcon(new ImageIcon(Main.class.getResource("../image/check/startButton.png")));
	    sb.setSize(310, 160);
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
		
		bb.setBorderPainted(false);
	    bb.setContentAreaFilled(false);
	    bb.setFocusPainted(false);
	    bb.setIcon(new ImageIcon(Main.class.getResource("../image/check/backButton.png")));
	    bb.setSize(310, 160);
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
		//a.setText("Stage1 : "+ bv.getTime() + " 초");
		//b.setText("Stage2 : "+ bv.getTime() + " 초"); 
		//c.setText("Stage3 : "+ bv.getTime() + " 초");
		
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
}	

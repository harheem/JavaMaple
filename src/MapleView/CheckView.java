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
//플레이어가 직업을 선택하고 난 다음 화면임
//캐릭터 큰거 2개와 vs 버튼, 시작하기 버튼이 들어감

//nameimg도 같이보이면 좋을것같음

public class CheckView extends JFrame {
    
	//StartButton sb; //
	//VSButton vb; 
	PlayerButton pb;
	EnemyButton eb;
	Player p,e;
	//WinButton wb;
	//LoseButton lb;
	//RestartButton rb;
	//BackButton bb;
	//JLabel a,b,c;
	//BattleView bv;
	private int stageNum;
	private Component[] cpns;
    private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	private int win;
	private String lose;
	
	
	JButton sb = new JButton(); //startButton
	JButton vb = new JButton(); // VSButton
	JButton wb = new JButton(); //WinButton
	JButton lb = new JButton(); //LoseButton
	JButton rb = new JButton(); // RestartButton
	JButton bb = new JButton(); // BackButton
   
	//BattleView 이전
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
	
	//Lose
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
	//Win
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
		//this.sb = new StartButton();
		//배틀뷰로 넘어가는 스타트 버튼
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
		
		//this.vb = new VSButton();
		vb.setBorderPainted(false);
		vb.setContentAreaFilled(false);
		vb.setIcon(new ImageIcon(Main.class.getResource("../image/check/vsimg.png")));
		vb.setFocusPainted(false);
		vb.setSize(160, 110); //임시 
		// vs 버튼(기능 없음 위치만)
		
		this.pb = new PlayerButton(p,null);
	
		//플레이어 큰 이미지를 가져와야함 
		
		this.eb = new EnemyButton(e);
		
		//에네미의 큰 이미지를 가져와야함
			
	}
	public void loseCreator() {
        this.pb = new PlayerButton(p,null);
        pb.setEnabled(false);
        //플레이어 큰이미지
		
        this.eb = new EnemyButton(e);
		//에네미 큰이미지
        //this.wb = new WinButton();
        wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140); //임시 
		//win 버튼(기능 없음 위치만)
		//win 버튼(기능 없음 위치만)
		
		//this.lb = new LoseButton();
		lb.setBorderPainted(false);
		lb.setContentAreaFilled(false);
		lb.setFocusPainted(false);
		lb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Loseicon.png")));
		lb.setSize(240, 140); //임시 
		//lose버튼(기능 없음 위치만)
		
	
		
		//this.rb = new RestartButton(); 
		//다시 하기 버튼(누르면 그 스테이지에서 다시시작)
		
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
		
		
		//this.bb = new BackButton();
		//처음으로 버튼(누르면 selectView?로 넘어감) 
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
		
		//this.sb = new StartButton();
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
        //플레이어 큰이미지
		
        this.eb = new EnemyButton(e);
        eb.setEnabled(false);
		//에네미 큰이미지
        //this.wb = new WinButton();
        wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140); //임시 
		//win 버튼(기능 없음 위치만)
		
		//this.lb = new LoseButton();
		lb.setBorderPainted(false);
		lb.setContentAreaFilled(false);
		lb.setFocusPainted(false);
		lb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Loseicon.png")));
		lb.setSize(240, 140); //임시 
		//lose버튼(기능 없음 위치만)
		
	
		
	}
	
	public void finalCreator() {
		
		
		this.pb = new PlayerButton(p,null);
		
		//플레이어 큰 이미지를 가져와야함 
		
        //this.wb = new WinButton();
		wb.setBorderPainted(false);
		wb.setContentAreaFilled(false);
		wb.setFocusPainted(false);
		wb.setIcon(new ImageIcon(Main.class.getResource("../image/check/Winicon.png")));
		wb.setSize(240, 140); //임시 
		//win 버튼(기능 없음 위치만)
		
		
		//lose 버튼(기능 없음 위치만)
		//this.rb = new RestartButton(); //다시 하기 버튼(누르면 그 스테이지에서 다시시작)
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
		
		
		//this.bb = new BackButton();
		//처음으로 버튼(누르면 selectView?로 넘어감) 
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

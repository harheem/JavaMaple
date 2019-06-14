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

import MapleClass.Player;
import MapleController.*;
//플레이어가 직업을 선택하고 난 다음 화면임
//캐릭터 큰거 2개와 vs 버튼, 시작하기 버튼이 들어감

//nameimg도 같이보이면 좋을것같음

public class CheckView extends JFrame {
	StartButton tb; 
	VSButton vb; 
	PlayerButton pb;
	EnemyButton eb;
	Player p,e;
	private int stageNum;
	private Component[] cpns;
    private Image screenImage;
	private Image selectBackground;
	private Graphics screenGraphic;
	
	
	
	public CheckView(Player p, Player e, int StageNum) {
		this.stageNum = StageNum;
		this.p = p;
		this.e = e;
		defaultViewSet(); // 처음 체크화면 스테이지 1 배경
		this.creator();
		cpns = new Component[] {tb,vb,pb,eb}; 
		this.cpnsSetLocation();
		this.cpnsAdd();
		//win lose 버튼은 배틀뷰
		//this.sb = new StartButton();
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
	public void creator() {
		this.tb = new StartButton();
		tb.addMouseListener(new MouseListener() {
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
		
		//다음화면(배틀뷰)로 넘어가는 버튼
		
		this.vb = new VSButton();
		// vs 버튼(기능 없음 위치만)
		
		this.pb = new PlayerButton(p,null);
	
		//플레이어 큰 이미지를 가져와야함 
		
		this.eb = new EnemyButton(e);
		
		//에네미의 큰 이미지를 가져와야함
		
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
	public void cpnsSetLocation() {  //임시 위치... 널포인터에러때매 실행이안되서 일단 임의의 수치를 넣어놨습니다
		this.tb.setLocation(490 ,500);
		this.vb.setLocation(550 ,400);
		this.pb.setLocation(40, 80);
		this.eb.setLocation(790, 110);
	}
}	

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
//�÷��̾ ������ �����ϰ� �� ���� ȭ����
//ĳ���� ū�� 2���� vs ��ư, �����ϱ� ��ư�� ��

//nameimg�� ���̺��̸� �����Ͱ���

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
		defaultViewSet(); // ó�� üũȭ�� �������� 1 ���
		this.creator();
		cpns = new Component[] {tb,vb,pb,eb}; 
		this.cpnsSetLocation();
		this.cpnsAdd();
		//win lose ��ư�� ��Ʋ��
		//this.sb = new StartButton();
		this.setVisible(true);
		

			
			//���콺 ��ġ������� �ӽù�ư
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
		
		//����ȭ��(��Ʋ��)�� �Ѿ�� ��ư
		
		this.vb = new VSButton();
		// vs ��ư(��� ���� ��ġ��)
		
		this.pb = new PlayerButton(p,null);
	
		//�÷��̾� ū �̹����� �����;��� 
		
		this.eb = new EnemyButton(e);
		
		//���׹��� ū �̹����� �����;���
		
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
	public void cpnsSetLocation() {  //�ӽ� ��ġ... �������Ϳ������� �����̾ȵǼ� �ϴ� ������ ��ġ�� �־�����ϴ�
		this.tb.setLocation(490 ,500);
		this.vb.setLocation(550 ,400);
		this.pb.setLocation(40, 80);
		this.eb.setLocation(790, 110);
	}
}	

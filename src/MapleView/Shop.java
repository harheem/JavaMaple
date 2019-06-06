package MapleView;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.ShopController;

public class Shop extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;

	private Image shopBackground = new ImageIcon(Main.class.getResource("../image/store.jpg")).getImage();
	//������ư ������
	private ImageIcon deerLeft = new ImageIcon(Main.class.getResource("../image/DeerLeft.png"));
	private ImageIcon LionLeft = new ImageIcon(Main.class.getResource("../image/LionLeft.png"));
	private ImageIcon RabbitRight = new ImageIcon(Main.class.getResource("../image/RabbitRight.png"));
	private ImageIcon TigerRight = new ImageIcon(Main.class.getResource("../image/TigerRight.png"));
	//������ư�� �޴��� ����
	private JLabel menubar = new JLabel(new ImageIcon(Main.class.getResource("../image/menubar.jpg")));
	private JButton deerButton = new JButton(deerLeft);
	private JButton LionButton = new JButton(LionLeft);
	private JButton RabbitButton = new JButton(RabbitRight);
	private JButton TigerButton = new JButton(TigerRight);
	//������ư �迭�� �����
	private JButton[] AnimalButton = {deerButton, LionButton, RabbitButton, TigerButton};

	public Shop() {
		setUndecorated(true);
		this.setTitle("shop");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		this.setLayout(null);
		
		
		//�ߺ��Ǵ� �ڵ� for������ ����, ��ư��� �����ϰ� ���ִ� �޼ҵ�
		for(int i = 0; i<AnimalButton.length; i++) {
			AnimalButton[i].setBorderPainted(false);
			AnimalButton[i].setContentAreaFilled(false);
			AnimalButton[i].setFocusPainted(false);
			add(AnimalButton[i]);
			AnimalButton[i].addActionListener(new ShopController());
		}
		//������ư ��ġ Bounds�� ������ �͵�
		deerButton.setBounds(200, 360, 164, 286);	
		LionButton.setBounds(0, 480, 300, 152);
		RabbitButton.setBounds(320, 490, 149, 155);
		TigerButton.setBounds(350, 470, 300, 182);
		
		menubar.setBounds(0,0,1280,30);
		add(menubar);
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(shopBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
	


}

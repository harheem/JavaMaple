package MapleView;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Login extends JFrame {
	private Image screenImage;
	private Graphics screenGraphic;
	private Image logInBackground = new ImageIcon(Main.class.getResource("../image/mapleLogin.jpg")).getImage();

	public Login() {
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
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
		g.drawImage(logInBackground, 0, 0, null);
		paintComponents(g);
		this.repaint();
	}
}

package MapleView;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import MapleController.Main;
import control.UserDataList;

public class Login extends JFrame {
	private Image screenImage;
	private UserDataList l;
	private Graphics screenGraphic;
	
	//배경이미지와 버튼아이콘이미지
	private Image logInBackground = new ImageIcon(Main.class.getResource("../image/login/mapleLogin.jpg")).getImage();
	private ImageIcon logInButton = new ImageIcon(Main.class.getResource("../image/login/loginButton.png"));
	private ImageIcon idButton = new ImageIcon(Main.class.getResource("../image/login/idButton.png"));
	private ImageIcon pageButton = new ImageIcon(Main.class.getResource("../image/login/pageButton.png"));
	private ImageIcon exid = new ImageIcon(Main.class.getResource("../image/login/exid.png"));
	private ImageIcon findID = new ImageIcon(Main.class.getResource("../image/login/findID.png"));
	private ImageIcon findPW = new ImageIcon(Main.class.getResource("../image/login/findPW.png"));

	private JTextField tf_id, tf_pw;
	private JButton log_in, create_acc, homepage, exit, search_id, search_pw;

	public Login(UserDataList list) {
		this.l = list;
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		this.setLayout(null);
		makeButton();
		makeTextField();
		makeActionListener();
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

	
	//buttonSet 메소드를 이용하여 버튼 만들기
	private void makeButton() {
		log_in = buttonSet(logInButton, 724, 360, 100, 107);
		create_acc = buttonSet(idButton, 443, 527, 117, 58);
		homepage = buttonSet(pageButton, 574, 527, 117, 58);
		exit = buttonSet(exid, 702, 527, 117, 58);
		search_id = buttonSet(findID, 589, 482, 70, 30);
		search_pw = buttonSet(findPW, 710, 482, 100, 30);
	};

	private void makeActionListener() {
		log_in.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (l.logIn(tf_id.getText(), tf_pw.getText())) {
				case 1:
					JOptionPane.showMessageDialog(null, "로그인 성공!!");
					dispose();
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "아이디를 제대로 입력해주세요!");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "비밀번호를 제대로 입력해주세요!");
				}
			}
		});
		create_acc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MembershipView(l);
			}
		});
		homepage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("http://home.konkuk.ac.kr/~cris/class/2019/java.html"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다!");
				System.exit(0);

			}

		});
		search_id.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new IDSearchView(l);

			}

		});
		search_pw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PWSearchView(l);

			}

		});

	}

	//텍스트필드를 생성하고 세팅하는 메소드
	private void makeTextField() {
		tf_id = new JTextField();
		tf_id.setBounds(436, 359, 290, 50);
		this.add(tf_id);
		tf_id.setColumns(10);
		tf_pw = new JPasswordField();
		tf_pw.setBounds(436, 416, 290, 50);
		this.add(tf_pw);
		tf_pw.setColumns(10);

	}

	//로그인 프레임에서의 버튼을 만들고 세팅하는 메소드
	private JButton buttonSet(ImageIcon i, int x, int y, int w, int h) {
		JButton n = new JButton();
		n.setIcon(i);
		n.setBounds(x, y, w, h);
		n.setBorderPainted(false);
		n.setContentAreaFilled(false);
		n.setFocusPainted(false);
		this.add(n);
		n.setVisible(true);
		return n;
	}
}
// 아이디 생성하는 프레임
class MembershipView extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	private Image logInBackground = new ImageIcon(Main.class.getResource("../image/login/membership.jpg")).getImage();
	private JTextField textField, textField_1, textField_2, textField_3, textField_4;
	private JLabel label_2, lblNewLabel, lbl_3, lblName, lblBirthdate;

	public MembershipView(UserDataList db) {
		setUndecorated(true);
		setSize(600, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		makeLabel();
		makeTextField();

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("../image/login/makeID.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(400, 100, 105, 100);
		this.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!textField_1.getText().equals(textField_2.getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요!");
					return;
				}
				if (db.add(textField.getText(), textField_1.getText(), textField_3.getText(), textField_4.getText())) {
					JOptionPane.showMessageDialog(null, "회원가입 성공!!");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다!");
				}

			}

		});
	}

	public void makeTextField() {
		textField = new JTextField(); // id
		textField.setBounds(210, 40, 150, 30);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new JPasswordField(); // pw
		textField_1.setBounds(210, 80, 150, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JPasswordField(); // pw확인
		textField_2.setBounds(210, 120, 150, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField(); // 이름
		textField_3.setBounds(210, 160, 150, 30);
		this.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField(); // 생년월일
		textField_4.setBounds(210, 200, 150, 30);
		this.add(textField_4);
		textField_4.setColumns(10);

	}

	public void makeLabel() {
		label_2 = new JLabel("ID:");
		label_2.setBounds(172, 40, 53, 31);
		this.add(label_2);

		lblNewLabel = new JLabel("PW:");
		lblNewLabel.setBounds(165, 80, 53, 31);
		this.add(lblNewLabel);

		lbl_3 = new JLabel("PW확인:");
		lbl_3.setBounds(142, 120, 87, 31);
		this.add(lbl_3);

		lblName = new JLabel("이름:");
		lblName.setBounds(160, 160, 53, 31);
		this.add(lblName);

		lblBirthdate = new JLabel("생년월일:");
		lblBirthdate.setBounds(135, 200, 87, 31);
		this.add(lblBirthdate);
	}

	public void paint(Graphics g) {
		screenImage = createImage(600, 400);
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

//아이디 찾는 프레임
class IDSearchView extends JFrame {
	private Image screenImage;
	private Graphics screenGraphic;
	private Image logInBackground = new ImageIcon(Main.class.getResource("../image/login/membership.jpg")).getImage();
	private JTextField textField, textField_1;
	private JLabel label_2, lblNewLabel;

	public IDSearchView(UserDataList db) {
		setUndecorated(true);
		setSize(600, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		makeLabel();
		makeTextField();

		// 찾기버튼
		JButton btnNewButton = new JButton("ID찾기");
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("../image/login/id_found.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(170, 130, 110, 100);
		this.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = db.idSearch(textField.getText(), textField_1.getText());
				if (id == null) {
					JOptionPane.showMessageDialog(null, "아이디가 없습니다!");
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "아이디 : " + id);
					dispose();
				}

			}

		});
		// 나가기버튼
		JButton exit = new JButton();
		
		exit.setBounds(285, 130, 105, 100);
		exit.setIcon(new ImageIcon(Main.class.getResource("../image/login/exitButton.png")));
		exit.setBorderPainted(false);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		this.add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});

	}

	public void makeTextField() {

		textField = new JTextField(); // id
		textField.setBounds(210, 40, 150, 30);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField(); // pw
		textField_1.setBounds(210, 80, 150, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
	}

	public void makeLabel() {
		label_2 = new JLabel("이름:");
		label_2.setBounds(160, 40, 53, 31);
		this.add(label_2);

		lblNewLabel = new JLabel("생년월일:");
		lblNewLabel.setBounds(135, 80, 87, 31);
		this.add(lblNewLabel);
	}

	public void paint(Graphics g) {
		screenImage = createImage(600, 400);
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

//비밀번호 찾는 프레임
class PWSearchView extends JFrame {

	private Image screenImage;
	private Graphics screenGraphic;
	private Image logInBackground = new ImageIcon(Main.class.getResource("../image/login/membership.jpg")).getImage();
	private JTextField textField, textField_1, textField_2;
	private JLabel lblNewLabel, lblName, lblBirthdate;

	public PWSearchView(UserDataList db) {
		setUndecorated(true);
		setSize(600, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		setBackground(new Color(0, 0, 0, 0));

		makeLabel();
		makeTextField();

		JButton btnNewButton = new JButton();
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("../image/login/pw_found.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(170, 150, 105, 100);
		this.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String pw = db.passwordSearch(textField.getText(), textField_1.getText(), textField_2.getText());
				if (pw == null) {
					JOptionPane.showMessageDialog(null, "해당하는 아이디가 없습니다!");
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호 : " + pw);
					dispose();
				}

			}

		});
		// 나가기
		JButton exit = new JButton();
		exit.setIcon(new ImageIcon(Main.class.getResource("../image/login/exitButton.png")));
		exit.setBorderPainted(false);
		exit.setContentAreaFilled(false);
		exit.setFocusPainted(false);
		exit.setBounds(285, 150, 105, 100);
		this.add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}

		});
	}

	public void makeTextField() {
		textField = new JTextField(); // id
		textField.setBounds(210, 30, 150, 30);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField(); // pw
		textField_1.setBounds(210, 70, 150, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField(); // pw확인
		textField_2.setBounds(210, 110, 150, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

	}

	public void makeLabel() {

		lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(172, 30, 53, 31);
		this.add(lblNewLabel);

		lblName = new JLabel("이름:");
		lblName.setBounds(160, 70, 53, 31);
		this.add(lblName);

		lblBirthdate = new JLabel("생년월일:");
		lblBirthdate.setBounds(135, 110, 87, 31);
		this.add(lblBirthdate);
	}

	public void paint(Graphics g) {
		screenImage = createImage(600, 400);
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
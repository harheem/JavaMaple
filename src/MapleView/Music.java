package MapleView;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import MapleController.Main;
import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player player; //javazoom ���̺귯���� player�Դϴ�. �������� �÷��̾�ƴ�!
	private boolean isLoop; //���� �ݺ� ������ ����
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//������ ���������� ���� �����ִ� �޼ҵ�
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try {
			do {
				player.play();
			} while (isLoop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}

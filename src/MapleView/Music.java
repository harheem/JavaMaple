package MapleView;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import MapleController.Main;
import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player player; //javazoom 라이브러리의 player입니다. 메이플의 플레이어아님!
	private boolean isLoop; //무한 반복 할지의 여부
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
	//음악을 안정적으로 정지 시켜주는 메소드
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

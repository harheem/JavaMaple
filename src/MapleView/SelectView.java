package MapleView;

import javax.swing.JFrame;

import MapleClass.Player;

public class SelectView extends JFrame {
	
	SelectButton sb = new SelectButton();
	
	public SelectView() {
		for(int i =0; i< sb.nameButton.length; i++) {
			add(sb.nameButton[i]);
			add(sb.imgButton[i]);
		}
	}
	
	public int getIndex() {
		return sb.getIndex();
	}
}


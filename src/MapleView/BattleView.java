package MapleView;

import javax.swing.JFrame;

import MapleClass.Player;

public class BattleView extends JFrame {
	

	
	public BattleView(Player p, Player e) {
		SkillButton1 sb1 = new SkillButton1(p);
		SkillButton2 sb2 = new SkillButton2(p);
		PlayerButton p1 = new PlayerButton(p);
		EnemyButton p2 = new EnemyButton(e);
		WeaponButton w1 = new WeaponButton(p);
		WeaponButton w2 = new WeaponButton(e);
		add(sb1);
		add(sb2);
		add(p1);
		add(p2);
		
		
		//ü�¹�,������ ���� ���α׷����� ���� ���̱�
	}
	


	

}

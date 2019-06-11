package MapleView;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

import MapleClass.Player;


public class BattleView extends JFrame { //View에선 버튼의 생성과 추가 및 Location 설정. Button에서 버튼의 사이즈 및 아이콘 설정.
	
		SkillButton1 sb1; SkillButton2 sb2; MpButton mb; HpButton hb; PlayerButton p1;
		EnemyButton p2; WeaponButton w1, w2; JProgressBar pHp, pMp, eHp, eMp;
		private Component[] cpns = {sb1,sb2,mb,hb,p1,p2,w1,w2,pHp,pMp,eHp,eMp};
		
	public BattleView(Player p, Player e) { // 사용자 : p , 적 : e. 교수님이 좋아하시는 생성자 구성
		this.creator(p, e);
		this.setValue(p, e);
		this.cpnsSetLocation();
		this.cpnsAdd();
	}
	
	public void creator(Player p, Player e) {
		this.sb1 = new SkillButton1(p);
		this.sb2 = new SkillButton2(p);
		this.mb = new MpButton(p);
		this.hb = new HpButton(p);
		this.p1 = new PlayerButton(p);
		this.p2 = new EnemyButton(e);
		this.w1 = new WeaponButton(p);
		this.w2 = new WeaponButton(e);
		this.pHp=new JProgressBar(0,p.getHp()); //플레이어 hp
		this.pMp=new JProgressBar(0,p.getMp()); // " mp
		this.eHp=new JProgressBar(0,e.getHp()); //적 hp
		this.eMp=new JProgressBar(0,e.getMp()); // " mp
	}
	
	public void setValue(Player p, Player e) {
		this.pHp.setValue(p.getHp());
		this.pMp.setValue(p.getMp());
		this.eHp.setValue(e.getHp());
		this.eMp.setValue(e.getMp());
	}
	
	public void cpnsAdd() {
		for(int i=0;i<this.cpns.length;i++)
			add(this.cpns[i]);
	}
	
	public void cpnsSetLocation() {
		this.sb1.setLocation(80,320);
		this.sb2.setLocation(80,355);
		this.hb.setLocation(250,300);
		this.mb.setLocation(300,300);
		this.p1.setLocation(180, 220);
		this.p2.setLocation(600, 220);
		this.w1.setLocation(100, 425);
		this.w2.setLocation(660, 425);
		this.pHp.setLocation(220,400);
		this.pHp.setLocation(220,435);
		this.eHp.setLocation(630,400);
		this.eHp.setLocation(630,435);
	}

}

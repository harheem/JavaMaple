package MapleClass;

import MapleWeapon.스태프;

public class 썬콜 extends 마법사 {

	public 썬콜() {
		this.w = new 스태프();
		this.name = "썬콜";
	}

	@Override
	public void attack(Player p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reinforce() {
		w.setWpIndex(w.getWpIndex() + 1);
		w.reinforce();
		this.hp += point * 5;
		this.mp += point * 5;
		this.power += point * 5;
		this.hp += point * 5;
		this.hp += point * 5;
	}

}

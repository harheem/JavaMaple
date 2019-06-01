package MapleClass;

import MapleWeapon.È°;

public class ½Å±Ã extends ±Ã¼ö {

	public ½Å±Ã() {
		this.w = new È°();
		this.name = "½Å±Ã";
		this.power = (150 + point * 5) + w.getWpPower()[w.getWpIndex()];
		this.def = (150 + point * 5);
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

package MapleClass;

import MapleWeapon.´Ü°Ë;

public class ¼¨µµ¾î extends µµÀû {

	public ¼¨µµ¾î() {
		this.w = new ´Ü°Ë();
		this.name = "¼¨µµ¾î";
		this.power = 160;
		this.def = 140;
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

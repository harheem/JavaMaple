package MapleClass;

import MapleWeapon.Ȱ;

public class �ű� extends �ü� {

	public �ű�() {
		this.w = new Ȱ();
		this.name = "�ű�";
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

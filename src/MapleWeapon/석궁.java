package MapleWeapon;


public class 석궁 extends Weapon {

	public 석궁() {
		this.wpName = new String[] { "석궁", "이글크로", "골든 네쉐르" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "피어싱", "스나이핑" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/MarksmanWeapon1.png");
		wpIcon.add("../image/wp/MarksmanWeapon2.png");
		wpIcon.add("../image/wp/MarksmanWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/MarksmanSkill1.png");
		skillIcon.add("../image/skillIcon/MarksmanSkill2.png");
		skillIcon.add("../image/skillIcon/ArcherBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/MarksmanSkill1Effect.png");
		skillEffect.add("../image/skilleffect/MarksmanSkill2Effect.png");
		skillEffect.add("../image/skilleffect_e/MarksmanSkill1Effect.png");
		skillEffect.add("../image/skilleffect_e/MarksmanSkill2Effect.png");
		skillEffect.add("../image/skilleffect/ArcherBuffEffect_p.png");
		skillEffect.add("../image/skilleffect_e/ArcherBuffEffect.png");
	}



}

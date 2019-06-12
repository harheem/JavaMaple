package MapleWeapon;


public class 창 extends Weapon {

	public 창() {
		this.wpName = new String[] { "죽창", "장팔사모", "피나카" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "다크임페일", "궁그닐 디센트" };
		this.skillMP = new int[] { 20, 60 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/DarkKnightWeapon1.png");
		wpIcon.add("../image/wp/DarkKnightWeapon2.png");
		wpIcon.add("../image/wp/DarkKnightWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/DarkKnightSkill1.png");
		skillIcon.add("../image/skillIcon/DarkKnightSkill2.png");
		skillIcon.add("../image/skillIcon/DarkKnightBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/DarkKnightSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/DarkKnightSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/DarkKnightSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/DarkKnightSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/DarkKnightBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/DarkKnightBuffEffect.gif");
		

	}

}

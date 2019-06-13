package MapleWeapon;


public class 단검 extends Weapon {

	public 단검() {
		this.wpName = new String[] { "후르츠대거", "태극부채", "블러드대거" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "부메랑스텝", "암살" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		//무기아이콘 이미지경로
		wpIcon.add("../image/wp/ShadwerWeapon1.png");
		wpIcon.add("../image/wp/ShadwerWeapon2.png");
		wpIcon.add("../image/wp/ShadwerWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/ShadwerSkill1.png");
		skillIcon.add("../image/skillIcon/ShadwerSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/ShadwerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ShadwerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadwerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadwerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
	}

}

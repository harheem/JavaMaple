package MapleWeapon;


public class 아대 extends Weapon {

	public 아대() {
		this.wpName = new String[] { "가니어", "스틸가즈", "레드크리븐" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "쿼드러플스로우", "써든레이드" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/NightLordWeapon1.gif");
		wpIcon.add("../image/wp/NightLordWeapon2.gif");
		wpIcon.add("../image/wp/NightLordWeapon3.gif");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/NightLordSkill1.png");
		skillIcon.add("../image/skillIcon/NightLordSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/NightLordSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/NightLordSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/NightLordSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/NightLordSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
	}
}

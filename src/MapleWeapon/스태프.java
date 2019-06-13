package MapleWeapon;



public class 스태프 extends Weapon {

	public 스태프() {
		this.wpName = new String[] { "나무스태프", "아크스태프", "드래곤스태프" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "콜드빔", "라이트닝 스피어" };
		this.skillMP = new int[] { 50, 150 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/ThunderWeapon1.png");
		wpIcon.add("../image/wp/ThunderWeapon2.png");
		wpIcon.add("../image/wp/ThunderWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/ThunderSkill1.png");
		skillIcon.add("../image/skillIcon/ThunderSkill2.png");
		skillIcon.add("../image/skillIcon/WizardBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/ThunderSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ThunderSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ThunderSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ThunderSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/WizardBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/WizardBuffEffect.gif");
	}


}

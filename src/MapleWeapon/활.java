package MapleWeapon;


public class 활 extends Weapon {

	public 활() {
		this.wpName = new String[] { "워 보우", "올림푸스", "메투스" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "에로우 플래터", "언카운터블 에로우" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/BowMasterWeapon1.png");
		wpIcon.add("../image/wp/BowMasterWeapon2.png");
		wpIcon.add("../image/wp/BowMasterWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/BowMasterSkill1.png");
		skillIcon.add("../image/skillIcon/BowMasterSkill2.png");
		skillIcon.add("../image/skillIcon/ArcherBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/BowMasterSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/BowMasterSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/BowMasterSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/BowMasterSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ArcherBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ArcherBuffEffect.gif");
				
	}

}

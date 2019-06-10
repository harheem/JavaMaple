package MapleWeapon;


public class 두손검 extends Weapon {

	public 두손검() {
		this.wpName = new String[] { "목검", "왕푸", "라투핸더" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "블래스트", "디바인 차지" };
		this.skillMP = new int[] { 20, 60 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/PaladinWeapon1.png");
		wpIcon.add("../image/wp/PaladinWeapon2.png");
		wpIcon.add("../image/wp/PaladinWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/PaladinSkill1.png");
		skillIcon.add("../image/skillIcon/PaladinSkill2.png");
		skillIcon.add("../image/skillIcon/PaladinBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/PaladinSkill1Effect.png");
		skillEffect.add("../image/skilleffect/PaladinSkill2Effect.png");
		skillEffect.add("../image/skilleffect_e/PaladinSkill1Effect.png");
		skillEffect.add("../image/skilleffect_e/PaladinSkill2Effect.png");
		skillEffect.add("../image/skilleffect/PaladinBuffEffect_p.png");
		skillEffect.add("../image/skilleffect_e/PaladinBuffEffect.png");
	}

}

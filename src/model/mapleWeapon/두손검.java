package model.mapleWeapon;


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
		skillEffect.add("../image/skilleffect/PaladinSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/PaladinSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/PaladinSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/PaladinSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/PaladinBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/PaladinBuffEffect.gif");
		
		//스킬설명(스킬1, 스킬2, 버프 순서)
		skillExplanation.add("적 하나에게 강력한 다단히트 공격을 날린다.");
		skillExplanation.add("순간적으로 무기에 성 속성을 부여해 적들을 침묵시킨다");
		skillExplanation.add("다수의 적에게 위협을 가해 일정시간동안 공격력,방어력을 감소시킨다");
		
		
	}

}

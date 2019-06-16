package model.mapleWeapon;


public class 단검 extends Weapon {

	public 단검() {
		this.wpName = new String[] { "후르츠대거", "태극부채", "블러드대거" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "부메랑스텝", "암살" };
		this.skillMP = new int[] { 30, 90 };
		this.skillPower = new int[] { 20, 50 };
		//무기아이콘 이미지경로
		wpIcon.add("../image/wp/ShadowerWeapon1.png");
		wpIcon.add("../image/wp/ShadowerWeapon2.png");
		wpIcon.add("../image/wp/ShadowerWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/ShadowerSkill1.png");
		skillIcon.add("../image/skillIcon/ShadowerSkill2.png");
		skillIcon.add("../image/skillIcon/ThiefBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/ShadowerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/ShadowerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadowerSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/ShadowerSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/ThiefBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/ThiefBuffEffect.gif");
		
		//스킬설명(스킬1, 스킬2, 버프 순서)
		skillExplanation.add("빠른속도로 다수의 적들을 벤다");
		skillExplanation.add("적의 급소를 공격하여 엄청난 데미지를 준다");
		skillExplanation.add("일정 시간동안 자신과 똑같은 행동을 하는 그림자 동료를 소환한다");
		
	}

}

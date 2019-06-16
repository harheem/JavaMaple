package model.mapleWeapon;


public class 완드 extends Weapon {

	public 완드() {
		this.wpName = new String[] { "우드완드", "위저드완드", "드래곤완드" };
		this.wpPower = new int[] { 10, 15, 20 };
		this.skillName = new String[] { "페럴라이즈", "메테오" };
		this.skillMP = new int[] { 50, 150 };
		this.skillPower = new int[] { 20, 50 };
		wpIcon.add("../image/wp/FireWeapon1.png");
		wpIcon.add("../image/wp/FireWeapon2.png");
		wpIcon.add("../image/wp/FireWeapon3.png");
		//스킬아이콘과 버프 아이콘 이미지경로
		skillIcon.add("../image/skillIcon/FireSkill1.png");
		skillIcon.add("../image/skillIcon/FireSkill2.png");
		skillIcon.add("../image/skillIcon/WizardBuff.png");
		//스킬이펙트 플레이어 스킬 2개, 상대스킬 2개 버프 플레이어, 상대꺼
		skillEffect.add("../image/skilleffect/FireSkill1Effect.gif");
		skillEffect.add("../image/skilleffect/FireSkill2Effect.gif");
		skillEffect.add("../image/skilleffect_e/FireSkill1Effect.gif");
		skillEffect.add("../image/skilleffect_e/FireSkill2Effect.gif");
		skillEffect.add("../image/skilleffect/WizardBuffEffect_p.gif");
		skillEffect.add("../image/skilleffect_e/WizardBuffEffect.gif");
		
		
		//스킬설명(스킬1, 스킬2, 버프 순서)
		skillExplanation.add("다수의 적을 일정 시간동안 마비시키며 강한 데미지를 준다");
		skillExplanation.add("하늘로부터 운석을 소환하여 다수의 적에게 강력한 화염 공격을 가한다");
		skillExplanation.add("활성화 시 받는 데미지의 일부를 MP로 대신한다. 단, MP가 0일 경우에는 그대로 HP를 소비하게 된다.");
		
	}


}

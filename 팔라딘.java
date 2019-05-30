package TeamProject;
public class 팔라딘 extends 전사 {
//    private 두손검 두손검;

    public 팔라딘(int point, boolean user)
    {
    	super(point, user);
    	this.name = "팔라딘";
    	this.power = 100;
    	this.def = 200;
    	this.w = new 두손검(this);
    	this.skillName = "위협";
    	this.skillMP = 30; //위협 소모할 mp
    	
    }
    public void 강화하기() {
    	//위협이라는 스킬로 스킬 변경하였습니다 (포션과 활용도가 겹침, 죽지 않을것 같음)
    	//스킬효과 일정시간동안 적의 공격력과 방어력을 50%감소
    	enemy.power = (0.5)*(enemy.power);
    	enemy.def = (0.5)*(enemy.def);
       	this.time = 3;
    }
    public void buffRelease() {
    	enemy.power = ((double)3/2)*(enemy.power);
    	enemy.def = ((double)3/2)*(enemy.def);
    }
}

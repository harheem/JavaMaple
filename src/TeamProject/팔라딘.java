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
    	this.skillName = "리스토네이션";
    	this.skillMP = 30; //리스토네이션 소모할 mp
    	
    }
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	강화하기();
    }
    //강화하기 메소드가 달라서 얘는 살려둬야 되나...
    public void 강화하기() {
    	//this.hp += (this.m_hp/2);
    	//리스토네이션 최대 hp에 50%를 회복 
    	//위협이라는 스킬로 스킬 변경하였습니다 (포션과 활용도가 겹침, 죽지 않을것 같음)
    	//스킬효과 일정시간동안 적의 공격력과 방어력을 50%감소
    	enemy.power = (0.5)*(enemy.power);
    	enemy.def = (0.5)*(enemy.def);
       	this.time = 3;
       	//setEnemy(enemy, power=(0.7)*power,def=(0.7)*def);
       	//만약 private으로 유지한다면
    }
    public void buffRelease() {
    	enemy.power = (3/2)*(enemy.power);
    	enemy.def = (3/2)*(enemy.def);
    	// setEnemy(enemy, power=(10/7)*power,def=(10/7)*def);
    	//private으로 유지한다면
    	//mp를 써서 회복하고 끝인 스킬이라 풀릴 시 변화가 없습니다.
    	//밸런스상 사기일것같고 포션이랑 그 활용도가 동일하여 위협이라는 스킬로 대체하려합니다
    }
    //public void attackted(int damage) {
    	
    //}
    //상속받습니다.
}

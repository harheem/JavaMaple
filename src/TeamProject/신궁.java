package TeamProject;
public class 신궁 extends 궁수 {
//    private 석궁 석궁;

    public 신궁(int point, boolean user)
    {
    	super(point, user);
    	this.name = "신궁";
    	this.power = 160;
    	this.def = 140;
    	this.w = new 석궁(this);
    	this.skillName = "샤프아이즈";
    	this.skillMP = 50; //샤프아이즈 소모할 mp
    }
    public void 강화하기()
    {
       this.power = 240;
    	this.time =3; //이런스킬은 다크나이트랑 같이 3턴 유지되게 일치시켰습니다.	   
    	//스킬 주석은 보우마스터와 같습니다
    }
    public void buffRelease() 
    {
        this.power = 160;
        //스킬 주석은 보우마스터와 같습니다
    }
}

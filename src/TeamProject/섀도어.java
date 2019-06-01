package TeamProject;
public class 섀도어 extends 도적 {

    public 섀도어(int point, boolean user)
    {
    	super(point, user);
    	this.name = "섀도어";
    	this.power = 160;
    	this.def = 140;
    	this.w = new 단검(this);
    }
    //메서드 추가할 필요 x
}

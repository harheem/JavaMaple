package TeamProject;

import java.util.Scanner;

public abstract class 마법사 extends Player {
    public 마법사(int point, boolean user)
    {
    	super(point,user);
		this.m_hp = (int)(300*(1 + 0.2*(this.point-1)));
		this.m_mp = (int)(900*(1+ 0.2*(this.point-1)));
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 180;
    	this.def = 120;
    	this.skillName = "매직가드";
    	this.skillMP = 80;
    }
    public void buff() {/*버프인 매직가드를 패시브로 바꿨습니다*/}
    public void buffRelease() {/*넣을 내용이 없습니다*/}
    public void showUser() {/*버프 사용할지 물어볼 필요가 없어서 빈 메서드로 오버라이딩합니다*/}
    public void attackted(int damage) 
    {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100만큼 받는 데미지 감쇠
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "이 공격을 회피했습니다!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "이 " + realDamage + "만큼의 피해를 입습니다!");
    	System.out.println("매직가드로 데미지의 60%를 mp로 대신합니다!!");
    	int change = (int) Math.min(realDamage*0.60, this.mp);
    	this.mp-=change;
    	this.hp-=realDamage-change;
    	System.out.println("HP피해:" + (realDamage - change));
    	System.out.println("MP피해:" + (change));
    }
}

package TeamProject;

import java.util.Scanner;

public abstract class ������ extends Player {
    public ������(int point, boolean user)
    {
    	super(point,user);
		this.m_hp = (int)(300*(1 + 0.2*(this.point-1)));
		this.m_mp = (int)(900*(1+ 0.2*(this.point-1)));
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 180;
    	this.def = 120;
    	this.skillName = "��������";
    	this.skillMP = 80;
    }
    public void buff() {/*������ �������带 �нú�� �ٲ���ϴ�*/}
    public void buffRelease() {/*���� ������ �����ϴ�*/}
    public void showUser() {/*���� ������� ��� �ʿ䰡 ��� �� �޼���� �������̵��մϴ�*/}
    public void attackted(int damage) 
    {
    	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    	if(Math.random()<0.1) 
    	{
    		System.out.println(this.name + "�� ������ ȸ���߽��ϴ�!");
    		realDamage=0;
    	}
    	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	System.out.println("��������� �������� 60%�� mp�� ����մϴ�!!");
    	int change = (int) Math.min(realDamage*0.60, this.mp);
    	this.mp-=change;
    	this.hp-=realDamage-change;
    	System.out.println("HP����:" + (realDamage - change));
    	System.out.println("MP����:" + (change));
    }
}

package model.mapleClass;

public abstract class ������ extends Player {
	
	public ������() {
		this.m_hp = 250;
		this.m_mp = 1250;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
		this.buffSkillName = "��������";
	}
	
	public void passive(int realDamage) {
		System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	System.out.println("��������� �������� 80%�� mp�� ����մϴ�!!");
    	int change = (int) Math.min(realDamage*0.80, this.mp);
    	this.mp-=change;
    	this.hp-=realDamage-change;
    	System.out.println("HP����:" + (realDamage - change));
    	System.out.println("MP����:" + (change));
	}
	public void buffRelease() {}
	public void buffskill() {}
}

package MapleClass;

public abstract class ������ extends Player {
	
	public ������() {
		this.m_hp = 500;
		this.m_mp = 1000;
		this.hp = this.m_hp;
		this.mp = this.m_mp;
    	this.power = 180;
    	this.def = 120;
	}
	
	public void passive(double realDamage) {
		System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    	System.out.println("��������� �������� 60%�� mp�� ����մϴ�!!");
    	int change = (int) Math.min(realDamage*0.60, this.mp);
    	this.mp-=change;
    	this.hp-=realDamage-change;
    	System.out.println("HP����:" + (realDamage - change));
    	System.out.println("MP����:" + (change));
	}
	public void buffRelease() {}
	public void buffskill() {}
}

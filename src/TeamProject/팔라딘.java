package TeamProject;
public class �ȶ�� extends ���� {

    public �ȶ��(int point, boolean user)
    {
    	super(point, user);
    	this.name = "�ȶ��";
    	this.power = 100;
    	this.def = 160;
    	this.w = new �μհ�(this);
    	this.skillName = "����";
    	this.skillMP = 30; //���� �Ҹ��� mp
    	
    }
    public void ��ȭ�ϱ�() {
    	//�����̶�� ��ų�� ��ų �����Ͽ����ϴ� (���ǰ� Ȱ�뵵�� ��ħ, ���� ������ ����)
    	//��ųȿ�� �����ð����� ���� ���ݷ°� ������ 30%����
    	enemy.power *=0.7;
    	enemy.def *=0.7;
    	System.out.println("�ȶ���� ���� ���ݷ��� ������ϴ�!");
    	System.out.println("���� : " + enemy.def);
       	this.time = 3;
    }
    public void buffRelease() {
    	System.out.println("�ȶ���� ������ �����Ǿ����ϴ�!");
    	enemy.power /=0.7;
    	enemy.def /=0.7;
    	System.out.println("���� : " + enemy.def);
    }
}

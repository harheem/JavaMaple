package TeamProject;
public class �ȶ�� extends ���� {
//    private �μհ� �μհ�;

    public �ȶ��(int point, boolean user)
    {
    	super(point, user);
    	this.name = "�ȶ��";
    	this.power = 100;
    	this.def = 200;
    	this.w = new �μհ�(this);
    	this.skillName = "����";
    	this.skillMP = 30; //���� �Ҹ��� mp
    	
    }
    public void ��ȭ�ϱ�() {
    	//�����̶�� ��ų�� ��ų �����Ͽ����ϴ� (���ǰ� Ȱ�뵵�� ��ħ, ���� ������ ����)
    	//��ųȿ�� �����ð����� ���� ���ݷ°� ������ 50%����
    	enemy.power = (0.5)*(enemy.power);
    	enemy.def = (0.5)*(enemy.def);
       	this.time = 3;
    }
    public void buffRelease() {
    	enemy.power = ((double)3/2)*(enemy.power);
    	enemy.def = ((double)3/2)*(enemy.def);
    }
}

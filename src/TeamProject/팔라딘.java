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
    	this.skillName = "��������̼�";
    	this.skillMP = 30; //��������̼� �Ҹ��� mp
    	
    }
    public void buff() {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	��ȭ�ϱ�();
    }
    //��ȭ�ϱ� �޼ҵ尡 �޶� ��� ����־� �ǳ�...
    public void ��ȭ�ϱ�() {
    	//this.hp += (this.m_hp/2);
    	//��������̼� �ִ� hp�� 50%�� ȸ�� 
    	//�����̶�� ��ų�� ��ų �����Ͽ����ϴ� (���ǰ� Ȱ�뵵�� ��ħ, ���� ������ ����)
    	//��ųȿ�� �����ð����� ���� ���ݷ°� ������ 50%����
    	enemy.power = (0.5)*(enemy.power);
    	enemy.def = (0.5)*(enemy.def);
       	this.time = 3;
       	//setEnemy(enemy, power=(0.7)*power,def=(0.7)*def);
       	//���� private���� �����Ѵٸ�
    }
    public void buffRelease() {
    	enemy.power = (3/2)*(enemy.power);
    	enemy.def = (3/2)*(enemy.def);
    	// setEnemy(enemy, power=(10/7)*power,def=(10/7)*def);
    	//private���� �����Ѵٸ�
    	//mp�� �Ἥ ȸ���ϰ� ���� ��ų�̶� Ǯ�� �� ��ȭ�� �����ϴ�.
    	//�뷱���� ����ϰͰ��� �����̶� �� Ȱ�뵵�� �����Ͽ� �����̶�� ��ų�� ��ü�Ϸ��մϴ�
    }
    //public void attackted(int damage) {
    	
    //}
    //��ӹ޽��ϴ�.
}

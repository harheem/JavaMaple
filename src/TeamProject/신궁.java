package TeamProject;
public class �ű� extends �ü� {
//    private ���� ����;

    public �ű�(int point, boolean user)
    {
    	super(point, user);
    	this.name = "�ű�";
    	this.power = 150;
    	this.def = 100;
    	this.w = new ����(this);
    	this.skillName = "����������";
    	this.skillMP = 50; //���������� �Ҹ��� mp
    }
    public void buff()
    {
    	if(this.mp<this.skillMP) return;
    	else this.mp-=this.skillMP;
    	��ȭ�ϱ�();
    }
    //��ӹ޴µ� ��ȭ�ϱⰡ �űð� �޶� �࿩ �ȵɱ� ���ܳ��ڽ��ϴ�
    public void ��ȭ�ϱ�()
    {
       this.power = 225;
    	this.time =3; //�̷���ų�� ��ũ����Ʈ�� ���� 3�� �����ǰ� ��ġ���׽��ϴ�.	   
    	//��ų �ּ��� ���츶���Ϳ� �����ϴ�
    }
    public void buffRelease() 
    {
        this.power = 150;
        //��ų �ּ��� ���츶���Ϳ� �����ϴ�
       
    }
    //public void attackted(int damage) 
    //{
    //	int realDamage = (int) (damage /((double)this.def/100)); // def/100��ŭ �޴� ������ ����
    //	if(Math.random()<0.1) 
    //	{
    //		System.out.println(this.name + "�� ������ ȸ���߽��ϴ�!");
    //		realDamage=0;
    //	}
    //	System.out.println(this.name + "�� " + realDamage + "��ŭ�� ���ظ� �Խ��ϴ�!");
    //	this.hp-=realDamage;
    //}
    //��ӹ޽��ϴ�
}
//�Ϸ�

package TeamProject;
public class ���츶���� extends �ü� {
    public ���츶����(int point, boolean user)
    {
    	super(point, user);
    	this.name = "���츶����";
    	this.power = 160;
    	this.def = 140;
    	this.w = new Ȱ(this);
    	this.skillName = "����������";
    	this.skillMP = 50; //���������� �Ҹ��� mp
    	
    }
    //��ӹ޴µ� ��ȭ�ϱⰡ �űð� �޶� �࿩ �ȵɱ� ������ڽ��ϴ� 
    public void ��ȭ�ϱ�()
    {   
    	this.power = 240;
        //ũ��Ƽ�� Ȯ��20%, ũ��Ƽ�õ����� 15%����  ->���ݷ�(power) 150% ������ ����
    	this.time =3; //�̷���ų�� ��ũ����Ʈ�� ���� 3�� �����ǰ� ��ġ���׽��ϴ�.		
    }
    public void buffRelease() 
    {   this.power = 160;
		//ũ��Ƽ��Ȯ��, ũ��Ƽ�� ������  �ѹ� ->���ݷ�(power) �ѹ�
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

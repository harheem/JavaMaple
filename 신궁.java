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
}

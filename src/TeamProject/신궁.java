package TeamProject;
public class �ű� extends �ü� {
//    private ���� ����;

    public �ű�(int point, boolean user)
    {
    	super(point, user);
    	this.name = "�ű�";
    	this.power = 160;
    	this.def = 140;
    	this.w = new ����(this);
    	this.skillName = "����������";
    	this.skillMP = 50; //���������� �Ҹ��� mp
    }
    public void ��ȭ�ϱ�()
    {
       this.power = 240;
    	this.time =3; //�̷���ų�� ��ũ����Ʈ�� ���� 3�� �����ǰ� ��ġ���׽��ϴ�.	   
    	//��ų �ּ��� ���츶���Ϳ� �����ϴ�
    }
    public void buffRelease() 
    {
        this.power = 160;
        //��ų �ּ��� ���츶���Ϳ� �����ϴ�
    }
}

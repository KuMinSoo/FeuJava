package OOP1;
class Date_1{
	int value;
}

class Date_2{
	int value;
	Date_2(int value){
		this.value=value;
	}
}
public class ConstructorEx {

	int x;
	public ConstructorEx(int y) {
		x=y;
	}
	//ConstructorEx(){} ���� �߻�.. �� ������ public class�� �����ڸ� ���鶧�� ������ �տ� public�� �ٿ���� �ȴ�.
	//�� ������ �ش� Ŭ������ ������ �������� Ȱ���ϴµ� �ٸ� Ŭ�������� �ش� Ŭ������ �ҷ��ö� �����ڸ� �ڵ� �����ϴµ� 
	//�̶� Ŭ������ �����Ӱ� �ҷ��� �� �ִµ� �ش� �����ڸ� �����Ӱ� �θ��� ���ϴ� �������̸� ������ ������ ������ �߻��ϱ� �����̴�.
	
	
	public static void main(String[] args) {
		Date_1 a=new Date_1();//�⺻ ������ �ڵ� ����
		//Date_2 b=new Date_2();//���� �ش� Ŭ������ �����ڸ� �������� �ʰ� ���� ���� ��Ȳ�ε�.. �� �����ڰ� �Ű������� �ִ� �������̸� .. �Ű������� �ִ� �����ڸ� ������ �� ����.
		Date_2 c=new Date_2(1);//����
		//ConstructorEx d=new ConstructorEx();����.. ���� ��������
		ConstructorEx d=new ConstructorEx(1);
	}

}

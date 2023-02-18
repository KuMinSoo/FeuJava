package OOP2;

public class ReferenceVariableCast {

	public static void main(String[] args) {
		Car car=null;
		FireEngine fe=new FireEngine();
		FireEngine fe2=null;
		
		fe.water();
		car=fe;//FireEngine�� car�� �ڼ������� �ڵ��׺�ȯ ������. car�� ���������� fe�� ��Ҹ� car ���� ������ �����Ӱ� �� �� �ֱ� ����..
		//car.water() �Ȍ�.. �� ������ 
		fe2=(FireEngine)car; // fe2 �������� �����Ӱ� ����� �� �ֵ��� car�� FireEngine���� ���� �׺�ȯ ���ش�
		fe2.water();
		
		if(fe2 instanceof FireEngine) {
			System.out.println("�ش�Ÿ���� FireEngine �Դϴ�");
		}
		//���� ���� Ÿ�Կ��� �ش� �ڼ�Ÿ���� �´� �˾ƺ��� �����
		
		
		if(fe2 instanceof Car) {
			System.out.println("�ش�Ÿ���� Car �Դϴ�");
		}
	}

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, brrr!");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
	
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
package OOP1;

public class OverloadingEx {

	public static void main(String[] args) {

		MyMath3 mm=new MyMath3();
		System.out.println("mm.add(3,3) ���:" + mm.add(3, 3));
		System.out.println("mm.add(3,3L) ���: " + mm.add(3, 3L));
		//System.out.println �ȿ� �� �޼��尡 �ְ� �� �޼��� ������ �ȿ� System.out.println("dddd")  �ִ� ��� !! 
		//System.out.println �ȿ� �ִ� �޼��尡 ���� �����.. �׸��� �� �ȿ� �ִ� System.out.println("dddd") ����ǰ� ���ϰ��� ���� �� ����� �޼���� �����ǰ�
		//�ٽ� �ٱ��� �ִ� System.out.println( ) ��ȣ�ȿ� �ִ� ����� �޼ҵ� �ƴ� ���ڿ��� ����ǰ� �ش� �޼ҵ忡 ��ȯ�� ���ϰ��� ���� ��µ�.
	
	}

}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) -");
		return a+b;
		
	}
	
	
	
}
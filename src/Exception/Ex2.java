package Exception;

public class Ex2 {

	public static void main(String[] args) {
		try {
			method1();// 3 (�ش� �޼ҵ忡 �ִ� finally ������ �����. �ش� ������ ���� ����. 
			//���� �ش� ������ ������ ������ �߻����� �ʰ� ���� �ڵ尡 ����Ǵµ� .. ���� ������ ���� ���ϸ� �߻��� ���� �ٿ��� ������ �߻��ǰ� ���� �� �Ʒ��� ���ʹ� ������ ���� �ʰ� ! ȣ��� �޼���� �ش� ������ ������ �޼ҵ�� ���ᰡ �ȴ�.
			//�׷��� finally������ ����� �Ǿ���.!! 
		}catch(Exception e) {// ��� ������ ���������� �߻��� ���ܸ� ó���� �� �ִ�.
			System.out.println(5);
		}
		
	}
	
	static void method1() {
		try {
			method2();// NullpointerException�� �߻��ϳ� catch ������ RunntimeException �Ǵ� Exception, NullPointerException�� �ƴ� ������ �ɷ� �ֱ⿡ �ش� ������ ���� �� ���� finally ������ �����..
			System.out.println(1);
		}catch(ArithmeticException e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

	static void method2() {
		throw new NullPointerException();
	}
}

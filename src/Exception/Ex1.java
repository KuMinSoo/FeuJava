package Exception;

public class Ex1 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b)throw new ArithmeticException();//���⼭ ������ �߻��Ǹ� �Ʒ� System.out.println(2)�� ������� �ʰ� �ٷ� Arithmetic�� ������ RuntimeException���� catch�Ǿ� ����.
			System.out.println(2);
		}catch(RuntimeException r) {
			System.out.println(3);
			return;// ������ ��������� �޼ҵ带 ����� ���������µ�... ��!! finally�� ������ finally�ִ� �κп��� ����ǰ� �޼ҵ带 ������.
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
		
	}
	
	
	
	public static void main(String[] args) {
		method(true);//1 3 5
		method(false);//1 2 5 6
		//1 3 5 1 2 5 6
	}
	
	


}

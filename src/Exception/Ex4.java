package Exception;

public class Ex4 {

	public static void main(String[] args) {
		try {
			method1();//NullPointerException�߻�
			System.out.println(6);//����ȵ�
		}catch(Exception e) {// Exception�� �ְ� ���������� �����!!
			System.out.println(7);
		}
		}

	static void method1() throws Exception{
		try {
			method2();//NullPointerException �߻���
			System.out.println(1);//������� ����!
		}catch(NullPointerException e) {
			System.out.println(2);//��� 2
			throw e;// �ٽ� �� ���� �߻�!! �Ʒ��� �ڵ�� ������� ������ finally���� �����ϰ� �޼ҵ� ������
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4); //��� 4 // finally ���� �� �޼ҵ� ����
		}
		System.out.println(5);
		
	}
	
	
	
	static void method2() {
		throw new NullPointerException();
	}
	
}

package Exception;

public class MultiException {

	public static void main(String[] args) {
		try {
			
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException e) {
			//���ܸ� "|"�� ����ؼ� ������ �� �� �ִ�. �׷��� �ϳ��� catch�� �������� ���� ������ �� �� �ִµ� �� �ڽİ� �������� �ȵȵ� ��: catch(Exception | NullPointerException e)
			
			e.printStackTrace();//���ܹ߻� ��� ȣ�⽺�ÿ� �־��� �޼��� ���� + ���� �޼���
			e.getMessage();//���� �޼���

			//�ش� ���� �߿� �ϳ��� �ɸ���  catch���� ó���ϴµ� � �������� ���������� �˱� ��ƴ�
			//�׸��� �ش� ������ �޼ҵ带 ����Ϸ��� � ���ܰ� �߻������� �ν��ؾߵǴµ� �װ� ���������� ���������� �ʾ� �Ʒ��� ���� �������־�� �Ѵ�.
			if(e instanceof ArithmeticException) {
				ArithmeticException a=(ArithmeticException)e;
				//a.getSuppressed();
			}
 			
		}

	}

}

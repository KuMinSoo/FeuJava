package Exception;

public class CheckedUnchecked {

	public static void main(String[] args) {

		//throw new Exception(); ������ ������ �߻���. �� Exception�� �ڼ� ���ܵ��� checked Exception�̸�
		//������� �Ǽ��� ����� �߻��� �� �ִ� �����̱⶧���� �ݵ�� ����ó���� ���־���Ѵ�.(throw or try - catch)

		//RuntimeException�� ����ó�� ���û���
		try {
			throw new RuntimeException();	
		}catch(RuntimeException e) {
			e.printStackTrace();//��¹��� �����.
			System.out.println(e.getMessage());// ��¹� �ȿ� �־ ������־����.
			
		}
		//Runtime Exception�� �� �ڼյ��� ���ܸ� ���Ƿ� �������������� ������ ������ �߻����� �ʴ´�.
		//�� ������ ���α׷��Ӱ� �Ǽ��� �߻��Ǵ� �����̰� ���Ƿ� ������ ���������� ���α׷��ӿ� ���� �ǵ��� ������� �Ǵ��ϱ� �����̴�. �̸� Unchecked Exception�̶�� �Ѵ�.
		//��, ���α׷����� ���� ������ �� �ִ� �����̴�. ������ ���� X
		//������ ������ �߻��ϱ� ������ ���� �����ϸ�  RuntimeException ������ �߻��ǰ� �̸� �������� ���ܸ� ����ָ� �ȴ�.(throw or try - catch)
		
		
		
		//�׷��� new Exception�� ���� �ڽĵ��� ����ڿ� ���ؼ� �߻��� �� �ִ� �����ϱ� ����� �����̱� ������ ������ ���� �� �� �ְ� �̿� �ݵ�� ���� ó��(try-catch)�� üũ���־�� �Ѵ�.
	}

}

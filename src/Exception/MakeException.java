package Exception;

public class MakeException {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("Exception ���� �߻�");//���� ��ü ����
			throw e;//���� ��ü�� throw�� �������� ���� �߻���. throw���� ������ ���� �߻����� ����
			
			//�� ������ �Ʒ��� ���� �� �������� ǥ��������. 
			//throw new Exception("Exception2���� �߻�");
			//��, try{}������ throw e�� ������ �̹� �߻����������� �ѹ� �� throw e�� ������ �߻���Ű�°Ŵ� ���ǹ��ϸ�, ������ ������ �߻���
		
		}catch(Exception e) {
			System.out.println("�����޼���:"+e.getMessage());
			e.printStackTrace();
		}

	}

}

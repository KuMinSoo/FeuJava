package Exception;

public class MethodException {

	public static void main(String[] args) throws Exception{
		method1();
		//method2���� ó�� ���ܰ� �߻������� �޼ҵ� ����ο� throw Exception�� �߱� ������ method2�� ȣ���� ������ ��������.
		//method2�� ȣ���� method1�� ������ ������ ���� ó���ؾߵǴµ� ���⼭ �ΰ��� ���ñ��� �ִ� throw�� ó������ try catch�� ó������ 
		//try catch ó���ϸ� �� �ڸ����� ������ catch�� ���� �� ����. �׷��� �޼��� ����ο� throws�� ó���� ��� �ش� �޼���� ȣ���� ������ �ٽ� ������.
		//method1�� ����ó���� throwó���߱� ������ ȣ���� main �޼��忡�� ���ܸ� ó�����־�� �Ѵ�. 
		//�׷��� main �޼��嵵 throw�� ó���߱⶧���� ... main�޼��忡�� �߻��� ������ JVM���� ���� �Ǹ� JVM������ �ش� ������ �ľ��ϰ� �̸� �ܼ�â�� ��½�Ų��.
		
	}
	static void method1() throws Exception{
		method2();
	}
	
	
	static void method2() throws Exception{
		throw new Exception();
	}

}

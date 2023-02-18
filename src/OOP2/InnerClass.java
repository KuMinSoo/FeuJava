package OOP2;

public class InnerClass {

	class InstanceInner{//Ŭ������ ���� Ŭ������ �ν��Ͻ� ������ ������ ����� �Ѵ�.
		int iv=100;
		//static int cv=100; �ν��Ͻ� Ŭ�����ȿ� static ������ ����� �� ����... �޸� �ε� �� ���Ŀ� �ν��Ͻ�Ŭ������ �����Ǵµ�...
		//static ������ �޸� �ε� �ɶ� �����Ǵ� ������ �ν��Ͻ� Ŭ���� �ȿ� ���� ���Ѵ�.
		
		final static int CONST =100;// �׷��� final static �� ������̹Ƿ� ���ȴ�!!! �߿�
	}
	
	static class StaticInner{// static ���� Ŭ�������� static�� �ν��Ͻ� ��� ��� ����
		int iv = 200;
		static int cv=200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
			static final int CONST=300;//����� �ν� �Ǿ� ��밡����
			//static int cv=300;�ν��Ͻ� ���� Ŭ���������� static ������ ���� �����̵ʤ�
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
		
	
	}

}

package OOP1;

public class Initialization {
	static {
		System.out.println("�ʱ�ȭ ���� �����մϴ�....");//�ʱ�ȭ ���� �ѹ��� ����
	}
	
	//�ν��Ͻ� ���� �ν��Ͻ��� ���涧�Ŵ� ������
	{
		System.out.println("�ν��Ͻ� ���� ����Ǿ����ϴ�......");
	}
	
	static int[]arr=new int[10];
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("ex1 ������ ����ڽ��ϴ�");
		Initialization ex1=new Initialization();
		
		System.out.println("ex2 �����ڸ� ����ڽ��ϴ�");
		Initialization ex2=new Initialization();
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		
		
	}

}

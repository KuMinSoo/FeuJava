package JavalangPackage;

public class StringBufferEx2 {

	public static void main(String[] args) {

		String a=new String("123");
		String b=new String("123");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		//String������ equals �޼��尡 �ش� ���� ���� �� �ֵ��� �������̵��� �Ǿ�������..!!
		//StringBuffer�� equals�޼��尡 �������̵� ���� �ʾƼ� �ּҰ��� �� �ϴ� == �� �����ϴ�
		
		StringBuffer d=new StringBuffer("123");
		StringBuffer e=new StringBuffer("123");

		System.out.println(d==e);
		System.out.println(d.equals(e));
	
		
		//toString�� �������̵��� �ϰ� �־ �ش� ���ڿ�!!�� ������ش� 
		System.out.println(d);
		System.out.println(d.toString());
		//�׷��� StringBuffer ���ڿ��� ���Ҷ� equals �޼ҵ带 �������̵� �ϰų� �������̵��� ��������..
		//���ڿ��� �̾Ƽ� ���ϸ� �ȴ�
		System.out.println(d.toString().equals(e.toString()));
	}

}

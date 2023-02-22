package JavalangPackage;

public class ParseInt1 {

	public static void main(String[] args) {

		int i=Integer.parseInt("100");
		int i2=Integer.valueOf("100");
		int i3=new Integer("100").intValue();
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		
		int i4=Integer.parseInt("100", 2); //100�̶�� �������� �������� ǥ���ϱ�
		int i5=Integer.parseInt("100", 8); //8���� 100�� 10������ ǥ���ϱ�
		int i6=Integer.parseInt("111",16);//16���� 111�� 10������ ǥ���ϱ�
		int i7=Integer.parseInt("AAF",16);//16���� AAF�� 10������ �ٲٱ�
		
		System.out.println("100(2): "+i4);
		System.out.println("100(8): "+i5);
		System.out.println("111(16): "+i6);
		System.out.println("AAF(16): "+i7);//256*10+16*10+16 =2560+160+16=2735
		
		int i8=Integer.valueOf("111",2);
		System.out.println(i8);
		int i9=Integer.valueOf("101",8);
		System.out.println(i9);
		int i10=Integer.valueOf("AA",16);
		System.out.println(i10);
		
		int b=new Float("100f").intValue();//�ش� Float��ü�� int�� ��ȯ��
		System.out.println(b);
		
		int b1=new Float("100.23f").intValue();//100.23f�� int�� ��ȯ��. 100 �� �Ҽ����� ������
		System.out.println(b1);
		
		int b2=new Double("123.123124D".trim()).intValue();//�Ҽ��� �������鼭 int������ ��ȯ��
		System.out.println(b2);
	
	}

}

package JavalangPackage;

public class WrapperClass2 {

	public static void main(String[] args) {
		Integer i=new Integer(100);
		Integer ii=new Integer(100);
		System.out.println("i==ii: "+(i==ii));
		System.out.println("i.equals(ii): "+i.equals(ii)); //�⺻���� String�� equals �޼ҵ尡 �������̵� �Ǿ��ְ�! ����Ŭ���� ���� equals�� �������̵� �Ǿ� ����.
		System.out.println(i.compareTo(ii));
		System.out.println(i.toString());
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Byte.SIZE);

		System.out.println(Byte.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Integer.BYTES);
		
		System.out.println(Integer.TYPE);
		System.out.println(Byte.TYPE);
		System.out.println(Float.TYPE);
	}

}

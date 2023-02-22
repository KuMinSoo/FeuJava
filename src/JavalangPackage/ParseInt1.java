package JavalangPackage;

public class ParseInt1 {

	public static void main(String[] args) {

		int i=Integer.parseInt("100");
		int i2=Integer.valueOf("100");
		int i3=new Integer("100").intValue();
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		
		
		int i4=Integer.parseInt("100", 2); //100이라는 이진수를 십진수로 표현하기
		int i5=Integer.parseInt("100", 8); //8진수 100을 10진수로 표현하기
		int i6=Integer.parseInt("111",16);//16진수 111을 10진수로 표현하기
		int i7=Integer.parseInt("AAF",16);//16진수 AAF를 10진수로 바꾸기
		
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
		
		int b=new Float("100f").intValue();//해당 Float객체를 int로 변환함
		System.out.println(b);
		
		int b1=new Float("100.23f").intValue();//100.23f를 int로 변환함. 100 즉 소수점은 버려짐
		System.out.println(b1);
		
		int b2=new Double("123.123124D".trim()).intValue();//소수점 버려지면서 int값으로 반환됨
		System.out.println(b2);
	
	}

}

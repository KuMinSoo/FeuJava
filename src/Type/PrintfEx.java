package Type;

public class PrintfEx {

	public static void main(String[] args) {
		System.out.println(11);
		int age=14;
		System.out.printf("age: %d\n",age);
		System.out.printf("age: %d%n", 14);
		System.out.printf("age: %d, year: %d%n",145,2013 );
		
		int num=1003;
		float fla=2.2f;
		System.out.printf("16진수: %7x%n",num);
		System.out.printf("10진수: %-6d",num);
		System.out.printf("문자열: %5s%n",num);//문자를 String값으로 변환
		System.out.printf("부동 소수점: %f%n",fla);
	
		System.out.println("=====연습문제====");
		
		float f1=.10f;// 0.10f ,1.0e-1,10e-2,100e-3,.01e1f
		float f2=1.0e-1f;// 1.0 * 10^-1(^기호는 지수표현 예 2의 2승->2^2)
		float f3=100e-3f;// 100 * 10^-3
		float f4=1000e-4f;// 1000 * 10^-4
		float f5=.0001e3f;// 0.0001 * 10^3
		float f6=0.0001e+3f;// 0.0001 * 10^3
		float f7=0.001e+2f;// 0.001 * 10^2(e+2)
		float f8=0.001e2f;// 0.001 * 10^2(e2) 즉, 10^2=e+2또는 e2 라고 표현 한다
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		
		System.out.println("====교재 연습문제 ====");
		String url="www.codechobo.com";
		float ff1=.1f;
		float ff2=1e1f;
		float ff3=3.14e3f;
		double d=1.23456789;
		
		System.out.printf("ff1=%f, %e, %g%n",ff1,ff1,ff1);
		System.out.printf("ff2=%f, %e, %g%n",ff2,ff2,ff2);
		System.out.printf("ff3=%f, %e, %g%n",ff3,ff3,ff3);
		System.out.printf("d=%f%n",d);
		System.out.printf("[%s]%n",url);
		System.out.printf("[%20s]%n",url);
		System.out.printf("[%-20s]%n",url);
		System.out.printf("[%.8s]%n",url);
		System.out.printf("d=%14.10f",d);
		
	}	
}

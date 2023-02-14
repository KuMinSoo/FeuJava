package arithmeticOperator;

public class CastingEx {

	public static void main(String[] args) {
		// 자동항변환 연습
		
		Integer b='a'+'b';
		System.out.println(b);
		float f=111111111111L;//long타입 자동항변환 float
		System.out.println(f);
		float d='A'+'b';
		System.out.println(d);
		float dd=4.1231f+1231.123f+1231231231233l+'a';
		System.out.println(dd);
		Float cc=1+1.0f;
		
		double b1=1.0f;
		//Double b2=1.0f;
		float a1=1;
		//Double b2=2+'A';
		
		
		Integer c1='a'+'b';
		
		double ddc1= 1.0f+'a';
		//Double ddc2= 1.0f+'a';// 자동항변환 안됨... 그 이유 기본타입과 항변환이되나 클래스 타입은 항변환이 안되기 때문에 직접 항변환을 해주어야한다. 그래서 기본형 타입을 사용하는 이유이다. 
		Double ddc2= (double)1.0f+'a';
	// 선언된 변수보다 값의 표현범위가 좁을 경우 자동항변환하여 계산이되지만 
	// double이 아닌 Double을 변수로 지정할 경우 계산값결과가 Double/double 형태이거나 강제항변환을 해주어야한다.
		
		System.out.println("=====사칙 연산자=====");
		int a=10;
		int c=4;
		System.out.printf("%f/ %f = %f",(float)a,(float)c,(float)a/c);
		//System.out.printf(%f,안에 값을 실수로 해주어야된다.. 만약 실수가 아니면 에러 발생(형식 불일치)
		
		byte ac=10;
		byte bc=20;
		//byte dsf=ac+bc;에러 발생
		byte dsf=(byte)(ac+bc);//에러 발생
		//또는
		int asdfq=ac+bc;
	
	}

}

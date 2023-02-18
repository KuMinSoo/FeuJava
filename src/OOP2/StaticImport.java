package OOP2;

import java.lang.Math;//해당 클래스가 어디 패키지에 소속되어 있는지 말해준다. 그리고 그 클래스의 매소드를 사용할 수 있고 클래스 이름을 붙이고난 후 해당 메소드 사용가능
// (java.lang)클래스.매서드: java.lang은 자동으로 붙여줌!

import static java.lang.Math.*;
// static 패키지명.클래스명.메소드명: 이렇게 붙이면 클래스명을 붙이지 않고 메소드만 호출해서 사용가능함. 

import static java.lang.System.out;// static 패키지명.클래스명.메소드명!!!!!! 해당 메소드만 호출해서 사용할 수 있음

public class StaticImport {

	public static void main(String[] args) {

		Math.random();
		random();
		
		out.println(random());
		out.print("Math.PI :"+PI);
		
	}

}

package Exception;

public class Ex2 {

	public static void main(String[] args) {
		try {
			method1();// 3 (해당 메소드에 있는 finally 문구만 실행됨. 해당 오류를 잡지 못함. 
			//만약 해당 오류를 잡으면 오류가 발생되지 않고 다음 코드가 실행되는데 .. 만약 오류를 잡지 못하면 발생된 오류 줄에서 오류가 발생되고 다음 줄 아래로 부터는 실행이 되지 않고 ! 호출된 메서드로 해당 오류가 던지고 메소드는 종료가 된다.
			//그래서 finally까지만 출력이 되었다.!! 
		}catch(Exception e) {// 모든 예외의 조상임으로 발생된 예외를 처리할 수 있다.
			System.out.println(5);
		}
		
	}
	
	static void method1() {
		try {
			method2();// NullpointerException이 발생하나 catch 에서는 RunntimeException 또는 Exception, NullPointerException도 아닌 조건이 걸려 있기에 해당 오류를 잡을 수 없고 finally 문구만 실행됨..
			System.out.println(1);
		}catch(ArithmeticException e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
	}

	static void method2() {
		throw new NullPointerException();
	}
}

package Exception;

public class MethodException {

	public static void main(String[] args) throws Exception{
		method1();
		//method2에서 처음 예외가 발생됬으며 메소드 선언부에 throw Exception을 했기 때문에 method2를 호출한 곳으로 던져진다.
		//method2를 호출한 method1은 에러가 던져진 것을 처리해야되는데 여기서 두가지 선택권이 있다 throw로 처리할지 try catch로 처리할지 
		//try catch 처리하면 그 자리에서 에러를 catch로 잡을 수 있음. 그러나 메서드 선언부에 throws로 처리할 경우 해당 메서드로 호출한 쪽으로 다시 보낸다.
		//method1의 예외처리를 throw처리했기 때문에 호출한 main 메서드에서 예외를 처리해주어야 한다. 
		//그러나 main 메서드도 throw로 처리했기때문에 ... main메서드에서 발생한 오류는 JVM으로 가게 되며 JVM에서는 해당 오류를 파악하고 이를 콘솔창에 출력시킨다.
		
	}
	static void method1() throws Exception{
		method2();
	}
	
	
	static void method2() throws Exception{
		throw new Exception();
	}

}

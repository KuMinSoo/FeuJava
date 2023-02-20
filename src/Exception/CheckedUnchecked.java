package Exception;

public class CheckedUnchecked {

	public static void main(String[] args) {

		//throw new Exception(); 컴파일 에러가 발생함. 즉 Exception의 자손 예외들은 checked Exception이며
		//사용자의 실수로 충분히 발생할 수 있는 예외이기때문에 반드시 예외처리를 해주어야한다.(throw or try - catch)

		//RuntimeException은 예외처리 선택사항
		try {
			throw new RuntimeException();	
		}catch(RuntimeException e) {
			e.printStackTrace();//출력문이 내재됨.
			System.out.println(e.getMessage());// 출력문 안에 넣어서 출력해주어야함.
			
		}
		//Runtime Exception과 그 자손들의 예외를 임의로 설정했을때에는 컴파일 에러가 발생하지 않는다.
		//그 이유는 프로그래머가 실수로 발생되는 에러이고 임의로 에러를 설정했으며 프로그래머에 의해 의도된 에러라고 판단하기 때문이다. 이를 Unchecked Exception이라고 한다.
		//즉, 프로그램머의 의해 통제될 수 있는 예외이다. 컴파일 에러 X
		//컴파일 에러가 발생하기 않지만 실제 실행하면  RuntimeException 에러가 발생되고 이를 막으려면 예외를 잡아주면 된다.(throw or try - catch)
		
		
		
		//그러나 new Exception과 하위 자식들은 사용자에 의해서 발생될 수 있는 통제하기 어려운 에러이기 때문에 에러가 쉽게 날 수 있고 이에 반드시 예외 처리(try-catch)를 체크해주어야 한다.
	}

}

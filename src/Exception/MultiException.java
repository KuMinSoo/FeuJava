package Exception;

public class MultiException {

	public static void main(String[] args) {
		try {
			
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException | ClassCastException e) {
			//예외를 "|"를 사용해서 여러개 둘 수 있다. 그래서 하나의 catch로 여러개의 예외 정보를 둘 수 있는데 단 자식과 조상관계는 안된데 예: catch(Exception | NullPointerException e)
			
			e.printStackTrace();//예외발생 당시 호출스택에 있었던 메서드 정보 + 예외 메세지
			e.getMessage();//예외 메세지

			//해당 예외 중에 하나라도 걸리면  catch에서 처리하는데 어떤 오류인지 직관적으로 알기 어렵다
			//그리고 해당 예외의 메소드를 사용하려면 어떤 예외가 발생한지를 인식해야되는데 그걸 직관적으로 가르쳐주지 않아 아래와 같이 구분해주어야 한다.
			if(e instanceof ArithmeticException) {
				ArithmeticException a=(ArithmeticException)e;
				//a.getSuppressed();
			}
 			
		}

	}

}

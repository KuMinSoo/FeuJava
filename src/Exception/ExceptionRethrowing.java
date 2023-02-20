package Exception;

public class ExceptionRethrowing {

	public static void main(String[] args) throws Exception {
		try {
		method1();
		}catch(Exception e) {
			System.out.println("method에서 예외처리되었습니다");
		}
	}
	
	static void method1() throws Exception{
		try {
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("main에서 예외가 처리되었습니다.");
			throw e;
		}
	}

}

package Exception;

public class ExceptionRethrowing {

	public static void main(String[] args) throws Exception {
		try {
		method1();
		}catch(Exception e) {
			System.out.println("method���� ����ó���Ǿ����ϴ�");
		}
	}
	
	static void method1() throws Exception{
		try {
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("main���� ���ܰ� ó���Ǿ����ϴ�.");
			throw e;
		}
	}

}

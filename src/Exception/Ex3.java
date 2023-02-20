package Exception;

public class Ex3 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);//해당 메소드(System.exit(0))는 프로그램 실행을 즉시 중단한다. 고로 finally 문이 실행될 수 없이 종료된다. 
			System.out.println(2);
		}catch(RuntimeException r) {
			System.out.println(3);
			return;
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	
	public static void main(String[] args) {

		method(true);
		method(false);
		
	}

}

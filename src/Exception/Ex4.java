package Exception;

public class Ex4 {

	public static void main(String[] args) {
		try {
			method1();//NullPointerException발생
			System.out.println(6);//실행안됨
		}catch(Exception e) {// Exception의 최고 조상임으로 실행됨!!
			System.out.println(7);
		}
		}

	static void method1() throws Exception{
		try {
			method2();//NullPointerException 발생함
			System.out.println(1);//실행되지 않음!
		}catch(NullPointerException e) {
			System.out.println(2);//출력 2
			throw e;// 다시 또 오류 발생!! 아래의 코드는 실행되지 않으나 finally까지 실행하고 메소드 종료함
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4); //출력 4 // finally 실행 후 메소드 종료
		}
		System.out.println(5);
		
	}
	
	
	
	static void method2() {
		throw new NullPointerException();
	}
	
}

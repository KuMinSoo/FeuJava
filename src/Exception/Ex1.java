package Exception;

public class Ex1 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b)throw new ArithmeticException();//여기서 에러가 발생되면 아래 System.out.println(2)는 실행되지 않고 바로 Arithmetic의 조상인 RuntimeException으로 catch되어 진다.
			System.out.println(2);
		}catch(RuntimeException r) {
			System.out.println(3);
			return;// 리턴을 적용받으면 메소드를 벗어나서 빠져나가는데... 단!! finally가 있으면 finally있는 부분에서 실행되고 메소드를 나간다.
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println(5);
		}
		System.out.println(6);
		
	}
	
	
	
	public static void main(String[] args) {
		method(true);//1 3 5
		method(false);//1 2 5 6
		//1 3 5 1 2 5 6
	}
	
	


}

package OOP1;

public class ThisEx1 {

	public static void main(String[] args) {

		
	}

}

class Testt{
	int x;
	int y;
	int z=1;
	
	void method() {
		int i;
		//int dd=i; 에러발생... 지역변수  i는 아무런 값을 입력하지 않을때 맴버변수와 달리 기본값으로 저장되지 않는다.
		
		int y=x;// OK 왜냐하면 맴버변수에서 아무런 값을 입력하지 않으면 해당 타입에 기본값으로 저장되기 때문 
				// 즉, y=0으로 저장됨
	}
	
	
	
	
}
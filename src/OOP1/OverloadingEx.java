package OOP1;

public class OverloadingEx {

	public static void main(String[] args) {

		MyMath3 mm=new MyMath3();
		System.out.println("mm.add(3,3) 결과:" + mm.add(3, 3));
		System.out.println("mm.add(3,3L) 결과: " + mm.add(3, 3L));
		//System.out.println 안에 또 메서드가 있고 그 메서드 구현부 안에 System.out.println("dddd")  있는 경우 !! 
		//System.out.println 안에 있는 메서드가 먼저 실행됨.. 그리고 그 안에 있는 System.out.println("dddd") 실행되고 리턴값을 얻은 후 실행된 메서드는 삭제되고
		//다시 바깥에 있는 System.out.println( ) 괄호안에 있는 실행된 메소든 아닌 문자열이 실행되고 해당 메소드에 반환된 리턴값도 같이 출력됨.
	
	}

}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) -");
		return a+b;
		
	}
	
	
	
}
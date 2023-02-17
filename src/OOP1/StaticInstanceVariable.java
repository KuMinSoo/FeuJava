package OOP1;






public class StaticInstanceVariable {

	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
		// instanceMethod(); 에러 발생... 클래스가 메모리에 올라갈때 자동적으로 인스턴스 메서드가 생성되어 있지 않기 때문
		staticMethod();// 클래스가 메모리에 올라갈때 자동적으로  해당 static 메서드 생성된다.
		new StaticInstanceVariable().instanceMethod();
		//객체를 생성해서 인스턴스 메서드를 소환하면 가능함. 즉, 메모리 생성할 시기에 객체를 직접!! 생성해버림 
		//그 이유는 메인 메서드에서 객체를 생성하면 시기가 늦어져 static 메서드가 인식할 수 없기 때문
	}
	
	
	public static void main(String[] args) {

		
		
	}
	

}
class TestClass2{
	int iv;
	static int cv;
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {
		//System.out.println(iv);11
		System.out.println(cv);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
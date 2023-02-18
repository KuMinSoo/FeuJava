package OOP2;

public class InterfaceEx {

	public static void main(String[] args) {
		Child4 c=new Child4();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticmethod();
	}
	

}
class Child4 extends Parent4 implements MyInterface,MyInterface2{
	
	 public void method1() { System.out.println("child method1()"); }
	
}


class Parent4 {
	public void method2() {
		System.out.println("method1() in Parent3");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	
}

interface MyInterface2{
	
	default void method1() {
		System.out.println("method() in MyInterface2");
	}
	static void staticmethod() {
		System.out.println("staticmethod() in MyInterface2");
	}
	
}
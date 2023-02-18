package OOP2;

public class InnerClassEx2 {

	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv=new InstanceInner();
	static StaticInner cv=new StaticInner();
	
	static void staticMethod() {
		StaticInner obj2=new StaticInner();
		//InstanceInner obj1=new InstanceInner(); 
		
		InnerClassEx2 outer= new InnerClassEx2();
		InstanceInner obj1= outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1=new InstanceInner();
		StaticInner obj2=new StaticInner();
		//LocalInner lv =new LocalInner(); 사용불가 .. 그 이유는 메서드 내에서 선언된 내부 클래스는 메서드가 종료되면 없어지는 클래스이기 때문에 다른 메소드에서 사용불가
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv=new LocalInner();
	}
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}

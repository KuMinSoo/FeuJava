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
		//LocalInner lv =new LocalInner(); ���Ұ� .. �� ������ �޼��� ������ ����� ���� Ŭ������ �޼��尡 ����Ǹ� �������� Ŭ�����̱� ������ �ٸ� �޼ҵ忡�� ���Ұ�
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv=new LocalInner();
	}
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}

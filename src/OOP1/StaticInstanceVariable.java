package OOP1;






public class StaticInstanceVariable {

	void instanceMethod() {}
	static void staticMethod() {}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
		// instanceMethod(); ���� �߻�... Ŭ������ �޸𸮿� �ö󰥶� �ڵ������� �ν��Ͻ� �޼��尡 �����Ǿ� ���� �ʱ� ����
		staticMethod();// Ŭ������ �޸𸮿� �ö󰥶� �ڵ�������  �ش� static �޼��� �����ȴ�.
		new StaticInstanceVariable().instanceMethod();
		//��ü�� �����ؼ� �ν��Ͻ� �޼��带 ��ȯ�ϸ� ������. ��, �޸� ������ �ñ⿡ ��ü�� ����!! �����ع��� 
		//�� ������ ���� �޼��忡�� ��ü�� �����ϸ� �ñⰡ �ʾ��� static �޼��尡 �ν��� �� ���� ����
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
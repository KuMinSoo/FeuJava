package OOP2;

public class InnerClass {

	class InstanceInner{//클래스의 내부 클래스로 인스턴스 변수와 동일한 취급을 한다.
		int iv=100;
		//static int cv=100; 인스턴스 클래스안에 static 변수를 사용할 수 없음... 메모리 로드 된 이후에 인스턴스클래스가 생성되는데...
		//static 변수는 메모리 로드 될때 생성되는 변수라 인스턴스 클래스 안에 담지 못한다.
		
		final static int CONST =100;// 그러나 final static 은 상수로이므로 허용된다!!! 중요
	}
	
	static class StaticInner{// static 내부 클래스에는 static과 인스턴스 모드 사용 가능
		int iv = 200;
		static int cv=200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
			static final int CONST=300;//상수로 인식 되어 사용가능함
			//static int cv=300;인스턴스 내부 클래스에서는 static 변수가 먼저 생성이됨ㅁ
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		
		
	
	}

}

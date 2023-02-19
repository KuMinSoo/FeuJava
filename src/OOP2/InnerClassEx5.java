package OOP2;

 class Outerr{
	
	class InnerClasss{
		int v=10;
		//static aaa=1;
	}
	
	static class StaticClasss{
		static int vv=11;
		int ed=1;
	}
	
}



public class InnerClassEx5 {

	public static void main(String[] args) {
		System.out.println(new Outerr().new InnerClasss().v);//Outter 객체 생성 후 내부 클래스 InnerClass()를 생성해서 내부 클래스 안에 있는 v
		
		System.out.println(Outerr.StaticClasss.vv);
		// Outter안에 있는 static class를 호출하고 그 안에 있는 static 매서드를 부를 수 있다. 
		// static은 main메소드 호출하기 전에 메모리 영역에서 로드됨으로써 바로 호출 할 수 있다
		
		System.out.println(new Outerr.StaticClasss().ed);
		//그러나 static 내부에 있는 class에 인스턴스변수가 있으면 객체를 생성해주엉야 한다.
		//Outter.staticClass를 하나로 보면된다. 이 하나의 static 클래스의 인스턴스 객체를 생성하는 것이다.
		//그래서 new Outter.StaticClasss()가 된다.
		
		System.out.println(new Outter().new StaticClasss());
		
		//System.out.println(new Outter().new StaticClasss.vv);
		//여기서는 오류가 발생된다.
		//그 이유는 new Outter()객체를 생성하고 그 안에서 내부 static 클래스를 부르려면 오류가 발생한다.
		//인스턴스 클래스 안에 static변수를 넣을 수 없는 것과 같은 원리이다.
		
		//System.out.println(Outer.new innerClass());//클래스명. 뒤에서는 변수 또는 매서드만 올 수 있다
	
	}
	
	

}

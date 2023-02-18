package OOP2;

public class InnerClassEx3 {
	
	
	
	public static void main(String[] args) {


		
		
	}

}
class Outer{
	
	private int outerIv=0;
	static int outerCv=0;
	
	class InstanceInner{
		int iiv=outerIv;
		int iiv2=outerCv;
	}
	static class StaticInner{
		static int scv=outerCv;
		int scv1=outerCv;
		
		Outer out=new Outer();
		int aa=out.outerIv;
	}

	void myMethod() {
		int lv=0;
		final int LV=0;
		
		class LocalInner{
			int liv=outerIv;
			int liv2=outerCv;
			int liv3=lv;
			int liv4=LV;
			//lv=4; 오류 발생 int lv=0이라고 설정되었지만 final int lv=0으로 final이 생략되어 표현됨. 이에 해당 변수를 상수이기에 값을 재설정할 수 없다
			//LV=3; 해당 변수는 상수이기 때문에 변경하기 어렵다.
		}
		
		
	}
	
}
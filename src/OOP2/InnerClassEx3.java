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
			//lv=4; ���� �߻� int lv=0�̶�� �����Ǿ����� final int lv=0���� final�� �����Ǿ� ǥ����. �̿� �ش� ������ ����̱⿡ ���� �缳���� �� ����
			//LV=3; �ش� ������ ����̱� ������ �����ϱ� ��ƴ�.
		}
		
		
	}
	
}
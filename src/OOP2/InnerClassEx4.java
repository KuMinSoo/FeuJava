package OOP2;


class Outer22{
	int aa=10;
	public final class InstanceInner{
		int iv=100;
		
	}
	static class StaticInner{
		int iv=200;
		static int cv=300;
	}
	void myMethod() {
		class LocalInner{
			final int iv=400;
		}
	}
}

public class InnerClassEx4 {
	public static void main(String[] args) {
		System.out.println("Outer22.Instance-------");
		Outer22.InstanceInner i=new Outer22().new InstanceInner();
		System.out.println(i.iv);
		System.out.println(new Outer22().new InstanceInner().iv);
		
		new Outer22.StaticInner();
		//new Outer22 �⺻������ �������� �ʰ� �ν��Ͻ��� ������.
		//new Outer22�ν��Ͻ�O, ������ ���� X, �����ʱ�ȭ X(���� 0 or null ������) 
		//new Outer22.StaticInner() Outer22�ȿ� �ִ� StaticInner() �ν��Ͻ��� �����ڸ� ������.
		//��, Outer22.StaticInner() �ν��Ͻ� + �����ڸ� ������.
		
		System.out.println(Outer22.StaticInner.cv);
		//�ܺ� Ŭ���� Outer22�ȿ� �ִ� ����staticŬ������ static cv ������ �ٷ� ��밡��..
		//
		
		
		
		
		
		
		System.out.println("Outer22.StaticInner---------");
		System.out.println(Outer22.StaticInner.cv);
		System.out.println(new Outer22.StaticInner().cv);
		System.out.println(new Outer22.StaticInner().iv);
		//System.out.println(new Outer22().new StaticInner().iv); ���� �߻�
	
		
		
		Outer22.StaticInner s=new Outer22.StaticInner();
		System.out.println(s.cv);
		System.out.println(s.iv);

		new Outer22().new InstanceInner();
		//new Outer22().new StaticInner(); ���� �ֳ��ϸ� �̹� static���� ���������ϱ� ������ new StaticInner�� �ƴ� �Ʒ��� ���� �θ���.
		new Outer22.StaticInner();
		
		System.out.println(Outer22.StaticInner.cv);
		
		
		System.out.println();
		System.out.println("============");
		Outer22 oc=new Outer22();
		Outer22.InstanceInner ii= oc.new InstanceInner();
		System.out.println("ii.iv: "+ii.iv);
		System.out.println("Outer22.StaticInner.cv: "+Outer22.StaticInner.cv);
	
		Outer22.StaticInner si=new Outer22.StaticInner();
		System.out.println("si.iv: "+si.iv);

		Outer22.InstanceInner iii=new Outer22().new InstanceInner();
		Outer22.StaticInner ss=new Outer22.StaticInner();
		System.out.println(ss.iv);
		System.out.println(ss.cv);
		System.out.println(Outer22.StaticInner.cv);
		//System.out.println(Outer22.InstanceInner.iv); ����!!
		
		
		
		
		
	
	}

}

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
		System.out.println(new Outerr().new InnerClasss().v);//Outter ��ü ���� �� ���� Ŭ���� InnerClass()�� �����ؼ� ���� Ŭ���� �ȿ� �ִ� v
		
		System.out.println(Outerr.StaticClasss.vv);
		// Outter�ȿ� �ִ� static class�� ȣ���ϰ� �� �ȿ� �ִ� static �ż��带 �θ� �� �ִ�. 
		// static�� main�޼ҵ� ȣ���ϱ� ���� �޸� �������� �ε�����ν� �ٷ� ȣ�� �� �� �ִ�
		
		System.out.println(new Outerr.StaticClasss().ed);
		//�׷��� static ���ο� �ִ� class�� �ν��Ͻ������� ������ ��ü�� �������־��� �Ѵ�.
		//Outter.staticClass�� �ϳ��� ����ȴ�. �� �ϳ��� static Ŭ������ �ν��Ͻ� ��ü�� �����ϴ� ���̴�.
		//�׷��� new Outter.StaticClasss()�� �ȴ�.
		
		System.out.println(new Outter().new StaticClasss());
		
		//System.out.println(new Outter().new StaticClasss.vv);
		//���⼭�� ������ �߻��ȴ�.
		//�� ������ new Outter()��ü�� �����ϰ� �� �ȿ��� ���� static Ŭ������ �θ����� ������ �߻��Ѵ�.
		//�ν��Ͻ� Ŭ���� �ȿ� static������ ���� �� ���� �Ͱ� ���� �����̴�.
		
		//System.out.println(Outer.new innerClass());//Ŭ������. �ڿ����� ���� �Ǵ� �ż��常 �� �� �ִ�
	
	}
	
	

}

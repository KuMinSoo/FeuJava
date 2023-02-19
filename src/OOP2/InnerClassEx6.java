package OOP2;

class Outer3{
	int value=10;
	
	class Inner22{
		int value=20;
		
		void method1() {
			int value=30;
			System.out.println("           value:"+value);
			System.out.println("      this.value:"+this.value);
			System.out.println("Outer3.this.value:"+Outer3.this.value);
		}
	}
	
}
public class InnerClassEx6 {

	public static void main(String[] args) {
		Outer3 a=new Outer3();
		Outer3.Inner22 c=a.new Inner22();
		c.method1();

	}

}

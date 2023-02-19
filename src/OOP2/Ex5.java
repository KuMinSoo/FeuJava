package OOP2;

class Outer111{
	int value=10;
	 class Inner{
		int iv=20;
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.iv);
			System.out.println(Outer111.this.value);
		}
	}
}


public class Ex5 {

	public static void main(String[] args) {
		
		Outer111.Inner o=new Outer111().new Inner();
		o.method1();
	}

}

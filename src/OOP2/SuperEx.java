package OOP2;


class Parent2{int x=10;}

class Child2 extends Parent2{
	int x=20;
	void method() {
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
	
}
public class SuperEx {

	public static void main(String[] args) {
		Child2 ch=new Child2();
		ch.method();

	}

}

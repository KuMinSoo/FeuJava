package Lamda;

@FunctionalInterface
interface MyFunction{
	void run();
}


public class LamdaEx {
	
	static void execute(MyFunction f) {
		f.run();
	}
	static MyFunction getMyFunction() {
		MyFunction f=()->{System.out.println("f3.run()");};
		return f;
	}
	
	public static void main(String[] args) {

		MyFunction f1=new MyFunction() {
			public void run() {
				System.out.println("f1.run()");
			}
		};
		
		MyFunction f2=()-> System.out.println("f2.run()");
		
		f1.run();
		f2.run();
		execute(getMyFunction());
		execute(()-> System.out.println("f4.run()"));
		execute(f1);
		execute(f2);
		
	}

}

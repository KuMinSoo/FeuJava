package ThreadEx;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable r=new ThreadA();
		Thread t=new Thread(r);
		t.start();
	
	}

}

class ThreadA implements Runnable{
	public void run() {
		for(int i= 0;i<300;i++) {
			System.out.print("-");
		}
	}
}
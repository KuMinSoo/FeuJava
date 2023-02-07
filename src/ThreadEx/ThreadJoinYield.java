package ThreadEx;

public class ThreadJoinYield {

	static long startTime=0;
	public static void main(String[] args) {
		ThreadEx11_1 t1= new ThreadEx11_1();
		ThreadEx11_2 t2= new ThreadEx11_2();
		startTime=System.currentTimeMillis();
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {}
		
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
		
	}

}
class ThreadEx11_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadEx11_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print(new String("|"));
		}
	}
}
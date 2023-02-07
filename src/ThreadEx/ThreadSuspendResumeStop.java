package ThreadEx;

public class ThreadSuspendResumeStop {

	public static void main(String[] args) {
		Runnable ra= new Thread9Ex_1(); 
		Thread t1=new Thread(ra,"*");
		Thread t2=new Thread(ra,"**");
		Thread t3=new Thread(ra,"***");
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
			t1.suspend();
			Thread.sleep(2000);
			t2.suspend();
			Thread.sleep(2000);
			t1.resume();
			Thread.sleep(2000);
			t1.stop();
			t2.stop();
			Thread.sleep(2000);
			t3.stop();
			
		} catch (InterruptedException e) {}		
	}

}
class Thread9Ex_1 implements Runnable{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
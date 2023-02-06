package ThreadEx;

public class ThreadPriority {

	public static void main(String[] args) {
		Runnable ra=new ThreadEx6_1();
		Thread th1=new Thread(ra);
		ThreadEx6_2 th2=new ThreadEx6_2();
		
		th2.setPriority(3);
		
		System.out.println("th1.getPriority(-)= "+th1.getPriority());
		System.out.println("th2.getPriority(|)= "+th2.getPriority());
		
		th1.start();
		th2.start();
		
	}

}

class ThreadEx6_1 implements Runnable{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print("-");
			for(int x=0;x<300000000;x++);
		}
	}
}

class ThreadEx6_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) System.out.print("|");
		for(int x=0;x<300000000;x++);
	}
}
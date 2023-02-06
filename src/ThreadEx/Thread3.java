package ThreadEx;

public class Thread3 {
	static long startTime=System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		ThreadEx3_1 e1=new ThreadEx3_1();
		e1.start();
		
		
		for(int i=0;i<300;i++) {
			System.out.printf("%s",new String("-"));
		}
		System.out.println("소요시간 1 : "+(System.currentTimeMillis()-Thread3.startTime));

		
		

	}

}


class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.printf("%s",new String(")"));
		}
		System.out.println("소요시간 2 : "+(System.currentTimeMillis()-Thread3.startTime));
	}
	
}
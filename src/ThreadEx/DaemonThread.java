package ThreadEx;

public class DaemonThread implements Runnable{

	static boolean autoSave=false;
	
	public static void main(String[] args) {
		Runnable ra=new DaemonThread();
		Thread t1=new Thread(ra);
		t1.setDaemon(true);
		t1.start();
		for(int i=1;i<11;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
			if(i==5) autoSave=true;
		}
		System.out.println("���α׷� ���� �մϴ�");
		
		
		
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
			}
			
			if(autoSave) autoSave();
		}
	}

	public static void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�..");
	}
}

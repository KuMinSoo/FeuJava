package ThreadEx;

import javax.swing.JOptionPane;

public class ThreadInterrupt {

	public static void main(String[] args) {
		ThreadEx9_1 th1=new ThreadEx9_1();
		th1.start();
		System.out.println("interrupted: "+th1.interrupted());
		String input=JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("���� ::"+input);
		th1.interrupt();
		
		System.out.println("isInterrupted: "+th1.isInterrupted());
		System.out.println("interrupted: "+th1.interrupted());
	}

}
class ThreadEx9_1 extends Thread{
	public void run() {
		int i=10;
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<25000000000L;x++);
		}
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�...");
	}
	
	
}
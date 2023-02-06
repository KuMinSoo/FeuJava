package ThreadEx;

import javax.swing.JOptionPane;

public class Thread5 {

	public static void main(String[] args) {
		ThreadEx_5 aa=new ThreadEx_5();
		aa.start();
		
		String input=JOptionPane.showInputDialog("입력하세요...........");
		System.out.println("입력한 값은 : "+input);

	}

}
class ThreadEx_5 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}
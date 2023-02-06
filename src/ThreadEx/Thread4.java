package ThreadEx;

import javax.swing.JOptionPane;

public class Thread4 {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("아무 값이나 입력하세요...");
		System.out.println("입력한 값은"+input+"입니다..");
		for(int i=5; i > 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

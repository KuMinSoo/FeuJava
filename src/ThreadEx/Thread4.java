package ThreadEx;

import javax.swing.JOptionPane;

public class Thread4 {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���...");
		System.out.println("�Է��� ����"+input+"�Դϴ�..");
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

package Exception;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		do {
			count++;
			System.out.println("1�� 100 �����ǰ��� �Է��ϼ��� :");
			try {
				input=new Scanner(System.in).nextInt();
			}catch(Exception e) {
				continue;
			}
			
			if(input>answer) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else if(input<answer){
				System.out.println("�� ū ���� �Է��ϼ���");
			}else {
				System.out.println("�­����ϴ�");
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�");
				break;
			}
			
			
		}while(true);
		
		

	}

	
}
/*
 * class InputMismatchException extends Exception{ InputMismatchException() {
 * 
 * } }
 */

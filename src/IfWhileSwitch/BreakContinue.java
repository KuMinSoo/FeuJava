package IfWhileSwitch;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		int meun;
		int num;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.println("���ϴ� �޴� (1-3)�� �����ϼ���. (����:0) >");
			int input=sc.nextInt();
			
			if(1<=input && input <=3) {
				System.out.printf("�����Ͻ� �޴��� %d�Դϴ�%n",input);
				continue;
			}else if(0==input) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				continue;
			}
			
		}
		
		
		
		
	}

}	

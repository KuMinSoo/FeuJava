package IfWhileSwitch;

import java.util.Scanner;

public class LoopName2 {

	public static void main(String[] args) {
		Loop1: for(;;) {
			
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���Ͻô� �޴�(1-3)�� �����ϼ���(����:0)");
			Scanner sc=new Scanner(System.in);
			int method=sc.nextInt();
			if(method==0) {
				System.out.println("���α׷� �����մϴ�."); break;
			}
		
			if(!(method>=1 && method<=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				continue;
			}
			
			for(;;) {
				System.out.println("����� ���� �Է��ϼ���(��� ����:0, ��ü����:99)");
				int num=sc.nextInt();
				
				
				/* if������ �ۼ�
				 * if(method==1) { System.out.printf("result= %d%n",num*num); }else
				 * if(method==2) { System.out.printf("result= %f%n",Math.sqrt(num)); }else
				 * if(method==3) { System.out.printf("result= %.2f%n",Math.log(num)); }
				 */
				
				//switch�� �ۼ�
				switch(num) {
				case 1:
					System.out.printf("result= %d%n",num*num); 
					break;
				case 2:
					System.out.printf("result= %f%n",Math.sqrt(num));
					break;
				case 3:
					System.out.printf("result= %.2f%n",Math.log(num));
					break;	
				
				}
				
				if(num==0) {
					//continue Loop1;\
					break;
				}
				if(num==99) {
					break Loop1;
					
				}
	
			}
			
			
			
		}
		
		
		
	}

}

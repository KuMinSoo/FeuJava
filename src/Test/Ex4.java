package Test;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int input=0;
		for(;;) {
			System.out.println("���� ������ �Է��ϸ� ���丮��� ����մϴ�");
			try {
				input=new Scanner(System.in).nextInt();
				if(input<0){
					System.out.println("���� ������ �Է��ϼ���!!");
					continue;
				}
			}catch(Exception e) {
				System.out.println("���ڳ� Ư�� ���ڰ� �ƴ� ���� ������ �Է��ϼ���");
				continue;
			}
			
			int result=1;
			while(input>0) {
				result*=input;
				System.out.printf("%s",input!=1?input+" X ":input+ "= ");
				
				input--;
			}
			System.out.println(result);
	
			
			
			
		}
		
	}

}

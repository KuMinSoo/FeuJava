package IfWhileSwitch;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int input=0;
		int result=(int)(Math.random()*100)+1;
		
		
		
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���..");
			input=sc.nextInt();
			if(result<input) {
				System.out.println("�� ���� ������ �ٽ� �õ��غ�����");
			}else if(result>input) {
				System.out.println("�� ū������ �ٽ� �õ��غ�����");
			}else if(result==input) {
				System.out.println("�����Դϴ�");
				
			}
		}while(result!=input);
		
		
	}

}

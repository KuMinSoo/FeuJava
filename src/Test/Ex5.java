package Test;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int count=0;
		while(count++<10) {
			System.out.println("�Է¹��� ���ڸ� �Ųٷ� �մϴ�");
			Scanner sc=new Scanner(System.in);
			String input=sc.nextLine();
			
			StringBuilder sb=new StringBuilder(input.length());
			sb.append(input);
			sb.reverse();
			System.out.println(sb);
	
		}		
	}

}

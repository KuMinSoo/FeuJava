package Test;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int count=0;
		while(count++<10) {
			System.out.println("입력받은 문자를 거꾸로 합니다");
			Scanner sc=new Scanner(System.in);
			String input=sc.nextLine();
			
			StringBuilder sb=new StringBuilder(input.length());
			sb.append(input);
			sb.reverse();
			System.out.println(sb);
	
		}		
	}

}

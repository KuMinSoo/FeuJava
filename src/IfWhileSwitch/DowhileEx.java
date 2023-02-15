package IfWhileSwitch;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		int input=0;
		int result=(int)(Math.random()*100)+1;
		
		
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요..");
			input=sc.nextInt();
			if(result<input) {
				System.out.println("더 작은 값으로 다시 시도해보세요");
			}else if(result>input) {
				System.out.println("더 큰값으로 다시 시도해보세요");
			}else if(result==input) {
				System.out.println("정답입니다");
				
			}
		}while(result!=input);
		
		
	}

}

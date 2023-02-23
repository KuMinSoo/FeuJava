package Test;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int input=0;
		for(;;) {
			System.out.println("양의 정수를 입력하면 팩토리얼로 출력합니다");
			try {
				input=new Scanner(System.in).nextInt();
				if(input<0){
					System.out.println("양의 정수를 입력하세요!!");
					continue;
				}
			}catch(Exception e) {
				System.out.println("문자나 특수 문자가 아닌 양의 정수를 입력하세요");
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

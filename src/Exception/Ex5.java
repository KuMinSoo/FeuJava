package Exception;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int input=0;
		int count=0;
		
		do {
			count++;
			System.out.println("1과 100 사이의값을 입력하세요 :");
			try {
				input=new Scanner(System.in).nextInt();
			}catch(Exception e) {
				continue;
			}
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요");
			}else if(input<answer){
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("맞췃습니다");
				System.out.println("시도횟수는 "+count+"번 입니다");
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

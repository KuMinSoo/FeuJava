package Test;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		while(true) {
			System.out.println("양수의 정수값을 입력하세요");
			int input = new Scanner(System.in).nextInt();
			if(input<0) {
				System.out.println("양수의 정수값을 입력하세요");
				continue;
			}
			
			for(int i=2;i<input;i++) {
				boolean a=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						a=false;
						break;
					}
					a=true;
				}
				if(a)
				System.out.print(" "+i);
				
			}
			
			
			
			
			
		}
		
		
	}

}

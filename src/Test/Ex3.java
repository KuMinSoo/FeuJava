package Test;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//사용자로부터 입력받은 양의 정수 n에 대해, n의 팩토리얼을 계산하는 프로그램을 작성하시오.
		while(1==1) {
			int input=0;
			try {
				System.out.println("양의 정수를 입력하면 팩토리얼로 계산합니다 >> 입력하세요");
				input=new Scanner(System.in).nextInt();
				if(input<0) {
					System.out.println("음수가 아닌 양의 정수를 입력하세요");
					continue;
				}
			}catch(Exception e) {
				System.out.println("양의 정수를 입력하세요");
				continue;
			}
			int result=1;
			for(int i=input;i>0;i--) {
				result*=i;
				System.out.printf("%s",(i!=1)?i+" X ":i +"=");
			}
			System.out.println(result);
		}
		
	}

}

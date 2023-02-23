package Test;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("문자를 입력하면 거꾸로 출력합니다");
		String sc=new Scanner(System.in).next();
		
		for(int i=sc.length()-1;i>=0;i--) {
			System.out.print(sc.charAt(i));
		}

		
		
		
		
	}

}

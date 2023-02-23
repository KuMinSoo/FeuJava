package Test;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		System.out.println("문자를 입력하세요");
		
		String ad=new Scanner(System.in).next();
		
		int i=ad.length()-1;
		while(i>=0) {
			System.out.print(ad.charAt(i));
			i--;
		}
		
	}

}

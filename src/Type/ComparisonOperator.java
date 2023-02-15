package Type;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (1 == 1) {
			System.out.println("문자를 입력하세요 >>>> 입력 후 엔터를 누르세요");
			String input = sc.nextLine();
			char ch = input.charAt(0);

			if ('0' <= ch && ch <= '9')
				System.out.println("입력하신 값은 숫자입니다");

			if (('a' <= ch && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println("입력하신 값은 영문자 입니다");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

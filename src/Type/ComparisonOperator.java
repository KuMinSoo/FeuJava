package Type;

import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (1 == 1) {
			System.out.println("���ڸ� �Է��ϼ��� >>>> �Է� �� ���͸� ��������");
			String input = sc.nextLine();
			char ch = input.charAt(0);

			if ('0' <= ch && ch <= '9')
				System.out.println("�Է��Ͻ� ���� �����Դϴ�");

			if (('a' <= ch && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println("�Է��Ͻ� ���� ������ �Դϴ�");
		}
		
		
		
		
		
		
		
		
		
		
	}

}

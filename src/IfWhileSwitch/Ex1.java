package IfWhileSwitch;

public class Ex1 {

	public static void main(String[] args) {
		// 1��
		int x = 1;
		if (x > 10 && x < 20) {
		}

		// 2��
		char ch = ' ';
		if (!(ch == ' ' || ch == '\t')) {
		}

		// 3��
		if (ch == 'x' || ch == 'X') {
		}

		// 4��
		if ('0' <= ch && ch <= '9') {
		}

		// 5��
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
		}

		// 6��
		int year = 0;
		if ((year / 400 == 0) || (year / 4 == 0 && year / 100 != 0)) {
		}

		// 7��
		boolean powerOn = false;
		if (!powerOn) {
		}

		// 8��
		String str = "yes";
		if ("yes".equals(str)) {
		}

		System.out.println("=====2�� ����=====");
	

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
				System.out.printf("%d / �հ� %d%n", i, sum);
			}
		}
		System.out.println("2�Ǵ� 3�� ����� �ƴ� ����:" + sum);

		
		System.out.println();
		System.out.println("======3�� ����=====");
		sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum+=j;
			}
		}
		System.out.printf("���� %d%n", sum);
		
		
		sum=0;
		int totalSum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
		}
		System.out.printf("���� %d%n", totalSum);
		
		System.out.println("=====4�� ���� "
				+ "=====");
		int num=1,cnt=0;
		sum=0;
		
		while(true) {
			
			num=num%2!=0?num:-num;
			sum+=num;
			num=num>0?num:-num;
			num++;
			cnt++;
			if(sum>=100) break;
			
		}
		System.out.printf("%d��°���� ���� 100�̻�(����:%d)%n",cnt,sum);
		
		System.out.println("=====4-1��° ====");
		int s=1;
		num=0; 
		sum=0;
		abc: for(int i=1;;i++,s=-s) {
			num=s*i;
			sum+=num;
			if(sum>=100) break abc;
			
		}
		System.out.printf("%d��°���� ���� 100�̻�(����:%d)%n",Math.abs(num),sum);
	}
	
}

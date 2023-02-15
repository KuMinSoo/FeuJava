package IfWhileSwitch;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {

		System.out.print("숫자를 입력하세요(예:12345)>>");
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		int num=Integer.parseInt(input);
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			
			System.out.printf("sum = %d  num=%s%n",sum,num);
			num/=10;
		}
		

	}

}

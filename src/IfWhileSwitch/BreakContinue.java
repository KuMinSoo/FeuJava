package IfWhileSwitch;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		int meun;
		int num;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("(1)square");
			System.out.println("(2)square root");
			System.out.println("(3)log");
			System.out.println("원하는 메뉴 (1-3)를 선택하세요. (종료:0) >");
			int input=sc.nextInt();
			
			if(1<=input && input <=3) {
				System.out.printf("선택하신 메뉴는 %d입니다%n",input);
				continue;
			}else if(0==input) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			
		}
		
		
		
		
	}

}	

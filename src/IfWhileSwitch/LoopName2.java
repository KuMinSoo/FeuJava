package IfWhileSwitch;

import java.util.Scanner;

public class LoopName2 {

	public static void main(String[] args) {
		Loop1: for(;;) {
			
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하시는 메뉴(1-3)을 선택하세요(종료:0)");
			Scanner sc=new Scanner(System.in);
			int method=sc.nextInt();
			if(method==0) {
				System.out.println("프로그램 종료합니다."); break;
			}
		
			if(!(method>=1 && method<=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
			}
			
			for(;;) {
				System.out.println("계산할 갑을 입력하세요(계산 종료:0, 전체종료:99)");
				int num=sc.nextInt();
				
				
				/* if문으로 작성
				 * if(method==1) { System.out.printf("result= %d%n",num*num); }else
				 * if(method==2) { System.out.printf("result= %f%n",Math.sqrt(num)); }else
				 * if(method==3) { System.out.printf("result= %.2f%n",Math.log(num)); }
				 */
				
				//switch로 작성
				switch(num) {
				case 1:
					System.out.printf("result= %d%n",num*num); 
					break;
				case 2:
					System.out.printf("result= %f%n",Math.sqrt(num));
					break;
				case 3:
					System.out.printf("result= %.2f%n",Math.log(num));
					break;	
				
				}
				
				if(num==0) {
					//continue Loop1;\
					break;
				}
				if(num==99) {
					break Loop1;
					
				}
	
			}
			
			
			
		}
		
		
		
	}

}

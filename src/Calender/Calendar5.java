package Calender;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calendar5 {

	public static void main(String args[]) throws Exception {
		
		
		final String yoil[]= {"","SU","MO","TU","WE","TH","FR","SA"};
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		Calendar cal=Calendar.getInstance();
		
		try {
			while(true) {
				
				
				if(cnt==4) System.out.println("마지막 기회입니다");
				if(cnt>4) {
					System.out.println("끝났습니다..");
					break;
				}
				System.out.println((5-cnt)+"번의 기회가 있습니다.");
				cnt++;

				System.out.println("년도를 입력하세요.");
				int year = sc.nextInt();
					if(0<year) {
						if(year<=9999) {
							cal.set(Calendar.YEAR, year);
						}else {
							System.out.println("0~9999 사이의 값을 입력하세요.");
							continue;
						}
					}
				System.out.println("달을 입력하세요");
				int month=sc.nextInt();
					if(0<month) {
						if(month<13){
							cal.set(Calendar.MONTH, month);
						}else {
							System.out.println("1-12사이의 수를 입력하세요/다시 처음으로 돌아값니다.");
							continue;
						}
					}
				System.out.println("     "+toString(cal));
				for(int i=1;i<yoil.length;i++) {
					System.out.print(yoil[i]+" ");				
				}
				System.out.println();
				cal.set(year,month-1 ,1);
				int num=1;
				int start=cal.get(Calendar.DAY_OF_WEEK);
				
				for(int i=1;i<cal.getActualMaximum(Calendar.DATE)+start;i++) {
					if(i<start) System.out.print("   ");
					if(i>=start) {
						System.out.print((num<10?num+"  ":num+" "));num++;
						if(i%7==0) System.out.println();
					}
					
				}
				System.out.println();

			}
		} catch (InputMismatchException e) {
			System.out.println("정수값을 입력하세요");
			
		}
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH))+"월";
	}
}

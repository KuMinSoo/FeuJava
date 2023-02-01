package Calender;

import java.util.Calendar;

public class Calendar2 {
	
	
	public static void main(String []args) {
		final String[]Yoil= {"","일","월","화","수","목","금","토","일"};
		
		Calendar date1=Calendar.getInstance();
		Calendar date2=Calendar.getInstance();
		
		date1.set(2019, 3, 29);
		long difference=(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		long dday=difference/60/60/24;
		
		
		System.out.println("date1은 "+toString(date1)+Yoil[date1.DAY_OF_WEEK]+"요일 입니다.");
		System.out.println("date2는 "+toString(date2)+Yoil[date2.DAY_OF_WEEK]+"요일 입니다.");
		
		System.out.println("그 날(date1)부터 지금(date2)까지 "+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "+dday+"입니다.");
		
		
	}
	
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DATE)+"일 ";
	}
	
	
	
}

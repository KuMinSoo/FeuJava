package Calender;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar day=Calendar.getInstance();

		System.out.println("이 해의 년도: "+day.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): "+day.get(Calendar.MONTH));
		System.out.println("이 해의 몇째 주 : "+day.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 일: "+day.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 달의 몇 일: "+day.get(Calendar.DATE));
		System.out.println("이 해의 몇 일: "+day.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): "+day.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일: "+ day.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): "+day.get(Calendar.AM_PM));
		System.out.println("시간(0~11)"+day.get(Calendar.HOUR));
		System.out.println("시간(0~23): "+day.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): "+day.get(Calendar.MINUTE));
		System.out.println("초(0~59): "+day.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): "+day.get(Calendar.MILLISECOND));
		System.out.println("이 달의 마지막 날: "+day.getActualMaximum(Calendar.DATE));
		
		
	}

}

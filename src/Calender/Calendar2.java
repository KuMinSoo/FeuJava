package Calender;

import java.util.Calendar;

public class Calendar2 {
	
	
	public static void main(String []args) {
		final String[]Yoil= {"","��","��","ȭ","��","��","��","��","��"};
		
		Calendar date1=Calendar.getInstance();
		Calendar date2=Calendar.getInstance();
		
		date1.set(2019, 3, 29);
		long difference=(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		long dday=difference/60/60/24;
		
		
		System.out.println("date1�� "+toString(date1)+Yoil[date1.DAY_OF_WEEK]+"���� �Դϴ�.");
		System.out.println("date2�� "+toString(date2)+Yoil[date2.DAY_OF_WEEK]+"���� �Դϴ�.");
		
		System.out.println("�� ��(date1)���� ����(date2)���� "+difference+"�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� "+dday+"�Դϴ�.");
		
		
	}
	
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DATE)+"�� ";
	}
	
	
	
}

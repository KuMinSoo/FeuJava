package Calender;

import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar day=Calendar.getInstance();

		System.out.println("�� ���� �⵵: "+day.get(Calendar.YEAR));
		System.out.println("��(0~11, 0:1��): "+day.get(Calendar.MONTH));
		System.out.println("�� ���� ��° �� : "+day.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ��: "+day.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� ��: "+day.get(Calendar.DATE));
		System.out.println("�� ���� �� ��: "+day.get(Calendar.DAY_OF_YEAR));
		System.out.println("����(1~7, 1:�Ͽ���): "+day.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ����: "+ day.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����(0:����, 1:����): "+day.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11)"+day.get(Calendar.HOUR));
		System.out.println("�ð�(0~23): "+day.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59): "+day.get(Calendar.MINUTE));
		System.out.println("��(0~59): "+day.get(Calendar.SECOND));
		System.out.println("1000���� 1��(0~999): "+day.get(Calendar.MILLISECOND));
		System.out.println("�� ���� ������ ��: "+day.getActualMaximum(Calendar.DATE));
		
		
	}

}

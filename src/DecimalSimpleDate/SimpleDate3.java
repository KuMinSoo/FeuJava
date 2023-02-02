package DecimalSimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SimpleDate3 {

	public static void main(String[] args) {
		String pattern="yyyy/MM/dd";
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		
		
		
		System.out.println("��¥�� "+pattern+"���·� �Է��ϼ���.(����: 2023/03/03)");
		Date day=null;
		
		while(sc.hasNextLine()) {
			try {
				day=sdf.parse(sc.nextLine());
				break;
			
			
			} catch (ParseException e) {
				System.out.println("��¥�� "+pattern+"���·� �ٽ�!!!! �Է��ϼ���.(����: 2023/03/03)");
				
			}
		}
		
		Calendar cal1=Calendar.getInstance();
		cal1.getTimeInMillis();
		
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(day);
		cal2.getTimeInMillis();
		
		long hour=(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60;
		System.out.println("���ð� �Է��� ��¥�� �ð� ���̴�" + hour + "�ð����� ���̳��ϴ�.");
		
		
		

	}

}

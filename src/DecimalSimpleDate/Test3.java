package DecimalSimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pattern="yyyy/MM/dd";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		
		Calendar cal=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();
		
		do{
			
			System.out.println("��������� "+pattern+"�� �����ϰ� �Է��ϼ���");
			try {
				Date birth=sdf.parse(sc.nextLine());
				cal2.setTime(birth);
				long difference= (cal.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60;
				System.out.println("�¾�� ��������� ���� �� "+difference+"days");
				
				break;
				
			} catch (ParseException e) {
		
			} 
						
		}while(true);
		
	}

}

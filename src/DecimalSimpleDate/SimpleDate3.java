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
		
		
		
		System.out.println("날짜를 "+pattern+"형태로 입력하세요.(예시: 2023/03/03)");
		Date day=null;
		
		while(sc.hasNextLine()) {
			try {
				day=sdf.parse(sc.nextLine());
				break;
			
			
			} catch (ParseException e) {
				System.out.println("날짜를 "+pattern+"형태로 다시!!!! 입력하세요.(예시: 2023/03/03)");
				
			}
		}
		
		Calendar cal1=Calendar.getInstance();
		cal1.getTimeInMillis();
		
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(day);
		cal2.getTimeInMillis();
		
		long hour=(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60;
		System.out.println("오늘과 입력한 날짜의 시간 차이는" + hour + "시간정도 차이납니다.");
		
		
		

	}

}

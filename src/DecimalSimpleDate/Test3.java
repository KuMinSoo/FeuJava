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
			
			System.out.println("생년월일을 "+pattern+"과 동일하게 입력하세요");
			try {
				Date birth=sdf.parse(sc.nextLine());
				cal2.setTime(birth);
				long difference= (cal.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60;
				System.out.println("태어나서 현재까지의 날은 총 "+difference+"days");
				
				break;
				
			} catch (ParseException e) {
		
			} 
						
		}while(true);
		
	}

}

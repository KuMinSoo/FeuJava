package DecimalSimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		
		Calendar cal=Calendar.getInstance();

		String pattern="yyyy-MM-dd";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
		cal.set(Calendar.YEAR,2020);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DATE, 1);
		
		
		
		for(int i=0;i<12;i++) {
	

			//Date d=new Date(cal.getTimeInMillis());
			int minus=cal.get(Calendar.DAY_OF_WEEK);
			int weekday=(minus==1)?8:16-minus;
			cal.set(Calendar.DATE, weekday);
			
			
			Date d=cal.getTime();
			System.out.println(sdf.format(d)); 
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DATE, 1);
				
		}
		
		
	}

}

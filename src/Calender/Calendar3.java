package Calender;

import java.util.Calendar;

public class Calendar3 {

	public static void main(String[] args) {
		final int Time_unit[]= {3600,60,1};
		final String TimeName[]= {"시","분","초"};
		
		
		Calendar time1=Calendar.getInstance();
		Calendar time2=Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY,10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		Calendar3 cal=new Calendar3();
		
		long difference=(time2.getTimeInMillis()-time1.getTimeInMillis())/1000;
		long hour=difference/60/60;

		System.out.println("time1 : "+cal.toString(time1));
		System.out.println("time2 : "+cal.toString(time2));
		System.out.println("time1과 time2의 차이는 "+difference+"초 입니다.");
		int cnt=0;
		String tmp="";
		try {
			for(int i=0;i<Time_unit.length;i++) {
				tmp+=difference/Time_unit[i]+TimeName[i]+" ";
				difference%=Time_unit[i];
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("시분초로 변환하면 "+tmp+" 입니다");

	}
	
	public String toString(Calendar time) {
		
		return time.get(Calendar.HOUR_OF_DAY)+"시간 "+time.get(Calendar.MINUTE)+"분 "+time.get(Calendar.SECOND)+"초";
	}

}

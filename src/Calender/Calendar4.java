package Calender;

import java.util.Calendar;

public class Calendar4 {

	public static void main(String[] args) {
		
	Calendar date=Calendar.getInstance();
	
	date.set(2019, 7, 31);
	
	Calendar4 cal=new Calendar4();
	System.out.println(cal.toString(date));
	System.out.println("= 1�� �� =");
	date.add(Calendar.DATE, 1);
	System.out.println(cal.toString(date));
	System.out.println("= 6���� =");
	date.add(Calendar.MONTH, -6);	
	System.out.println(cal.toString(date));
	
	System.out.println("= roll 31�� �� =");
	date.roll(Calendar.DATE, 31);
	System.out.println(cal.toString(date));
	
	System.out.println("= add 31�� �� =");
	date.add(Calendar.DATE,31);
	System.out.println(cal.toString(date));
		
		
	}
	
	public String toString(Calendar date) {
		
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+date.get(Calendar.DAY_OF_MONTH)+"�� ";
	}

}

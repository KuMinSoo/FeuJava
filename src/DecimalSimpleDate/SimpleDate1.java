package DecimalSimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate1 {

	public static void main(String[] args) {
		Date day=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(day));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("''yy�� MMM dd�� E����");
		System.out.println(sdf2.format(day));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(day));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(day));
	
		SimpleDateFormat sdf5=new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		System.out.println(sdf5.format(day));
		
		SimpleDateFormat sdf6=new SimpleDateFormat("������ �� ���� d��° ���Դϴ�");
		System.out.println(sdf6.format(day));
		
		SimpleDateFormat sdf7=new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		System.out.println(sdf7.format(day));
	
		SimpleDateFormat sdf8=new SimpleDateFormat("������ �̴��� W���� ���Դϴ�.");
		System.out.println(sdf8.format(day));
		
		SimpleDateFormat sdf9=new SimpleDateFormat("������ �̴��� F��° E�����Դϴ�.");
		System.out.println(sdf9.format(day));
	}

}

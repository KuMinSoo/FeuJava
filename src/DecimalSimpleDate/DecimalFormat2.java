package DecimalSimpleDate;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat2 {

	public static void main(String[] args) {
		DecimalFormat df1=new DecimalFormat("#,###.##");
		DecimalFormat df2=new DecimalFormat("#.###E0");
		Number num = null;
		try {
			num = df1.parse("1,234,567.89");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double num2=num.doubleValue();
		System.out.println(num);
		System.out.println(num2);
		System.out.print("1,234,567.89 - >");
		System.out.print(num2+"->");
		System.out.println(df2.format(num2));
		
		
		
	}

}

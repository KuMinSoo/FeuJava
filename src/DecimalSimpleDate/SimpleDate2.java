package DecimalSimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate2 {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");

		Date day=sdf1.parse("2022�� 1�� 30��");
		System.out.println(sdf2.format(day));
		
		
	}

}

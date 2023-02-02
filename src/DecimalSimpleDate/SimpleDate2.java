package DecimalSimpleDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate2 {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd");

		Date day=sdf1.parse("2022년 1월 30일");
		System.out.println(sdf2.format(day));
		
		
	}

}

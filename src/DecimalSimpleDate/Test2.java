package DecimalSimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf1=new SimpleDateFormat("�Է��ϴ� ��¥�� E�����Դϴ�.");
		System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
		while(sc.hasNextLine()) {
			
			
			try {
				Date a=sdf.parse(sc.nextLine());
				System.out.println(sdf1.format(a));
				break;
			} catch (ParseException e) {
				System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
			}
		
		}
		
		
		
	}

}

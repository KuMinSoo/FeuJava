package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		HashMap map=new HashMap();
		map.put("asdf", "1234");
		map.put("qwe", "2222");
		map.put("zxc", "3333");
		
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���");
			System.out.println("id: ");
			String id=sc.nextLine().trim();
			System.out.println("passwd: ");
			String pwd=sc.nextLine();
			
			if(!map.containsKey(id)) {
				System.out.println("id�� ��ġ���� �ʽ��ϴ�.");
				continue;
			}
			
			if(map.get(id).equals(pwd)) {
				System.out.println("�α��� �����߽��ϴ�. "+id+"�� ȯ���մϴ�.");
				break;
			}else {
				System.out.println(id+"�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				continue;
			}
			
			
		}
		
		
	}

}

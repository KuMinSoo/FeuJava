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
			System.out.println("id와 password를 입력하세요");
			System.out.println("id: ");
			String id=sc.nextLine().trim();
			System.out.println("passwd: ");
			String pwd=sc.nextLine();
			
			if(!map.containsKey(id)) {
				System.out.println("id가 일치하지 않습니다.");
				continue;
			}
			
			if(map.get(id).equals(pwd)) {
				System.out.println("로그인 성공했습니다. "+id+"님 환영합니다.");
				break;
			}else {
				System.out.println(id+"님 비밀번호가 일치하지 않습니다.");
				continue;
			}
			
			
		}
		
		
	}

}

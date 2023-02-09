package Lamda;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
	
		Optional<String> opt=Optional.empty();
		System.out.println("opt="+opt);
		Optional<String> opt1=Optional.ofNullable(null);
		System.out.println("opt1="+opt1);
		String str="";
		
		str=opt1.orElse("EMPTY 입니다");
		System.out.println("str="+str);  
		str=opt1.orElseGet(()->"Supplier 이용한 empty입니다.");
		System.out.println("str="+str);
		
		try {
			str=opt1.orElseThrow(IllegalAccessException::new);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("str="+str);
	}

}

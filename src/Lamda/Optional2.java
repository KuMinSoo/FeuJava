package Lamda;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		//Optional<T> 객체의 값가져오기
		Optional<String>optVal=Optional.of("abc");
		String str1=optVal.get();//값꺼내기 만약 값이 null이면 NullpointException발생
		String str2=optVal.orElse("ss");//갑꺼내기 or 값이 null이면 ""반환
		String str3=optVal.orElseGet(String::new);
		String str4=optVal.orElseGet(() -> new String());
		String str5=optVal.orElseThrow(NullPointerException::new);
		String str6=optVal.orElseThrow(() -> new NullPointerException());
		
		//isPresent()-Optional객체의 값이 null이면 false, 아니면 true
		String str="aa";
		if(Optional.ofNullable(str).isPresent()) {
			System.out.println("해당 값은 null이 아닙니다");
		}
		//ifPresent(Consumer)- 널이 아닐때만 작업 수행, 널이면 수행X
		Optional.ofNullable(1).ifPresent((t)->System.out.println(t));
		Optional.ofNullable("aa").ifPresent(System.out::println);
	}

}

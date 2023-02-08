package Lamda;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		
		
		String str="abc";
		Optional<String> optval=Optional.of(str);
		System.out.println("optval: "+optval.get()); 
		Optional<String> optval1=Optional.of("abc");
		System.out.println("optval1: "+optval1.get());
		//Optional<String> optval2=Optional.of(null); 
		Optional<String> optval3=Optional.ofNullable(null);
		//System.out.println("optval3: "+optval3.get());
		
		//null 대신 빈 Optional<T>객체를 사용하기
		Optional<String> optval4=null;//널로 초기화 바람직하지 않음
		Optional<String> optval5=Optional.<String>empty();
		System.out.println("optval5: "+optval5.get());
		
	}

}

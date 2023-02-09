package Lamda;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx {

	public static void main(String[] args) {
		Optional<String> optStr=Optional.of("abcde");
		System.out.println("optStr="+optStr.get());
		
		Optional<Integer> optInt=optStr.map(String::length);
		System.out.println("optInt: "+optInt.get());
		
		int result1=Optional.of("123")
					.filter(x->x.length()>0)
					.map(x->x.length()).get();
		
		System.out.println("result1: "+result1);
		
		int result2=Optional.of("")
					.filter(x->x.length()>0)
					.map(Integer::parseInt).orElse(-1);
		System.out.println("result2: "+result2);
		
		OptionalInt optInt1=OptionalInt.of(1);
		OptionalInt optInt2=OptionalInt.empty();
		System.out.println("optInt1: "+optInt1);
		System.out.println("optInt2: "+optInt2);
		
		Optional.of("456").map((x)->Integer.parseInt(x))
							.ifPresent(x->System.out.printf("result3=%d%n", x));
		
		System.out.println(optInt1.isPresent());
		System.out.println(optInt2.isPresent());
		System.out.println("optInt1.equals(optInt2)? "+optInt1.equals(optInt2));
	}

}

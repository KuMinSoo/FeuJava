package Lamda;

import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		Predicate<Integer> p=(i) -> i<100;
		Predicate<Integer> q=i -> i<200;
		Predicate<Integer> r=(Integer i)->{return i%2==0;};
		Predicate<Integer> notP=p.negate();
		
		Predicate<Integer> all=notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1="abc";
		String str2="abc";
		
		Predicate<String> p2=Predicate.isEqual(str1);
		boolean result=p2.test(str2);
		System.out.println(result);
				
		
	}

}

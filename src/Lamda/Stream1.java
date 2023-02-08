package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream=list.stream();
		
		intStream.forEach(System.out::print);
		
		
		intStream=list.stream();
		intStream.forEach(System.out::print);
		
		System.out.println();
		Stream<String> strStream=Stream.of("a","b","c");
		strStream.forEach(System.out::print);
		System.out.println();
		
		Stream<String> strStream2=Stream.of(new String("a"),new String("b"),new String("c"));
		strStream2.forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> strStream3=Arrays.stream(new String[] {"A","B","C"});
		strStream3.forEach(System.out::print);
		System.out.println();
		Stream<String> strStream4=Arrays.stream(new String[] {"A","B","C"},0,2);
		strStream4.forEach(System.out::print);
		
		//Stream
		Integer[] inta= {1,2,3,4,5};
		Stream<Integer> aa=Arrays.stream(inta);
		System.out.println("aa count="+aa.count());
		//IntStream
		int[] intArr= {1,2,3,4,5};
		IntStream st=IntStream.of(intArr);
		//st.forEach(System.out::print);System.out.println();//최종연산
		System.out.println("count="+st.count());//최종연산
		st=IntStream.of(intArr);
		System.out.println("sum="+st.sum());
		st=IntStream.of(intArr);
		System.out.println("average="+st.average());
		
	
	}

}

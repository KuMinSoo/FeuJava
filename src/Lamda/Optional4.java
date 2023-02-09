package Lamda;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Optional4 {

	public static void main(String[] args) {
		//forEach(), forEachOrdered()
		IntStream.range(1, 10).sequential().forEach(System.out::print);
		IntStream.range(1, 10).forEachOrdered(System.out::print);
		System.out.println();
		IntStream.range(1, 10).parallel().forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 10).parallel().forEachOrdered(System.out::print);
		
		System.out.println("====================================");
		String[]strArr= {
				"Ingeritance","Java","Lamda","stream","OptionalDouble","IntStream",
				"count","sum"
		};
		//병렬처리로 했을때는 순서와 상관없이 보여줘서 속도는 빠름...
		//만약 병렬처리하고 순서있게 보여주고 싶으면 forEachOrdered()사용하면됨...
		//기본적으로 병렬처리가 없으면 sequential() 처리가 되며, 순서있게 보여준다.
		Stream.of(strArr).parallel().forEach(System.out::println);
		//Stream.of(strArr).sequential().forEach(System.out::println);
		//Stream.of(strArr).parallel().forEachOrdered(System.out::println);
		
		boolean noEmptyStr=Stream.of(strArr).noneMatch(s->s.length()==3);
		System.out.println("noEmptyStr: "+noEmptyStr);
		Optional<String> sWord=Stream.of(strArr).parallel().filter(s->s.charAt(0)=='s').findAny();
		System.out.println("sWord:"+sWord.get());
		
		Stream<Integer> intStream1=Stream.of(strArr).map(String::length);
		Stream<Integer> intStream2=Arrays.stream(strArr).map(String::length);
	
		IntStream intStream3=Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4=Stream.of(strArr).mapToInt((s)->s.length());
		IntStream intStream5=Stream.of(strArr).mapToInt(s->{return s.length();});
		IntStream intStream6=Arrays.stream(strArr).mapToInt(String::length);
		
		int count=intStream1.reduce(0, (a,b)->(a+1));
		System.out.println("count= "+count);
		int sum=intStream2.reduce(0, (a,b)->a+b);
		System.out.println("sum= "+sum);
		OptionalInt max=IntStream.empty().reduce(Integer::max);
		System.out.println("max= "+max.orElseGet(()->0));
		OptionalInt min=intStream4.reduce((a,b)->a>b?b:a);
		System.out.println("min= "+min.getAsInt());
		
		
		
		
		
		
		
		
		
	}

}

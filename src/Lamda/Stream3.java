package Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream3 {

	public static void main(String[] args) { 
		//스트림 자르기 skip()/limit()
		IntStream intStream=IntStream.rangeClosed(1, 10);
		intStream.skip(3).limit(5).forEach(System.out::print);System.out.println();
		
		//distinct()
		intStream=IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream.distinct().forEach(System.out::print);System.out.println();
		intStream=IntStream.of(new int[] {1,2,2,3,3,3,4,5,5,6});
		intStream.distinct().forEach(System.out::print);System.out.println();
		intStream=Arrays.stream(new int[] {1,2,2,3,3,3,4,5,5,6});
		intStream.distinct().forEach(System.out::print);System.out.println();
		intStream=Arrays.stream(new int[] {1,2,2,3,3,3,4,5,5,6},0,10);
		intStream.distinct().forEach(System.out::print);System.out.println();
		
		//filter()
		intStream=IntStream.range(1, 11);
		intStream.forEach(System.out::print); System.out.println();
		intStream=IntStream.range(1, 11);
		intStream.filter((i)->i%2==0).forEach(System.out::print);System.out.println();
		
		//filter() 조건 2개
		intStream=IntStream.rangeClosed(1, 100);
		intStream.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);System.out.println();
		intStream=IntStream.rangeClosed(1, 100);
		intStream.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
		
		System.out.println();
		//sort()
		System.out.println("sort()==========");
		Stream<String> strStream=Stream.of("aaa","bb","cc","CC","dd");
		strStream.sorted().forEach(System.out::print);System.out.println("//");
		String []strArr= {"aaa","bb","cc","CC","dd"};
		strStream=Stream.of(strArr);
		strStream.sorted(Comparator.naturalOrder()).forEach(System.out::print);System.out.println();
		strStream=Arrays.stream(strArr);
		strStream.sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::print);System.out.println();
		strStream=Arrays.stream(strArr,0,5);
		//strStream.sorted(String::CompareTo);
		
		//역순 reverse(),<T>naturalOrder().reversed()
		strStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);System.out.println();
		strStream=Stream.of(new String[] {"aaa","bb","cc","CC","dd"});
		strStream.sorted(Comparator.<String>naturalOrder().reversed()).forEach(System.out::print);System.out.println();
		
		//대소문자 구문 X
		strStream=Arrays.stream(strArr);
		strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);System.out.println();
		
		//대소문자 구문 X , 역순 정렬
		strStream=Stream.of("aaa","bb","cc","CC","dd");
		strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(System.out::print);System.out.println();
		
		//길이 순 정렬
		strStream=Stream.of(new String[] {"aaa","bb","cc","CC","dd"});
		strStream.sorted(Comparator.comparing(String::length)).forEach(System.out::print);System.out.println();
		strStream=Stream.of(new String[] {"aaa","bb","cc","CC","dd"});
		strStream.sorted(Comparator.comparingInt(String::length)).forEach(System.out::print);System.out.println();
	
		//길이 순 정렬, 역순 정렬
		strStream=Stream.of(strArr);
		strStream.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::print);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

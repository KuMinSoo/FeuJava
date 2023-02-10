package Lamda;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
	
	public static void main(String[] args) {
		String[] strArr= {"aaa","bb","c","dddd"};
		
		Stream<String> bb=Stream.of(strArr);
		int cc=bb.mapToInt(s->s.length()).sum();
		System.out.println("sum="+cc);
		cc=Stream.of(strArr).mapToInt(s->{return s.length();}).sum();
		System.out.println("sum="+cc);
		
		bb=Stream.of(strArr);
		Stream<Integer> ww=bb.map(a->a.length());
		int qq=ww.reduce(0,(a,b)->a+b);
		System.out.println("sum="+qq);
		
		bb=Stream.of(strArr);
		IntStream qwe=bb.mapToInt(s->s.length());
		int result=qwe.sum();
			
		int qqq=(int)Math.random()*45+1;
		IntStream qwe2=new Random().ints(5,1,45);
		qwe2.forEach(System.out::println);
		
		System.out.println("===========");
		new Random().ints(1,45).limit(5).forEach(System.out::println);
		
		
	}

}

package Lamda;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		//스트림 만들기(임의의 수)
		IntStream intStream=new Random().ints();
		
		intStream.limit(5).forEach(System.out::println);
		intStream=new Random().ints(5,10,14).limit(5);
		intStream.forEach(System.out::println);
		
		System.out.println("int(4)=========");
		IntStream intStream2=new Random().ints(4);
		intStream2.forEach(System.out::println);

		System.out.println("limit(4)=========");
		intStream2=new Random().ints();
		intStream2.limit(4).forEach(System.out::println);

		System.out.println("int(4,10)/// limit(5)=========");
		intStream2=new Random().ints(4,10);
		intStream2.limit(5).forEach(System.out::println);
	
		System.out.println("int(5,4,10)=========");
		intStream2=new Random().ints(5,4,10);
		intStream2.forEach(System.out::println);

		
		
		//특정 범위의 정수를 요소로 갖는 스트림 생성하기
		IntStream intStream3=IntStream.range(1, 5);
		intStream3.forEach(System.out::print);
		System.out.println();
		intStream3=IntStream.rangeClosed(1, 5);
		intStream3.forEach(System.out::print);
		
		//람다식 소스 만들기(iterate(),generate())
		//람다식 소스로 하는 스트림 생성하기
		System.out.println("람다소스 만들기1");
		Stream<Double> randomStream=Stream.generate(Math::random);
		randomStream.limit(4).forEach(System.out::println);
		System.out.println("람다소스 만들기2");
		Stream<Integer> oneStream=Stream.generate(()->1);
		oneStream.limit(4).forEach(System.out::println);
		System.out.println("람다소스 만들기3");
		Stream<Integer> evenStream=Stream.iterate(0, n->n+1);
		evenStream.limit(10).forEach(System.out::print);
	
		System.out.println();
		//빈 스트림
		Stream emptyStream=Stream.empty();
		long count=emptyStream.count();
		System.out.println("count= "+count);
	
	}

}

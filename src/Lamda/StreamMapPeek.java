package Lamda;

import java.io.File;
import java.util.stream.Stream;

public class StreamMapPeek {

	public static void main(String[] args) {
	
	//Map()사용해서 Stream<File>->Stream<String> 변환하기
	//Map()여러번 사용가능하다... peek 반복문이며 중간연산자이다.
	//peek는 반복문을 통해 잘 값이 나오는지 중간에 확인하는 방법이다.
		File[] FileArr={
		new File("Ex1.java"),
		new File("Ex2.bak"),
		new File("Ex3.java"),
		new File("Ex4"),
		new File("Ex5.txt")
	};
	
	Stream<File> fileStream=Stream.of(FileArr);
	fileStream.forEach(System.out::println);
	
	fileStream=Stream.of(FileArr);
	fileStream.map(File::getName)
		.filter(s->s.indexOf('.')!=-1)
		.peek(s->System.out.printf("filename=%s%n",s))
		.map(s->s.substring(s.indexOf('.')+1))
		.peek(s->System.out.printf("extension=%s%n",s))
		.map(s->s.toUpperCase()).distinct()
		.forEach(System.out::println);
	}

}

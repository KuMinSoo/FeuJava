package Lamda;

import java.io.File;
import java.util.stream.Stream;

public class StreamMapPeek {

	public static void main(String[] args) {
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

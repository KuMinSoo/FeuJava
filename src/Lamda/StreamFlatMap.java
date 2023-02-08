package Lamda;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamFlatMap {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm=Stream.of(
				new String[]{"abc","def","jkl"},
				new String[]{"ABC","DEF","JKL"}
				);

		//Stream<Stream<String>> strStrmStrm=strArrStrm.map(s->Arrays.stream(s));
		Stream<String> strStrm=strArrStrm.flatMap((s)->Arrays.stream(s));

		
		strStrm.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		String[]lineArr= {
				"Believe or not It is true",
				"Do or do not There is no try"
		};
		
		Stream<String>lineStream=Arrays.stream(lineArr);
		lineStream.flatMap(line->Arrays.stream(line.split(" +")))
		 		.map((s)->s.toLowerCase())
		 		.distinct()
		 		.sorted()
		 		.forEach(System.out::println);
		
		
	}

}

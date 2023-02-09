package Lamda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectCollectors {

	public static void main(String[] args) {
//1. ��Ʈ�� �÷������� �ٲٴ� ���collect(Collectors.toList ��) 
//2. ��Ʈ�� �迭�� �ٲٱ� stuStream.toArray(Student::new) /(s->new Student[s]) /stuStream.toArray()�� Object�� ����
		Student11 strArr[]= {
				new Student11("���ڹ�",1),
				new Student11("���ڹ�",2),
				new Student11("���ڹ�",3),
				new Student11("���ڹ�",4)
				
		};
		//��Ʈ���� �÷������� ��ȯ- .collect(Collectors.toList() / toSet(), toMap(), to Collection
		
		Stream<Student11> strStream=Stream.of(strArr);
		Stream<Student11> strStream1=Arrays.stream(strArr);
		Stream<Student11> strStream2=Stream.of(strArr);
		Stream<Student11> studentStream=Stream.of(strArr);
		
		//toList();
		List<String> name=strStream.map(Student11::getName).collect(Collectors.toList());
		System.out.println(name);
		
		//toSet();
		Set<String> name1=strStream1.map((s)->s.getName()).collect(Collectors.toSet());
		name1.forEach(System.out::print); System.out.println();
		Iterator<String> it=name1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+"");
		}
		
		//toMap()
		Map<String, Student11> map1=strStream2.collect(Collectors.toMap(p->p.getName(),p->p));
	
		Set<String> key=map1.keySet();
		System.out.println("============");
		key.stream().forEach(System.out::println);
		Iterator<String> itt=key.iterator();
		
		while(itt.hasNext()) {
			String key1=(String)itt.next();
			map1.get(key1);
			System.out.println("key: "+itt.next()+"  value:"+map1.get(key1));
		}
		
		//ArrayList<String> list=name.stream().collect(Collectors.toCollection(()->new ArrayList<>()));
		
		
		//��Ʈ���� �迭�� ��ȯ------------toArrays()
		Object[] stuNames=studentStream.toArray();
		System.out.println(Arrays.toString(stuNames));
		studentStream=Stream.of(strArr);
		//Student11[] stuNames1=studentStream.toArray(Student11[]::new);
		Student11[] stuNames1=studentStream.toArray((a)->new Student11[a]);
		System.out.println(Arrays.toString(stuNames1));
		studentStream=Stream.of(strArr);
		Student11[] stuNames2=(Student11[])studentStream.toArray();
		System.out.println(Arrays.toString(stuNames2)); 
	}

}
class Student11{
	String name;
	int ban;
	
	Student11(String name, int ban){
		this.name=name;
		this.ban=ban;
	}
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "["+name+"/"+ban+"]";
	}
	
	
}
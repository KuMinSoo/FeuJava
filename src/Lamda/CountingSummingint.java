package Lamda;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.partitioningBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student2{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student2(String name, boolean isMale, int hak, int ban, int score){
		this.name=name;
		this.isMale=isMale;
		this.hak=hak;
		this.ban=ban;
		this.score=score;
	}
	
	String getName() {return this.name;}
	boolean isMale() {return this.isMale;}
	int getHak() {return this.hak;}
	int getBan() {return this.ban;}
	int getScore() {return this.score;}
	
	public String toString() {
		return String.format("[%s,%s, %d�г� %d�� %3d��]", 
						 	name, isMale?"��":"��",hak,ban,score);
	}
	
	enum Level{HIGH,MID,LOW}

}



public class CountingSummingint {

	public static void main(String[] args) {
		Student2[] stuArr= {
				new Student2("���ڹ�",true,1,1,300),
				new Student2("���ڹ�",true,1,1,250),
				new Student2("���ڹ�",true,1,1,200),
				new Student2("���ڹ�",false,1,2,100),
				new Student2("���ڹ�",true,1,2,30),
				new Student2("���ڹ�",true,1,2,50),
				new Student2("���ڹ�",false,1,3,600),
				new Student2("���ڹ�",true,1,3,70),
				new Student2("���ڹ�",false,1,3,500),
				new Student2("���ڹ�",false,2,1,200),
				new Student2("���ڹ�",true,2,1,100),
				new Student2("Ÿ�ڹ�",false,2,1,40),
				new Student2("Ű�ڹ�",true,2,2,80),
				new Student2("��ļ�ڹ�",false,2,2,230),
				new Student2("���ڹ�",true,2,2,30),
				new Student2("���ڹ�",false,2,3,100),
				new Student2("���ڹ�",true,2,3,320),
				new Student2("���ڹ�",false,2,3,100)
		};
		System.out.printf("1. �ܼ�����(������ ����)%n");
		Map<Boolean,List<Student2>> stuByGender= Stream.of(stuArr).collect(partitioningBy(Student2::isMale));
	
		List<Student2> maleStudent=stuByGender.get(true);
		List<Student2> femaleStudent=stuByGender.get(false);
		
		
		for(Student2 s: maleStudent) System.out.println(s);
		for(Student2 s: femaleStudent) System.out.println(s);
		
		System.out.printf("%n2. �ܼ���Ȱ + ���(���� �л���)%n");
		
		Map<Boolean,Long> stuNumBySex= Stream.of(stuArr).collect(partitioningBy(Student2::isMale,Collectors.counting()));
		System.out.println("���л� ��:"+stuNumBySex.get(true));
		System.out.println("���л� ��:"+stuNumBySex.get(false));
	
		System.out.printf("%n3. �ܼ����� +���(���� 1��)%n");
		Map<Boolean, Optional<Student2>> topScoreBySex= Stream.of(stuArr).collect(partitioningBy(Student2::isMale
							,maxBy(Comparator.comparing(Student2::getScore))));
		
		System.out.println("���л� 1��: "+topScoreBySex.get(true));
		System.out.println("���л� 1��: "+topScoreBySex.get(false));
		System.out.println("���л� 1��: "+topScoreBySex.get(true).get().getScore());
		System.out.println("���л� 1��: "+topScoreBySex.get(false).get().getScore());
		
		Map<Boolean,Student2> topScoreBySex2=Stream.of(stuArr).collect(Collectors.partitioningBy(s->s.isMale
										,Collectors.collectingAndThen(maxBy(Comparator.comparing(Student2::getScore)), Optional::get)));
		
		System.out.println("���л� 1��: "+topScoreBySex2.get(true));
		System.out.println("���л� 1��: "+topScoreBySex2.get(false));
		
		System.out.printf("%n4. ���ֺ���(���� ���հ���, 100�� ����)%n");
		
		Map<Boolean,Map<Boolean,List<Student2>>> failedStuBySex=
				Stream.of(stuArr).collect(partitioningBy(Student2::isMale,
						partitioningBy(s -> s.getScore() <= 100)));
		
		List<Student2> failedMaleStu=failedStuBySex.get(true).get(true);
		List<Student2> failedFemaleStu=failedStuBySex.get(false).get(true);
		
		for(Student2 s:failedMaleStu) System.out.println(s);
		
		for(Student2 s:failedFemaleStu) System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



}

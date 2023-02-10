package Lamda;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student3{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student3(String name, boolean isMale, int hak, int ban, int score){
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
public class GroupingBy {

	public static void main(String[] args) {
		Student3[] stuArr= {
				new Student3("���ڹ�",true,1,1,300),
				new Student3("���ڹ�",true,1,1,250),
				new Student3("���ڹ�",true,1,1,200),
				new Student3("���ڹ�",false,1,2,100),
				new Student3("���ڹ�",true,1,2,30),
				new Student3("���ڹ�",true,1,2,50),
				new Student3("���ڹ�",false,1,3,600),
				new Student3("���ڹ�",true,1,3,70),
				new Student3("���ڹ�",false,1,3,500),
				new Student3("���ڹ�",false,2,1,200),
				new Student3("���ڹ�",true,2,1,100),
				new Student3("Ÿ�ڹ�",false,2,1,40),
				new Student3("Ű�ڹ�",true,2,2,80),
				new Student3("��ļ�ڹ�",false,2,2,230),
				new Student3("���ڹ�",true,2,2,30),
				new Student3("���ڹ�",false,2,3,100),
				new Student3("���ڹ�",true,2,3,320),
				new Student3("���ڹ�",false,2,3,100)
		};

		System.out.printf("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)%n");
		
		Map<Integer,List<Student3>> stuByBan=Stream.of(stuArr).collect
				(Collectors.groupingBy(s->s.getBan()));
	
		for(List<Student3> s : stuByBan.values()) {
			for(Student3 d:s) {
				System.out.println(d);
			}
		}
		
		System.out.printf("%n2. �ܼ��׷�ȭ(�������� �׷�ȭ)%n");
		Map<Student3.Level, List<Student3>>stuByLevel =Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->{
						if(s.getScore() >= 200) return Student3.Level.HIGH;
						else if(s.getScore()>=100) return Student3.Level.MID;
						else return Student3.Level.LOW;
				}));
		
		TreeSet<Student3.Level> keySet=new TreeSet<>(stuByLevel.keySet());
		for(Student3.Level s : keySet) {
			System.out.println("["+s+"]");
			for(Student3 a:stuByLevel.get(s)) {
				System.out.println(a);
			}
			System.out.println();
		}
		
		System.out.printf("%n3. �ܼ��׷�ȭ+���(������ �л���)%n");
		Map<Student3.Level,Long> stuByLevelCount=Stream.of(stuArr).collect(Collectors.groupingBy(s->{
						if(s.getScore() >= 200) return Student3.Level.HIGH;
						else if(s.getScore()>=100) return Student3.Level.MID;
						else return Student3.Level.LOW;
		},Collectors.counting()));
		TreeSet<Student3.Level> set=new TreeSet<>(stuByLevelCount.keySet());
		for(Student3.Level level:set) {
		System.out.println("["+level+"]"+stuByLevelCount.get(level));	
		}
		
		
		
		
		System.out.printf("%n4. ���߱׷�ȭ(�г⺰,�ݺ�) %n");
		Map<Integer,Map<Integer,List<Student3>>> stuByHakBan=Stream.of(stuArr).collect(Collectors.groupingBy(Student3::getHak,
											Collectors.groupingBy(Student3::getBan)));
		
		for(Map<Integer,List<Student3>> s:stuByHakBan.values()) {
			for(List<Student3>a: s.values()) {
				System.out.println();
				for(Student3 c:a) {
					System.out.println(c);
				}
			}
			System.out.println();
		}
		
		System.out.printf("%n5. ���߱׷�ȭ _ (�г⺰,�ݺ� 1��!!) %n");
		Map<Integer,Map<Integer,Student3>> topStuByHakandBan=Stream.of(stuArr).collect(Collectors.groupingBy(Student3::getHak
							,Collectors.groupingBy(Student3::getBan
							,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student3::getScore)),Optional::get))
					
				));
		
		for(Map<Integer,Student3> a:topStuByHakandBan.values()) {
			for(Integer c:a.keySet()) {
				System.out.println(a.get(c));
			}
		}
		
		System.out.printf("%n6. ���߱׷�ȭ+���(�г⺰, �ݺ� �����׷�%n");
		Map<String,Set<Student3.Level>> stuByScoreGroup=Stream.of(stuArr).collect(Collectors.groupingBy(s->s.getHak()+"-"+s.getBan()
					, Collectors.mapping(s->{
							if(s.getScore()>=200) return Student3.Level.HIGH;
							else if(s.getScore()>=100) return Student3.Level.MID;
							else return Student3.Level.LOW;
					},Collectors.toSet())	
				));
		
		for(String key:stuByScoreGroup.keySet()) {
			System.out.println("["+key+"]"+" : "+stuByScoreGroup.get(key));
		}
		
		
		
		
	}	

} 

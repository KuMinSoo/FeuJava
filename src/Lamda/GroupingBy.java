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
		return String.format("[%s,%s, %d학년 %d반 %3d점]", 
						 	name, isMale?"남":"여",hak,ban,score);
	}
	
	enum Level{HIGH,MID,LOW}

}
public class GroupingBy {

	public static void main(String[] args) {
		Student3[] stuArr= {
				new Student3("나자바",true,1,1,300),
				new Student3("김자바",true,1,1,250),
				new Student3("박자바",true,1,1,200),
				new Student3("사자바",false,1,2,100),
				new Student3("아자바",true,1,2,30),
				new Student3("드자바",true,1,2,50),
				new Student3("비자바",false,1,3,600),
				new Student3("마자바",true,1,3,70),
				new Student3("다자바",false,1,3,500),
				new Student3("나자바",false,2,1,200),
				new Student3("차자바",true,2,1,100),
				new Student3("타자바",false,2,1,40),
				new Student3("키자바",true,2,2,80),
				new Student3("나캬자바",false,2,2,230),
				new Student3("나자바",true,2,2,30),
				new Student3("모자바",false,2,3,100),
				new Student3("매자바",true,2,3,320),
				new Student3("배자바",false,2,3,100)
		};

		System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
		
		Map<Integer,List<Student3>> stuByBan=Stream.of(stuArr).collect
				(Collectors.groupingBy(s->s.getBan()));
	
		for(List<Student3> s : stuByBan.values()) {
			for(Student3 d:s) {
				System.out.println(d);
			}
		}
		
		System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
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
		
		System.out.printf("%n3. 단순그룹화+통계(성적별 학생수)%n");
		Map<Student3.Level,Long> stuByLevelCount=Stream.of(stuArr).collect(Collectors.groupingBy(s->{
						if(s.getScore() >= 200) return Student3.Level.HIGH;
						else if(s.getScore()>=100) return Student3.Level.MID;
						else return Student3.Level.LOW;
		},Collectors.counting()));
		TreeSet<Student3.Level> set=new TreeSet<>(stuByLevelCount.keySet());
		for(Student3.Level level:set) {
		System.out.println("["+level+"]"+stuByLevelCount.get(level));	
		}
		
		
		
		
		System.out.printf("%n4. 다중그룹화(학년별,반별) %n");
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
		
		System.out.printf("%n5. 다중그룹화 _ (학년별,반별 1등!!) %n");
		Map<Integer,Map<Integer,Student3>> topStuByHakandBan=Stream.of(stuArr).collect(Collectors.groupingBy(Student3::getHak
							,Collectors.groupingBy(Student3::getBan
							,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student3::getScore)),Optional::get))
					
				));
		
		for(Map<Integer,Student3> a:topStuByHakandBan.values()) {
			for(Integer c:a.keySet()) {
				System.out.println(a.get(c));
			}
		}
		
		System.out.printf("%n6. 다중그룹화+통계(학년별, 반별 성적그룹%n");
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

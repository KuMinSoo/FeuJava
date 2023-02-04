package Collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("Ã¶¼ö",10));
		set.add(new Person("Ã¶¼ö",10));

		System.out.println(set);
		
		
	}

}

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() { return name+":"+ age;}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p=(Person) obj;
		return name.equals(p.name) && age==p.age;
	}
	
	public int hashcode() {
		return Objects.hash(name,age);
	}
	
	
}

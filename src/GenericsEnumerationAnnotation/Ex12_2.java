package GenericsEnumerationAnnotation;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("ÀÚ¹Ù¿Õ",1,1));
		list.add(new Student("ÀÚ¹ÙÂ¯",1,2));
		list.add(new Student("È«±æµ¿",2,1));
		
		Iterator<Student> it =list.iterator();
		
		while(it.hasNext()) {
			
			Student s=it.next();
			
			System.out.println(s.toString());
		}
		
		
		

	}
}

class Student{
	String name="";
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name=name;
		this.ban=ban;
		this.no=no;
	}
	public String toString() {
		
		return "ÀÌ¸§: "+this.name+" ¹İ: "+this.ban+" ¹øÈ£: "+this.no;
	}
}

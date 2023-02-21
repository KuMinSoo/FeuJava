package JavalangPackage;

public class Equals1 {

	public static void main(String[] args) {
		Person p1=new Person(12345677);
		Person p2=new Person(12345677);
		
		System.out.println(p1.equals(p2));
		
		
		
	}

}


class Person{
	long id;
	
	Person(int id){
		id=id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id==((Person)obj).id;
		}
		return false;
	}
	
	
}
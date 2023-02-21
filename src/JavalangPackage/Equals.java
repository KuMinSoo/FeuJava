package JavalangPackage;

public class Equals {

	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		if(v1.equals(v2))
			System.out.println("v1과 v2 같습니다");
		else
			System.out.println("v1과 v2는 다릅니다");

		String a=new String("10");
		String b=new String("10");
		
		if(a==b) 
			System.out.println("a==b는 true");
		else
			System.out.println("a==b는 false");
		
		if(a.equals(b))
			System.out.println("a과 b는 같습니다");
		else
			System.out.println("a과 b는 다릅니다");
		
		
		
	}
}

class Value{
	
	int value;
	
	Value(int value){
		this.value=value;
	}
}
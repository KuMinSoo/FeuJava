package JavalangPackage;

public class Equals {

	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		if(v1.equals(v2))
			System.out.println("v1�� v2 �����ϴ�");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�");

		String a=new String("10");
		String b=new String("10");
		
		if(a==b) 
			System.out.println("a==b�� true");
		else
			System.out.println("a==b�� false");
		
		if(a.equals(b))
			System.out.println("a�� b�� �����ϴ�");
		else
			System.out.println("a�� b�� �ٸ��ϴ�");
		
		
		
	}
}

class Value{
	
	int value;
	
	Value(int value){
		this.value=value;
	}
}
package JavalangPackage;

public class Ex1 {

	public static void main(String[] args) {
		SutdaCard c1=new SutdaCard(3,true,"aa");
		SutdaCard c2=new SutdaCard(3,true, new String("aa"));
		System.out.println("c1==c2 : "+(c1==c2));
		System.out.println("c1.equals(c2): "+c1.equals(c2));
		
	}

}
class SutdaCard{
	int num;
	boolean isKwang;
	String str;
	SutdaCard(){
		this(1,true,"aa");
	}
	
	SutdaCard(int num,boolean isKwang,String str){
		this.num=num;
		this.isKwang=isKwang;
		this.str=str;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard s=(SutdaCard)obj;
			boolean b=((this.num==s.num) && (this.isKwang==s.isKwang) && (this.str.equals(s.str)))? true: false;
			return b;
		}
		
		return false;
	}
	
	public String toString() {
		return num+(isKwang ? "K":"");
	}
		
	
	
	
	
	
	
	
	
}
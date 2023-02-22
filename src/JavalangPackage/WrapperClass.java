package JavalangPackage;

public class WrapperClass {

	public static void main(String[] args) {

		Boolean b=new Boolean(true);
		System.out.println(b);
		Boolean bb=new Boolean("true");//String 매개변수에 Boolean이 해당되는 알맞은 값 "true"를 넣어야한다. 
		System.out.println(bb);
		Boolean bbb=new Boolean("fasfsf");//true가 아닌 다른 값들을 임의로 넣으면 false로 인식함
		System.out.println(bbb);
		
		Character c=new Character('c');
		System.out.println(c);
	
	//	Byte q=new Byte(10);
	//	System.out.println(q);
		Byte qq=new Byte("10");
		System.out.println(qq);
		Byte qe=new Byte((byte)111);
		
		Short ss=new Short((short)10);
		System.out.println(ss);
		Short sss=new Short("10");
		System.out.println(sss);
		
		Integer i=new Integer(100);
		System.out.println(i);
		Integer ii=new Integer("100");
		System.out.println(ii);
		
		Long l=new Long(100000L);
		System.out.println(l);
		Long ll=new Long("100000");
		System.out.println(ll);
		
		Float t=new Float(3.333d);
		System.out.println(t);
		Float tt=new Float(10.003f);
		System.out.println(tt);
		Float ttt=new Float("10.03f");
		System.out.println(ttt);
		
		Double d=new Double(3.33333);
		System.out.println(d);
		Double dd=new Double(3.2222);
		System.out.println(dd);
		
	}

}

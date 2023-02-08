package Lamda;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		Function<String,Integer> f=(String s)->Integer.parseInt(s);
		System.out.println(f.apply("110000")+100);
		Function<String,Integer> f1=s->Integer.parseInt(s);
		System.out.println(f1.apply("110000")+100);
		Function<String,Integer> f2=Integer::parseInt;
		System.out.println(f2.apply("110000")+100);

	//	Supplier<MyClass>s=()->new MyClass();
	/*
	 * Supplier<MyClass>s=MyClass::new; System.out.println(s.get());
	 * System.out.println(s.get());
	 */		
		//생성자1
		Function<Integer,MyClass> ff=(s)-> new MyClass(s);
		System.out.println(ff.apply(4).iv);
		Function<Integer,MyClass> ff2=MyClass::new;
		Function<Integer,MyClass> ff3=(i)->new MyClass(i);
		System.out.println(ff2.apply(100).iv);
		
		//생성자2
		BiFunction<Integer,Integer,Book1> bb=(i,v)->new Book1(i,v);
		Book1 bb1=bb.apply(3, 4);
		System.out.println("bb1: "+bb1.i);
		System.out.println("bb1: "+bb1.v);
		
		BiFunction<Integer,Integer,Book1> bba=Book1::new;
		Book1 bb2=bba.apply(1, 2);
		System.out.println("bb2: "+bb2.i);
		System.out.println("bb2: "+bb2.v);
		
		BiFunction<Integer,Integer,Book1> bbc=(i,v)->{return new Book1(i,v);};
		BiFunction<Integer,Integer,Book1> bbc1=(i,v)-> new Book1(i,v);
		
		Book1 qq=bbc.apply(3, 3);
		System.out.println("qq: "+qq.i);
		System.out.println("qq: "+qq.v);
		
		
		//배열
		Function<Integer,int[]> ii=(i)->new int[i];
		System.out.println(ii.apply(5));
		int[]a1=ii.apply(5);
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++) {
			a1[i]=i;
		}
		System.out.println(Arrays.toString(a1));
		
		//배열2
		Function<Integer,int[]> i2=int[]::new;
		Function<Integer,int[]> i3=(i)->new int[i];
		int []b=i2.apply(10);
		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++) {
			b[i]=(int) (Math.random()*10+1);
		}
		System.out.println(Arrays.toString(b));

	}

}
class MyClass{
	int iv;
	
	MyClass(int iv){
		this.iv=iv;
				
	}
}
class Book1{
	int i;
	int v;
	Book1(int i, int v){
		this.i=i;
		this.v=v;
	}
}

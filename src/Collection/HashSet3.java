package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {

	public static void main(String[] args) {
		
		HashSet setA=new HashSet();
		HashSet setB=new HashSet();
		HashSet setHab=new HashSet();
		HashSet setKyo=new HashSet();
		HashSet setCha=new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		
		System.out.println("A= "+setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("B= "+setB);
		
		Iterator i=setB.iterator();
		
		while(i.hasNext()) {
			Object tmp=i.next();
			if(setA.contains(tmp)) setHab.add(tmp);
		}
		System.out.println("A ¡û B= "+setHab);
		
		i=setA.iterator();
		while(i.hasNext()) {
			Object tmp=i.next();
			setKyo.add(tmp);
		}
		
		i=setB.iterator();
		while(i.hasNext()) {
			Object tmp=i.next();
			setKyo.add(tmp);
		}
		
		System.out.println("A ¡û B= "+setKyo);
		
		i=setA.iterator();
		while(i.hasNext()) {
			Object tmp=i.next();
			if(!setB.contains(tmp)) setCha.add(tmp);
		}
	
		System.out.println("A - B= "+setCha);
		
	}

}

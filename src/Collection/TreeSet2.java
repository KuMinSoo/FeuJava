package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		String from="b";
		String to="d";
		
		set.add("abc");
		set.add("car");
		set.add("dance");
		set.add("elephant");
		set.add("flower");
		set.add("alien");
		set.add("Car");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("bat");
		set.add("disc");
		set.add("dzzz");
		set.add("fan");

		System.out.println(set);
		
		System.out.println("range search : from "+from+" to "+to);
		System.out.println("result1: "+set.subSet(from, to));
		System.out.println("result2: "+set.subSet(from, to+"zzz"));
		
	}

}

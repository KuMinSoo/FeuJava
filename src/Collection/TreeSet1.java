package Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		for(int i=0;i<6;i++) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		
	}

}

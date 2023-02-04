package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		for(int i=0;i<7;i++) {
			int num=(int) ((Math.random()*10)+1);
			//set.add(new Integer(num));
			set.add(num);
		}
		
		LinkedList aa=new LinkedList(set);
		Collections.sort(aa);
		System.out.println(aa);
	}

}

package Collection;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		int[]score= {80,95,50,35,45,65,10,100};
		
		for(int i=0;i<score.length;i++) {
			set.add(score[i]);
		}
		
		System.out.println("50���� ���� ��: "+set.headSet(new Integer(50)));
		System.out.println("50���� ���ų� ���� ��: "+set.headSet(new Integer(50),true));
		System.out.println("50���� ū ��: "+set.tailSet(new Integer(50)));
		System.out.println("50���� ū ��: "+set.tailSet(new Integer(50),true));

	}

}

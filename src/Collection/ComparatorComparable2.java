package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorComparable2 {

	public static void main(String[] args) {
		Integer strArr[]= {30, 50,10,40,20};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr,new DescComp());
		System.out.println(Arrays.toString(strArr));

	}

}

class DescComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) return -1;
		
		Integer i=(Integer) o1;
		Integer i2=(Integer) o2;
		
		//int a=-(i>i2?1:(i==i2?0:-1));
		return i.compareTo(i2)*-1;
	}
	
}

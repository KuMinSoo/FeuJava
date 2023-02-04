package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {

	public static void main(String[] args) {
		String data[]= {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		HashMap<String, Integer> map=new HashMap();
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])){
				int value=(int)map.get(data[i]);
				map.put(data[i],value+1);
			}else {
				map.put(data[i], 1);
			}
		}
		
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
		
			Map.Entry e=(Map.Entry)it.next();
			int value=(int) e.getValue();
			System.out.println(e.getKey()+" : "+printBar('#',value)+value);
		
		}
		
		

	}
	
	public static String printBar(char ch, int value) {
		
		/*String tmp="";
		for(int i=0;i<value;i++) {
			tmp+=ch;
		}
		return tmp;*/
		
		char[]bar=new char[value];
		for(int i=0;i<value;i++) {
			bar[i]=ch;
		}
		return new String(bar);
		
		
	}

}

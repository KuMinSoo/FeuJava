package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap();
		
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);

		Set set=map.entrySet();
		Iterator it=set.iterator();
		
		//Iterator it=map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e=(Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey()+" , ����: "+e.getValue());
		}

		System.out.println("������ ���: "+map.keySet());
		Collection values=map.values();
		it=values.iterator();
		int total=0;
		
		while(it.hasNext()) {
			total+=(int)it.next();
		}
		System.out.println("����: "+total);
		System.out.println("���: "+(float)total/values.size());
		System.out.println("�ְ�����: "+Collections.max(values));
		System.out.println("��������: "+Collections.min(values));
		
		
	
	
	}

}

package Array;

public class StringArray {

	public static void main(String[] args) {
		//String�� �ٸ� �⺻�� �迭�� ��Ģ�� ����
		String[] name;
		name= new String[]{"Kim","Park","Yi"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println("name["+i+"]: "+name[i]);
		}
		String tmp=name[0];
		System.out.println("tmp: "+tmp);
		name[0]="Yi";
		for(String i:name) {
			System.out.println(i);
		}
		
		
	}

}

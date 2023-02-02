package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class StackQueue3 {

	static Queue q=new LinkedList();
	static final int MAX_SIZE=5;
	
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		StackQueue3 qq=new StackQueue3();
		
		try {
			while(true) {
				System.out.println(">>");
				Scanner sc=new Scanner(System.in);
				String input=sc.nextLine().trim();
				if("".equals(input)) continue;
				
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("�����ϰڽ��ϴ�.");
					System.exit(0);
				}
				
				
				if(input.equalsIgnoreCase("history")) {				
					LinkedList tmp=(LinkedList) q;
					ListIterator list= tmp.listIterator();
					int i=0;
					while(list.hasNext()) {
						System.out.println(++i+"."+list.next());
					}
					
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - ������ �����ݴϴ�");
					System.out.println("q �Ǵ� Q- ���α׷��� �����մϴ�");
					System.out.println("history - �ֱٿ� �Է��� ��ɾ"+MAX_SIZE+"��ŭ �����ݴϴ�.");
				}else{
					qq.save(input);
					System.out.println(input);
				}
				
			}
		} catch (Exception e) {
			System.out.println("�Է� �����Դϴ�.");
		}
		

	}
	
	public void save(String input) {
		if(!"".equals(input)) {
			q.offer(input);
		}
		
		if(q.size()>MAX_SIZE) {
			q.remove();
		}
		
	}

}

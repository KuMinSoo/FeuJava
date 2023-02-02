package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class StackQueue3 {

	static Queue q=new LinkedList();
	static final int MAX_SIZE=5;
	
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		StackQueue3 qq=new StackQueue3();
		
		try {
			while(true) {
				System.out.println(">>");
				Scanner sc=new Scanner(System.in);
				String input=sc.nextLine().trim();
				if("".equals(input)) continue;
				
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("종료하겠습니다.");
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
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q- 프로그램을 종료합니다");
					System.out.println("history - 최근에 입력한 명령어를"+MAX_SIZE+"만큼 보여줍니다.");
				}else{
					qq.save(input);
					System.out.println(input);
				}
				
			}
		} catch (Exception e) {
			System.out.println("입력 오류입니다.");
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

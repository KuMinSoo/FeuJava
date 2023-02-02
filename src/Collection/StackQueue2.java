package Collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueue2 {

	public static void main(String[] args) {

		if(args.length!=1) {
			System.out.println("((2+3)*1)+1 �̷��� ��ȣ�� ����� ������ �Է��ϼ���");
			System.exit(0);
		}
		
		Stack<String> st=new Stack();
		String expression=args[0];
		System.out.println("expression: "+expression);
		try {
		for(int i=0;i<expression.length();i++) {
			char a=expression.charAt(i);
			if(a=='(') {
				st.push("(");
			}else if(a==')') {			
				st.pop();		
			}
		}
		if(st.isEmpty()) {
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		}else System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		} catch (EmptyStackException e) {
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
	}

}

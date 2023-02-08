package Lamda;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		//Optional<T> ��ü�� ����������
		Optional<String>optVal=Optional.of("abc");
		String str1=optVal.get();//�������� ���� ���� null�̸� NullpointException�߻�
		String str2=optVal.orElse("ss");//�������� or ���� null�̸� ""��ȯ
		String str3=optVal.orElseGet(String::new);
		String str4=optVal.orElseGet(() -> new String());
		String str5=optVal.orElseThrow(NullPointerException::new);
		String str6=optVal.orElseThrow(() -> new NullPointerException());
		
		//isPresent()-Optional��ü�� ���� null�̸� false, �ƴϸ� true
		String str="aa";
		if(Optional.ofNullable(str).isPresent()) {
			System.out.println("�ش� ���� null�� �ƴմϴ�");
		}
		//ifPresent(Consumer)- ���� �ƴҶ��� �۾� ����, ���̸� ����X
		Optional.ofNullable(1).ifPresent((t)->System.out.println(t));
		Optional.ofNullable("aa").ifPresent(System.out::println);
	}

}

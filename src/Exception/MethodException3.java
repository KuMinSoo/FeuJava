package Exception;

import java.io.File;
import java.io.IOException;

public class MethodException3 {

	public static void main(String[] args) {

		File f = createFile(args[0]);

	}

	static File createFile(String name) {
		File f = new File(name);
		try {

			if (name == null || "".equals(name) || "a".equals(name)) {
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�");
			}
			
			f.createNewFile();
		
		} catch (Exception e) {
			/*
			 * e.printStackTrace(); System.out.println("�޼��� ���� ");
			 */
		}
		//main�޼ҵ忡�� catch���� ��������� ������ �س��� main�޼ҵ忡�� Ȯ���� �� �� ������.
		//���� main�޼��尡 �ƴ� main���� ȣ���� �ش� �޼ҵ忡�� catch���� ��������� ������ ��!!  main�޼ҵ忡�� ������ �߻��Ҷ� ��� �߻������ .. �˱� ��ƴ�..
		
		//������ ȣ���� �ش� �޼ҵ忡�� try catch�� ������ ��ƹ����� �ش� �޼��带 ���� ã�Ƽ� Ȯ���ؾ����� catch���� ���� ������ �� �� �ִ�.
		//�ռ����ߴٽ��� catch�� �ȿ� �ƹ��� ��¹��� �����Ǿ� ���� ������ ������ ã�� ��ƴ�.
		return f;

	}

}

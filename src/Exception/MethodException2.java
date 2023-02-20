package Exception;

import java.io.File;

public class MethodException2 {

	public static void main(String[] args) {
		try {
			File f=createFile(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		}catch(Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է����ּ���");
		}
	}

	static File createFile(String name) throws Exception {
		if(name==null || "".equals(name)) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�");
		}
		File f=new File(name);
		f.createNewFile();
		
		return f;
		
		
		
	}
	
	
}

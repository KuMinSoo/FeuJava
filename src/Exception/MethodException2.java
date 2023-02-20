package Exception;

import java.io.File;

public class MethodException2 {

	public static void main(String[] args) {
		try {
			File f=createFile(args[0]);
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage()+" 다시 입력해주세요");
		}
	}

	static File createFile(String name) throws Exception {
		if(name==null || "".equals(name)) {
			throw new Exception("파일이름이 유효하지 않습니다");
		}
		File f=new File(name);
		f.createNewFile();
		
		return f;
		
		
		
	}
	
	
}

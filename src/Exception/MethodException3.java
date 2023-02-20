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
				throw new Exception("파일이름이 유효하지 않습니다");
			}
			
			f.createNewFile();
		
		} catch (Exception e) {
			/*
			 * e.printStackTrace(); System.out.println("메서드 오류 ");
			 */
		}
		//main메소드에서 catch문을 빈공백으로 설정을 해놔도 main메소드에서 확인을 할 수 있지만.
		//만약 main메서드가 아닌 main에서 호출한 해당 메소드에서 catch문을 빈공백으로 설정한 후!!  main메소드에서 오류가 발생할때 어디서 발생됬는지 .. 알기 어렵다..
		
		//하지만 호출한 해당 메소드에서 try catch로 오류를 잡아버리면 해당 메서드를 직접 찾아서 확인해야지만 catch문에 대한 정보를 알 수 있다.
		//앞서말했다시피 catch문 안에 아무런 출력문도 설정되어 있지 않으면 더더욱 찾기 어렵다.
		return f;

	}

}

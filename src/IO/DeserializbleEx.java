package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializbleEx {

	public static void main(String[] args) {

		
		String fileName="userInfo.ser";
		try {
			FileInputStream fis=new FileInputStream(fileName);
			BufferedInputStream bis=new BufferedInputStream(fis);
			ObjectInputStream ois=new ObjectInputStream(bis);
			
			UserInfo u1=(UserInfo)ois.readObject();
			UserInfo u2=(UserInfo)ois.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<UserInfo> list=(ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			//////
			String aa=args[0];
			System.out.println("입력된 값은: "+aa);
			
			
			
			
			ois.close();
			bis.close();
			fis.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}

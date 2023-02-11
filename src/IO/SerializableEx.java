package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableEx {

	public static void main(String[] args) {
		String fileName="userInfo.ser";
		try {
			FileOutputStream fos=new FileOutputStream(fileName);

			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			
			ObjectOutputStream oos=new ObjectOutputStream(bos);

			UserInfo u1=new UserInfo("javaMan","1234",30);
			UserInfo u2=new UserInfo("aquaMan","4434",35);
			
			ArrayList<UserInfo> list=new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);

			oos.close();
			bos.close();
			fos.close();
			
			
			System.out.println("직렬화 잘 끝냈습니다.");
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
		
		
		
	}

}

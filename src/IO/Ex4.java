package IO;

import java.io.File;
import java.util.Scanner;

public class Ex4 {

	static String[] argArr;
	static File curDir;
	
	static {
		try {
			curDir=new File(System.getProperty("user.dir"));
			
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			try {
				String prompt=curDir.getCanonicalPath()+">>";
				System.out.println(prompt);
				
				String input=s.nextLine().trim();//����� �յ�����, ��� ������ ���� �ȵ�!
				argArr=input.split(" +");//�پ�� 1�� �̻� ������ �ɰ��� �迭�� ����
				
				String command=argArr[0];
				
				if("".equals(command)) {
					System.out.println("�Է��� ���� �����Դϴ�");
					continue;// �Է��� ���� �����̸�... �ٽ� ó������ ���ư���! 
				}
				
				command=command.toLowerCase();
				
				if(command.equals("q")) {
					System.exit(0);
				}else if(command.equals("cd")) {
					cd();
				}else {
					for(int i=0;i<argArr.length;i++) {
						System.out.println(argArr[i]);
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("�Է¿����Դϴ�....");
			}
		}
		
	}

	public static void cd() {
		if(argArr.length==1) {
			System.out.println(curDir);
			return;
		}else if(argArr.length>2) {
			System.out.println("USAGE: cd directory");
			return;
		}
		
		String subDir=argArr[1];
		File newFile=null;
		if("..".equals(subDir)) {
			newFile=curDir.getParentFile();
			if(newFile==null) {
				System.out.println("��ȿ���� �ʴ� ���丮�Դϴ�..");
			}else {
				curDir=newFile;
				System.out.println("���� ���丮�� �����˴ϴ� >>>>>>"+curDir);
			}
			
		}else if(".".equals(subDir)) {
			System.out.println("���� ���丮�� �����˴ϴ� >>>>>>>"+curDir);
		}else{
			newFile=new File(curDir,subDir);
			if(newFile.exists()||newFile.isDirectory()) {	
				curDir=newFile;
				System.out.println("������ ��η� ����˴ϴ� >>>>>>>"+curDir);
			}else {
				System.out.println("��ȿ���� �ʴ� ���丮 �Դϴ�.");
			}
		}
		
		
		
		
		
	}

}

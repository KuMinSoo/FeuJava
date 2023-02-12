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
				
				String input=s.nextLine().trim();//빈공백 앞뒤제거, 가운데 공백은 제거 안됨!
				argArr=input.split(" +");//뛰어쓰기 1개 이상 단위로 쪼개서 배열로 저장
				
				String command=argArr[0];
				
				if("".equals(command)) {
					System.out.println("입력한 값이 공백입니다");
					continue;// 입력한 값이 공백이면... 다시 처음으로 돌아간다! 
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
				System.out.println("입력오류입니다....");
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
				System.out.println("유효하지 않는 디렉토리입니다..");
			}else {
				curDir=newFile;
				System.out.println("상위 디렉토리로 설정됩니다 >>>>>>"+curDir);
			}
			
		}else if(".".equals(subDir)) {
			System.out.println("현재 디렉토리를 설정됩니다 >>>>>>>"+curDir);
		}else{
			newFile=new File(curDir,subDir);
			if(newFile.exists()||newFile.isDirectory()) {	
				curDir=newFile;
				System.out.println("지정한 경로로 변경됩니다 >>>>>>>"+curDir);
			}else {
				System.out.println("유효하지 않는 디렉토리 입니다.");
			}
		}
		
		
		
		
		
	}

}

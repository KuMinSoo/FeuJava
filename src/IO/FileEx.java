package IO;

import java.io.File;

public class FileEx {

	public static void main(String[] args) throws Exception{
	
		File fr=new File(".\\src\\IO\\FileEx.java");
		//File fr=new File("c:\\jdk1.8\\work\\ch15\\sfs.java");
		String fileName=fr.getName();
		int pos=fileName.lastIndexOf('.');
		
		System.out.println("경로를 제외한 파일이름- "+fileName);
		System.out.println("확장자를 제외한 파일이름 "+fileName.substring(0,pos));
		System.out.println("확장자-"+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일이름: "+fr.getPath());
		System.out.println("파일 절대경로: "+fr.getAbsolutePath());
		System.out.println("파일 정규경로: "+fr.getCanonicalPath());
		System.out.println("파일이 속해 있는 디렉토리: "+fr.getCanonicalPath());
		System.out.println();
		System.out.println("File.separator: "+fr.separator);
		System.out.println("File.separatorChar: "+fr.separatorChar);
		
		System.out.println("File.pathSeparator: "+fr.pathSeparator);
		System.out.println("File.pathSeparatorChar: "+fr.pathSeparatorChar);
		System.out.println();
		
		System.out.println("user.dir:"+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path="+System.getProperty("sun.boot.class.path"));
	}

}

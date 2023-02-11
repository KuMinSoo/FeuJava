package IO;

import java.io.File;

public class FileEx {

	public static void main(String[] args) throws Exception{
	
		File fr=new File(".\\src\\IO\\FileEx.java");
		//File fr=new File("c:\\jdk1.8\\work\\ch15\\sfs.java");
		String fileName=fr.getName();
		int pos=fileName.lastIndexOf('.');
		
		System.out.println("��θ� ������ �����̸�- "+fileName);
		System.out.println("Ȯ���ڸ� ������ �����̸� "+fileName.substring(0,pos));
		System.out.println("Ȯ����-"+fileName.substring(pos+1));
		
		System.out.println("��θ� ������ �����̸�: "+fr.getPath());
		System.out.println("���� ������: "+fr.getAbsolutePath());
		System.out.println("���� ���԰��: "+fr.getCanonicalPath());
		System.out.println("������ ���� �ִ� ���丮: "+fr.getCanonicalPath());
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

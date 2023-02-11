package IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class Ex3 {

	public static void main(String[] args) {

		if(args.length==0) {
			System.out.println("USAGE: javaa FileMergeTest MERGE_FILENAME FILENAME2....");
			System.exit(0);
		}
		Vector<FileInputStream> list=new Vector<>();
		try {
		//�Էµ� ���� Vector ������� ���
			for(int i=0;i<args.length;i++) {
				list.add(new FileInputStream(new File(args[i])));
				
			}
		//sequeueceInputStream�� �ϳ��� �����
		SequenceInputStream si=new SequenceInputStream(list.elements());
		BufferedInputStream bi=new BufferedInputStream(si);
		
		int data=0;
		while((data=bi.read())!=-1) {
			System.out.write((char)data);
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

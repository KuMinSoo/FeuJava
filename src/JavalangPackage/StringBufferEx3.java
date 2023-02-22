package JavalangPackage;

public class StringBufferEx3 {

	public static void main(String[] args) {
		
		//16���ڸ� ���� �� �ִ� StringBuffer �ν��Ͻ� ����.. ���� 16���� �Ѱ� ���� �� ������ �뷮�� ���̴� �������� �޼��尡 �ڵ����� ȣ��Ǹ鼭 ������ ������ �� ����
		StringBuffer sb=new StringBuffer();
		
		//10���ڸ� ���� �� �ִ� StringBuffer �ν��Ͻ� ���� : �뷮 ���� ����
		StringBuffer sb1=new StringBuffer(10);
		
		//sb�� ���ڿ��� ���� StringBuffer �ν��Ͻ� ���� �뷮�� 2���� +16���ڷ� ����� 
		//���ڿ��� ���ڿ� �Է��ϸ� �ش� ���ڿ� ���� + 16���� ������ �뷮�� �߰��Ѵ�. 
		StringBuffer sb2=new StringBuffer("sb");
		
		//StringBuffer�� append()�޼ҵ��� �Ű��������� �ظ��ϸ� �پ��� ���� Ÿ���� ���� �� ����.
		StringBuffer sb3=new StringBuffer();
		sb3.append(true).append(false).append("�ȳ��ϼ���").append(10.12343f).append(false).append(11111).append(new char[]{' ','2','o'});
		System.out.println(sb3);
		
		//int capacity():���� ����� ȣ���ϴ� �޼���
		StringBuffer sb4=new StringBuffer(100);
		sb4.append("abc");
		int buffersize=sb4.capacity();
		int bufferLength=sb4.length();
		System.out.println("bufferSize: "+buffersize);
		System.out.println("bufferLength: "+bufferLength);
		
		//char charAt(int index): ������ ��ġ�� ���� ��ȯ
		char c=sb3.charAt(3);// e
		System.out.println(c);
		
		//StringBuffer delete(int start, int end): ������ġ(start)���� ��(end)���̿� �ִ� ���ڸ� �����Ѵ�. �׷��� start ����, ��(end)���ڴ� ������/  start<= ___ < end
		StringBuffer aa=new StringBuffer("012345678");
		StringBuffer bb=aa.delete(3, 7);
		
		System.out.println(aa);
		System.out.println(bb);
	
		//StringBuffer insert(int pos,boolean/char/char[]/double/float/int/long/Object/String) 2��° �Ű��������� �پ��� Ÿ���� ������ �� �� �ֵ�.
		//StringBuffer�� �ش� ��ü�� pos(�ε�����ȣ)�� �ش� ���� �߰��ϴ� ���̴�.
		StringBuffer abc=new StringBuffer("012345678");
		abc.insert(3, '.');
		System.out.println(abc);
		abc.insert(3, false);
		System.out.println(abc);
		abc.insert(3, new char[] {'>','.','<'});
		System.out.println(abc);
		
		//int length(): ���ڿ� ���� ��ȯ
		System.out.println(abc.length());
		
		//StringBuffer reverse(): StringBuffer�ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ������ �Ųٷ� �����Ѵ�.
		StringBuffer abcd=new StringBuffer("123456");
		System.out.println(abcd.toString());
		abcd.reverse();
		System.out.println(abcd);
		
		abcd.reverse();//�ٽ� ���� ������ �ٲٱ�
		
		//void setCharAt(int index,char ch): ������ index�� ������ ���� ch�� �ٲ�
		abcd.setCharAt(3, '_');
		System.out.println(abcd);
		
		
		//void setLength(int newLenghth): ������ ���̷� ���ڿ��� ���̸� �����Ѵ�. ���̸� ���̴� ��� ������ ������� \u0000ä���
		StringBuffer qwer=new StringBuffer("01234567");
		System.out.println("qwer.length():"+qwer.length());
		qwer.setLength(10);
		System.out.println("qwer.length():"+qwer.length());
		qwer.setLength(1000);
		System.out.println("qwer.length():"+qwer.length());
		
		qwer.setLength(4);//���� ���� �ִ� ������ �������� �� ���� ���̸� ������ ���ڵ��� �����ȴ�.
		System.out.println("qwer.length():"+qwer.length());
		System.out.println(qwer);
		
		//String subString(int start): �ش� �ε������� �����ؼ� ������ String��ü�� ������. 3~������!!
		//String subString(int start, int end): �ش� �ε������� �����ؼ� end�ε����� �������� �߶� String ��ü�� �����Ѵ�. Start<=...<end
		StringBuffer qwer1=new StringBuffer("01234567");
		String str=qwer1.substring(3);
		System.out.println("str:"+str);
		String str1=qwer1.substring(3,5);
		System.out.println("str1:"+str1);
		
		
		
		
		
	}

}

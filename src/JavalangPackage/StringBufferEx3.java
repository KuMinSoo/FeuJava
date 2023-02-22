package JavalangPackage;

public class StringBufferEx3 {

	public static void main(String[] args) {
		
		//16문자를 담을 수 있는 StringBuffer 인스턴스 생성.. 만약 16문자 넘게 담을 수 있지만 용량을 늘이는 내부적인 메서드가 자동으로 호출되면서 성능이 느려질 수 있음
		StringBuffer sb=new StringBuffer();
		
		//10문자를 담을 수 있는 StringBuffer 인스턴스 생성 : 용량 지정 가능
		StringBuffer sb1=new StringBuffer(10);
		
		//sb의 문자열을 갖는 StringBuffer 인스턴스 생성 용량은 2글자 +16글자로 저장됨 
		//문자열을 인자에 입력하면 해당 문자열 개수 + 16글자 개수의 용량을 추가한다. 
		StringBuffer sb2=new StringBuffer("sb");
		
		//StringBuffer의 append()메소드의 매개변수에는 왠만하면 다양한 변수 타입을 넣을 수 있음.
		StringBuffer sb3=new StringBuffer();
		sb3.append(true).append(false).append("안녕하세요").append(10.12343f).append(false).append(11111).append(new char[]{' ','2','o'});
		System.out.println(sb3);
		
		//int capacity():버퍼 사이즈를 호출하는 메서드
		StringBuffer sb4=new StringBuffer(100);
		sb4.append("abc");
		int buffersize=sb4.capacity();
		int bufferLength=sb4.length();
		System.out.println("bufferSize: "+buffersize);
		System.out.println("bufferLength: "+bufferLength);
		
		//char charAt(int index): 지정된 위치의 문자 반환
		char c=sb3.charAt(3);// e
		System.out.println(c);
		
		//StringBuffer delete(int start, int end): 시작위치(start)부터 끝(end)사이에 있는 문자를 제거한다. 그러나 start 포함, 끝(end)문자는 미포함/  start<= ___ < end
		StringBuffer aa=new StringBuffer("012345678");
		StringBuffer bb=aa.delete(3, 7);
		
		System.out.println(aa);
		System.out.println(bb);
	
		//StringBuffer insert(int pos,boolean/char/char[]/double/float/int/long/Object/String) 2번째 매개변수에는 다양한 타입의 변수가 올 수 있따.
		//StringBuffer의 해당 객체에 pos(인덱스번호)에 해당 값을 추가하는 것이다.
		StringBuffer abc=new StringBuffer("012345678");
		abc.insert(3, '.');
		System.out.println(abc);
		abc.insert(3, false);
		System.out.println(abc);
		abc.insert(3, new char[] {'>','.','<'});
		System.out.println(abc);
		
		//int length(): 문자열 길이 반환
		System.out.println(abc.length());
		
		//StringBuffer reverse(): StringBuffer인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다.
		StringBuffer abcd=new StringBuffer("123456");
		System.out.println(abcd.toString());
		abcd.reverse();
		System.out.println(abcd);
		
		abcd.reverse();//다시 원래 순서로 바꾸기
		
		//void setCharAt(int index,char ch): 지정된 index를 설정한 문자 ch로 바꿈
		abcd.setCharAt(3, '_');
		System.out.println(abcd);
		
		
		//void setLength(int newLenghth): 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘이는 경우 나머지 빈공간을 \u0000채운다
		StringBuffer qwer=new StringBuffer("01234567");
		System.out.println("qwer.length():"+qwer.length());
		qwer.setLength(10);
		System.out.println("qwer.length():"+qwer.length());
		qwer.setLength(1000);
		System.out.println("qwer.length():"+qwer.length());
		
		qwer.setLength(4);//만약 원래 있던 문자의 개수보다 더 적게 줄이면 나머지 문자들을 삭제된다.
		System.out.println("qwer.length():"+qwer.length());
		System.out.println(qwer);
		
		//String subString(int start): 해당 인덱스부터 시작해서 끝까지 String객체를 생성함. 3~끝까지!!
		//String subString(int start, int end): 해당 인덱스부터 시작해서 end인덱스의 직전까지 잘라서 String 객체를 생성한다. Start<=...<end
		StringBuffer qwer1=new StringBuffer("01234567");
		String str=qwer1.substring(3);
		System.out.println("str:"+str);
		String str1=qwer1.substring(3,5);
		System.out.println("str1:"+str1);
		
		
		
		
		
	}

}

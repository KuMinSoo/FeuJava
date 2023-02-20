package Exception;

class MyException extends Exception{
		private final int ERR_CODE;
		
		MyException(String msg, int errCode){
			super(msg);//Exception ������ �����ڸ� ����� �� ����. super(msg)�� ������ super()�� ������ �⺻�����ڷ� �ڵ� ���������ش�.
			ERR_CODE=errCode;
		}
		MyException(String msg){
			this(msg, 100);
		}
	
		public int getErrCode() {
			return ERR_CODE;
		}
}



public class UserDefinedException {
	
	static void method1() throws Exception {
		throw new ClassCastException("aaa");
	}
	
	public static void main(String[] args) {
	try {
		method1();
	}catch(Exception e) {
		if(e instanceof ClassCastException) {
			ClassCastException a=(ClassCastException)e;
			System.out.println(a.getCause());//���� ���ܰ� ������ null ȣ����.	
		}
	}
		
		
	try {
		 throw new MyException("����� ���� ����!",222);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
		 System.out.println(e.getLocalizedMessage());
		 System.out.println(e.getCause()); // ������ ȣ��� ������ ���� ���� ȣ����. ��, throw���� main���� catch ���ؼ� ������ �������� �� ������ throw �Ǿ��� ���� �޼��带 ã��... ������ null
		 System.out.println(e);
	 }
	 System.out.println("==================");

	 MyException me=new MyException("MyException err �Դϴ�");
	 
	 try {
		throw me; 
	 }catch(Exception e) {
		 System.out.println("getErrCode(): "+me.getErrCode());
		 System.out.println("getMessage(): "+e.getMessage());
		 //getMessage()�� ���ڿ��� ������ ���ܸ� ������!
		 //�����ڰ� ���� ���ܸ� �������� ������ null, ������ ���ڿ��� ������ �ش� ���ڿ� ���
		 
		 System.out.println(e.getLocalizedMessage());
		 //���� ���� ������ ���ڿ��� ��ȯ��. getMessage�� ����� �Ǿ� ������ 
		 //getLocalizedMessage�� ����ȭ�� �޼����� ������.
		 
		 
		 System.out.println("e.getStackTrace()"+333);
		 System.out.println("e.getSuppressed()"+e.getSuppressed()); 
		 System.out.println(e.hashCode());
		 System.out.println(e.toString());
		 System.out.println(e);
		 System.out.println("=================================");
	 }
	 
	 try {
	 throw new RuntimeException("this is error ");
	 }catch(RuntimeException e) {
		 System.out.println(e.getMessage());
		 System.out.println(e.getLocalizedMessage());
		 System.out.println(e);//��ü ��ü�� �θ��� (� Ŭ������ ��������)+(���� �޼���)�� �θ���.
	 }
	 
	 

	}

}

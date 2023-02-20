package Exception;

class MyException extends Exception{
		private final int ERR_CODE;
		
		MyException(String msg, int errCode){
			super(msg);//Exception 조상의 생성자를 사용할 수 있음. super(msg)가 없으면 super()로 조상의 기본생성자로 자동 컴파일해준다.
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
			System.out.println(a.getCause());//원인 예외가 없으면 null 호출함.	
		}
	}
		
		
	try {
		 throw new MyException("사용자 지정 에러!",222);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
		 System.out.println(e.getLocalizedMessage());
		 System.out.println(e.getCause()); // 직전에 호출된 에러에 대한 원인 호출함. 즉, throw으로 main에서 catch 대해서 오류가 잡혔을때 그 직전에 throw 되었던 원인 메서드를 찾음... 없으면 null
		 System.out.println(e);
	 }
	 System.out.println("==================");

	 MyException me=new MyException("MyException err 입니다");
	 
	 try {
		throw me; 
	 }catch(Exception e) {
		 System.out.println("getErrCode(): "+me.getErrCode());
		 System.out.println("getMessage(): "+e.getMessage());
		 //getMessage()는 문자열의 간단한 예외를 설명함!
		 //개발자가 직접 예외를 설정하지 않으면 null, 설정한 문자열이 있으면 해당 문자열 출력
		 
		 System.out.println(e.getLocalizedMessage());
		 //상세한 예외 정보를 문자열로 반환함. getMessage는 영어로 되어 있지만 
		 //getLocalizedMessage는 지역화된 메세지를 전달함.
		 
		 
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
		 System.out.println(e);//객체 자체를 부르면 (어떤 클래스의 에러인지)+(에러 메세지)를 부른다.
	 }
	 
	 

	}

}

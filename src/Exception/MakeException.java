package Exception;

public class MakeException {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("Exception 에러 발생");//에러 객체 생성
			throw e;//에러 객체를 throw로 던져야지 오류 발생함. throw하지 않으면 에러 발생하지 않음
			
			//위 문장은 아래와 같이 한 문장으로 표현가능함. 
			//throw new Exception("Exception2에러 발생");
			//단, try{}문에서 throw e로 에러를 이미 발생시켰음으로 한번 더 throw e로 오류를 발생시키는거는 무의미하며, 컴파일 오류가 발생됨
		
		}catch(Exception e) {
			System.out.println("에러메세지:"+e.getMessage());
			e.printStackTrace();
		}

	}

}

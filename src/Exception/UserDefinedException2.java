package Exception;

public class UserDefinedException2 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println("에러메세지:"+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다");
		}catch(MemoryException e) {
			System.out.println("에러메세지: "+e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요");
		}finally {
			deleteTempFile();
		}
		
		
		
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("설치공간이 부족합니다");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다");
		}
	}
	
	static void copyFiles() {}
	static void deleteTempFile() {}
	
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}

}


class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception{
	public MemoryException(String msg) {
		super(msg);
	}
}

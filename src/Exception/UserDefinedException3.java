package Exception;

public class UserDefinedException3 {

	public static void main(String[] args) {
		try {
			install();
		}catch(InstallException e) {
			e.printStackTrace();
			System.out.println("e.getCause(): "+e.getCause());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	static void install() throws InstallException{
		try {
			startInstall();
			copyFile();
		}catch(SpaceException2 e) {
			InstallException ie=new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e);
			throw ie;
		}catch(MemoryException2 e) {
			InstallException ie=new InstallException("��ġ�� ���� �߻�");
			ie.initCause(e);
			throw ie;
		}finally {
			deleteTempFiles();
		}
	}
	
	
	static void startInstall() throws SpaceException2,MemoryException2{
		if(!enoughSpace()) {
			throw new SpaceException2("��ġ�� ������ �����մϴ�");
		}
		if(!enoughMemory()) {
			throw new MemoryException2("�޸𸮰� �����մϴ�");
		}
	
	}
	
	
	static void copyFile() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	
}








class InstallException extends Exception{
	InstallException(String msg) {
		super(msg);
	}
}
class SpaceException2 extends Exception{
	SpaceException2(String msg){
		super(msg);
	}
}
class MemoryException2 extends Exception{
	MemoryException2(String msg) {
		super(msg);
	}
}
package Exception;

public class UserDefinedException2 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}catch(SpaceException e) {
			System.out.println("�����޼���:"+e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�");
		}catch(MemoryException e) {
			System.out.println("�����޼���: "+e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���");
		}finally {
			deleteTempFile();
		}
		
		
		
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {
			throw new SpaceException("��ġ������ �����մϴ�");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�");
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

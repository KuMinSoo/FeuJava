package JavalangPackage;

public class Hashcode {

	public static void main(String[] args) {
		String str1=new String("abc");
		String str2=new String("abc");
		//�츮�� ��ü �ּҰ� �ƴ� hashcode�� ���� ������ �ٷ��� �����͸� �����ϰ� �˻��ϴµ� �����ϱ� �����̴�.
		//hashcode�� ������ ���������� ���������� �˻��� �� ���� �˻������ϴ� �̸� �̿��� ������ HahsMap,HashSet�ִ�.
		//��ü�� ����� �ּҰ��� �ִ�
		//hashcode�� ��ü�� ����� �ּҰ��� �������� �� �ٸ� �ؽ��ڵ��� ����!!
		//�׷��� String�� ���� ������ �Ȱ��� ������ Hashcode ��ȯ�ϳ� �ּҰ��� �ٸ�.

		
		System.out.println(str1==str2);//�ּҰ��� �ٸ�!!!
		System.out.println(str1.equals(str2));//String�� ���� ��ü�� �޶� �Ȱ��� hashcode�� ��ȯ�Ѵ�.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str1));
		//String�� ��� ���ο� ��ü�� �����ϴ��� ���ڿ��� ������ �Ȱ��� hashcode�� �����Ѵ�.
		//�׷��� System.identityHashCode�� �޼��带 ����ϸ� ObjectŬ������ hashCode�޼��� ó�� �ּҰ����� �ؽ��ڵ帣 ������!!
		//�̿� ���� ���� String�̶� �ٸ� �ؽ��ڵ帣 ��ȯ�Ѵ�.
		
		
		//Integer�� String�� �Ȱ���, �� �⺻�� ���ۿ� String ���������� �� ��ü�� �ּҰ��� �޶� ���� ���̸� �Ȱ��� �ؽ��ڵ带 ��ȯ�Ѵ�.
		//�׷��� �ٸ� ��ü���� �ؽ��ڵ�� �����Ϸ��� System.identityHashcode�� �̿��ϸ� �ȴ�.
		
		Integer a=new Integer(1);
		Integer b=new Integer(1);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
	}

}

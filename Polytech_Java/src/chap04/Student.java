package chap04;

public class Student {
	//String���� �а��� �������� �й��� �ʵ�� ����
	//Student Ŭ������ main() �޼ҵ忡��  Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���
	
	int id;
	String dept;
	
	
	public static void main(String[] args) {
		Student student = new Student();
		student.dept="����Ʈ����Ʈ����";
		student.id=20330011;
		System.out.println(student.dept + " : " + student.id);
	}
}

package chap02;

public class Misson1 {

	public static void main(String[] args) {
		boolean result;
		result = 3==5;
		System.out.println(result);
		System.out.println("=================");
		
		int a = (int) 3.5; // ĳ���� ������
		
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key; //��ȣȭ ����
		System.out.println("cyper = " + cyper);		
		System.out.println("plain = " + (cyper^key));
		//��ȣ���� key ������ ����ȭ ��Ŵ
		System.out.println("=================");
		System.out.println(10 >> 1); //shift ������
		System.out.println(10 << 1); //shift ������
		
		System.out.println("=================");
		var v = 30;
		System.out.println(v);
	}

}

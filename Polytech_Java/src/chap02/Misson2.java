package chap02;

import java.util.Scanner;


public class Misson2 {

	public static void main(String[] args) {
		//�ڵ� import : Ctrl + Shift + O
		//���� ���� : Ctrl + Alt + ����Ű
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է��� ������ �����ּ��� >>");
		String msg = scan.next();//�Է������� ù��° ���̸� �������� ����
		System.out.println("msg = " + msg);

		
		
		System.out.print("�Է��� ���ڸ� �����ּ��� >>");
		int num = scan.nextInt();//�Է������� ù��° ���̸� �������� ����
		System.out.println("num = " + num);
		
	}
}

package chap03;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		//1. While �� ���
		System.out.println("�������� >> ");
		int toeic = scan.nextInt();
		
		while(true) { //true�� ����ϸ� ���ѷ����� ��
			if(toeic>700) break;
			System.out.println("���θ� �ϼ���!");
			System.out.println("������ ������!");
			System.out.println("�������� >> ");
			toeic = scan.nextInt();			
		}
		
		System.out.println("���� ���� Ż��!");

	}

}

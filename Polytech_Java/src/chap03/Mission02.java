package chap03;

import java.util.Random;
import java.util.Scanner;

// user �� com�� �ִ�.
// user�� 1,2,3 - ����������
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

public class Mission02 {

	public static void main(String[] args) {
		/*
		 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ���� 
		 int com = (int)(1 + Math.random()*3);//1~3������ ����*/
		 
		/* 
		2) Random() Ŭ������ nextInt, nextDouble.. */
		 Random rand = new Random();	
		 int count = 0;
		 
		 while(true) {
			 count ++;
			 if(count > 3) break;
			 int com = 1 + rand.nextInt(3);
			 
			 Scanner scan = new Scanner(System.in);
			 System.out.print("����(1), ����(2), ��(3) >> ");
			 int user = scan.nextInt();
			 
			 System.out.println("user�� " + user);
			 System.out.println("com�� " + com);
			
			 if (user == 1) {
				 if (com == 1) 				System.out.println("�����ϴ�.");
				 else if (com == 2) 		System.out.println("�����ϴ�");
				 else 						System.out.println("�̰���ϴ�.");
			 }
			 
			 if (user == 2) {
				 if (com == 1) 				System.out.println("�̰���ϴ�.");
				 else if (com == 2) 		System.out.println("�����ϴ�.");
				 else 						System.out.println("�����ϴ�.");
			 }
			 
			 if (user == 3) {
				 if (com == 1) 				System.out.println("�����ϴ�.");
				 else if (com == 2) 		System.out.println("�̰���ϴ�.");
				 else 						System.out.println("�����ϴ�.");
			 }
		 }
		
	}
}	

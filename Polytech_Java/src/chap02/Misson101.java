package chap02;

import java.util.Random;
import java.util.Scanner;

// user �� com�� �ִ�.
// user�� 1,2,3 - ����������
// com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

public class Misson101 {

	public static void main(String[] args) {
		/*
		 1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ���� 
		 int com = (int)(1 + Math.random()*3);//1~3������ ����*/
		 
		/* 
		2) Random() Ŭ������ nextInt, nextDouble.. */
		 Scanner scan = new Scanner(System.in);
		 Random rand = new Random();	
		 int count = 0;
		 final int TRY_NUMBER = 10; //���
		 boolean state = true; // ���°� �������� ����
		 		 
		 while(true) {
			 count++;
			 if(count > TRY_NUMBER){
				 state = false;
				 break;
				 }
			 	 int com = 1 + rand.nextInt(3);
		 
				 System.out.print("����(1), ����(2), ��(3) >> ");
				 int user = scan.nextInt();
				 
				 
				 if (com == 1) 							System.out.println("��ǻ�� : ����");
				 else if (com == 2) 					System.out.println("��ǻ�� : ����");
				 else 									System.out.println("��ǻ�� : ��");
				 
				 int result = user - com;
				 
				 if (result==0) 						System.out.println("���º�"); 
				 else if (result == -1 || result == 2)  System.out.println("��ǻ�� ��!");
				 else {									System.out.println("����� ��!");
				 
				 break;
				 }
		 }
		 	System.out.println("=================================");
			if(state) 			System.out.println("����� �¸�!");
			else			    System.out.println("�õ�Ƚ�� �ʰ�!");
				
			scan.close();
	
	}
}

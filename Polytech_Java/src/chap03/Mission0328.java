package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission0328 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		while(true) {
			
			int com = rand.nextInt(100);
			int count = 0;
			int max = 99;
			int min = 0;
			System.out.println("���� �����Ͽ����ϴ�. ���߾����");
			System.out.println(min + "-" + max);
			
			while(true) {
					count++;
					System.out.print(count + ">>");
					int user = scan.nextInt();
					
					if (user>com) 		{		System.out.println("�� ����");
												max = user;
												System.out.println(min + "-" + max);
					}
					else if (user<com) 	{		System.out.println("�� ����");
												min = user;
												System.out.println(min + "-" + max);
					}
					else {						System.out.println("�¾ҽ��ϴ�.");
							break;
					}
			}
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			String text = scan.next();
					
			if(text.equals("n")) {
				System.out.println("��������");
					break;
			}
					else continue;
			
			
		}
		
	}
	

}

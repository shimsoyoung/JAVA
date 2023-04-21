package chap03;

import java.util.Random;
import java.util.Scanner;

//UP and DOWN ����
//����� : 1~99������ ���� �Է�
//��ǻ�� : 1~99������ ���� �Է�
//����ڰ� ��ǻ�� ���� ���߸� ���� ����!
//�����>��ǻ�� down ����!
//�����<��ǻ�� up ����!

//trial = 7ȸ
//���� : �̰��!! , ���� : ����Ƚ�����!!  �����ߴ�!!

public class Mission03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();	
		
		int count = 0;
		final int TRY_NUMBER = 10;
		boolean state = true;
		int com = 1 + rand.nextInt(99);
		
		while(true) {
			count++;
			if (count > TRY_NUMBER) {
				state = false;
				break;
			}
			rand.setSeed(System.currentTimeMillis());
			System.out.println(System.currentTimeMillis());
			
			
			
			System.out.println("���� ���纸��! >>");
			int user = scan.nextInt();
			
			if (user > com)							System.out.println("DOWN!!");
			else if (user < com)					System.out.println("UP!!");
			else	{								System.out.println("������!");
			
				break;
			}
		
		}
		
		
		System.out.println("=========================");
		if(state) 				System.out.println("�¸�");
		else					System.out.println("�й�");
		
		scan.close();
	}
		
		
		
}


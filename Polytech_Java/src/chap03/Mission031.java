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

public class Mission031 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();	
		
		//1. ��ǻ�� ���� �����Ѵ�.
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		int com = 1 + rand.nextInt(99);
		final int TRY_NUMBER = 7; 	//�տ� final�� ���̸� ������ �Ұ����� ������� �Ǵ� ����. 
		
		int count = 0; 				// �õ�Ƚ���� ���� ī��Ʈ
		boolean state = true;		//���º��� (�����̶�� ����)
		
		//3. �ݺ��� �Ѵ� (try_numberȽ������, �����Ҷ�����)
		while(true) {
			//2. ������ �Ѵ�.
			count++;
			if (count > TRY_NUMBER) {
				state = false;
				break;
			}
			
			System.out.println("���� ���纸��! >>");
			int user = scan.nextInt(); 
			
			if (user > com)							System.out.println("DOWN!!");
			else if (user < com)					System.out.println("UP!!");
			else break;	
			
		
		}
		
		
		System.out.println("=========================");
		if(state) 				System.out.println("�¸�");
		else					System.out.println("�й� �õ�Ƚ���� " + (count-1));
		
		scan.close();
	}
		
		
		
}


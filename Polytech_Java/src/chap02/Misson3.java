package chap02;

import java.util.Scanner;
//Scanner Ŭ������ �̿��Ͽ� ��ȭ�� �Է� �޾� �޷��� �ٲپ� ���� ���ÿ� ����
//����ϴ� ���α׷��� �ۼ��϶�
//$1 = 1100 ���� �����ϰ� ����϶�.

//��ȭ �Է� (���� ��) >> 3300
//3300���� $3.0 �Դϴ�. 

public class Misson3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��ȭ �Է� (���� ��)>>");
		int won = scan.nextInt();
		System.out.println(won+"���� " + (double)won/1100 + "$ �Դϴ�.");
		
		scan.close();
		
	}

}

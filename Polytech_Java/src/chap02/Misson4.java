package chap02;

import java.util.Scanner;

public class Misson4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99) >> ");
		int num = scan.nextInt();
		int tennum = num/10;
		int onenum = num%10;
		
		// ���ǿ�����
		
//	 	String msg = (tennum == onenum) ? "YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�." :
//			"NO! ���� �ʽ��ϴ�.";
//	 	
//	 	System.out.println(msg);
//		
		
		//���ǽ� if�� Ȱ��
		
		String msg;
		
		if (tennum == onenum)
			msg = "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.";
		
		else
			msg = "NO! ���� �ʽ��ϴ�.";
		
		
		
		scan.close();

	}

}

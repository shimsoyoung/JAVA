package chap02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//65376
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		int num = scan.nextInt();
		int ���� = num/50000;
		int res = (num%50000);
		int �� = (num/10000)-5;
		int õ = (num%10000)/1000;
		int �� = ((num%1000)-(num%100))/100;
		int ���� = (((num%100)-(num%10))/10)/5;
		int �� = res/10;
		res = (num%10);
		int �� = res/1000;
		
		System.out.println("��������" + ���� + "��");
		System.out.println("������" + �� + "��");
		System.out.println("õ����" + õ + "��");
		System.out.println("���" + �� + "��");
		System.out.println("���ʿ�" + ���� + "��");
		System.out.println("�ʿ�" + �� + "��");
		System.out.println("�Ͽ�" + �� + "��");
	}

}

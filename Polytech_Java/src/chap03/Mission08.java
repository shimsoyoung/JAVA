package chap03;

import java.util.Scanner;

public class Mission08 {
//while���� �̿��Ͽ� ������ ���� �� �Է� �ް� ����� ����϶�. -1�� �ԷµǸ� �Է��� �����Ѵ�.
	public static void main(String[] args) {
				
		
		int sum=0; int count=0; //����, ������ ����
		double average = 0.0; 	//���
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻð� �������� -1�� �Է��ϼ��� >> ");
		int n=scan.nextInt();
		
		while(n!=-1) {
			sum += n;			//sum = sum+n
			count++;
			n = scan.nextInt(); //���Ϲ� ������ ���ؼ�
		}
		if(count>0) {
			System.out.print("������ ������" + count + "���̸�");
			average = (double)sum/count; //���� ���� ����� ������ ����. �׷��� sum�� count �� �� �ϳ��� double�� �ٲ���(ū ���� ���󰡱� ����)
			System.out.println("�����" + average + "");
		}
		else
			System.out.println("�Էµ� ������ �����ϴ�.");
		
	}

}

package chap03;

//1. while�� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.

public class Mission05 {

	public static void main(String[] args) {
		
		//1. 1~100������ �������� 13�� ����� �ջ��϶�.
		
		int sum = 0;
		for(int num=1; num<=100; num++)
			if(num%13==0) sum += num;
		
		//2. 1~100������ �������� 13�� �Ǳ� �������� �ջ��϶�.
		
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) break;
			sum += num;
		}
		
		//3. 1~100������ ���� ���� 13�� ������ ���ڸ� �ջ��϶�.
		
		sum=0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) continue;
			sum += num;
		}
		
		System.out.println("sum = " + sum);
	}

}

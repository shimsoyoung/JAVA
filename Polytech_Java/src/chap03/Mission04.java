package chap03;

//1. while�� Ȱ�� : 1~10������ ���� �ջ��Ͽ� �����(sum)�� ����Ͻÿ�.

public class Mission04 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0; //������ (�ʱ�ȭ�� �׻� 0)
		 do{
			sum += num;
			num++;
		 }while (num<=10);
		//2. for�� Ȱ�� 
//		int sum = 0;
//		for(int num=1; num<=10; num++)
//			sum += num;
//		
		System.out.println("sum = " + sum);
	}

}

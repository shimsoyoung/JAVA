package chap03;


public class Mission11 {

	public static void main(String[] args) {
		 int lotto_num[] = new int [7]; //7���� ��
		 String names[] = {"����", "ġŲ", "����"};
		 
		 //�迭�� �� �Է�
		 for(int i=0; i<7; i++)  {//��ȣ�� 6�������̱� ������ i<7
			 lotto_num[i] = (int)(1 + Math.random() * 45);   //i��°�� �濡 1~45������ i�� ���� �������� �Է�
			 for(int j=0; j<i; j++)
				 if(lotto_num[i] == lotto_num[j]) i--; //i�� j �� ���� ������ �ٽ� �������ϴµ� �״�� �������� i���� 
			 										   //1++ �ǹ����Ƿ� i-- �ؼ� ������
		 }
		 //�迭�� �� ���
		 for(int num : lotto_num)
			 System.out.printf("%5d", num); //�迭�� ���İ��� ��.
		 
		 System.out.println();
		 
		 for(String name : names)
			 System.out.println(name + "  ");
	}

}

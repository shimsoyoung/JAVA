package chap03;

public class Mission07 {

	public static void main(String[] args) {
				
			int count =0;
				for(int i=1; i<=31; i++) {
					count++; //������ ������ ���� ����
					System.out.printf("%5d",i);
					if (count%7==0) 
						System.out.println();
				}
	}

}

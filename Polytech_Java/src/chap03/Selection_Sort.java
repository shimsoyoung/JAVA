package chap03;

public class Selection_Sort {

	public static void main(String[] args) {
		int iu_height[] = {180, 165, 175, 170, 160, 171, 150, 162};
		
		
		
			//�ּҰ� �˰���
			System.out.println("���� �� :");
			
			for(int iu : iu_height) 				//iu_height������ iu�� �� ĭ �� ĭ�� ���� ������
				System.out.print(iu + " ");
				System.out.println();
					
				//3.�ܰ躰�� �ݺ��ϱ�
				for(int i=0; i <7; i++)
				{
				int min = iu_height[0]; 			//iu_height 0���濡 ����ִ� ���� �ּҶ�� ����
				int min_index = 0; 					//0������ �ּҰ��̶�� ���������Ƿ� �����صα�
				for(int j=1; j<8; j++)
					if(min > iu_height[j]) {
						min = iu_height[j];			
						min_index = j;
					}
				
				
				//��ȯ �˰���
				int temp = iu_height[min_index];
				iu_height[min_index] = iu_height[0];
				iu_height[0] = temp;
				}
				
				System.out.println("���� �� :");
				for(int iu : iu_height) 				
					System.out.print(iu + " ");
				System.out.println();
		
			
	}

}

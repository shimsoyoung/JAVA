package chap06;

import java.util.StringTokenizer;

//���ڵ��� ü���� ����� ���϶�
public class StringTokenizerEx1 {
	
	public static void main(String[] args) {
		
		String data = " ȫ�浿, 010-1234-5678, �����, �л�";
		String data1 = "ȫ�浿,��,65,170/�輼��,��,57,164/���屺,��,80,190/����,��,77,167/ȫ�̿�,��,64,165";
		
		StringTokenizer st = new StringTokenizer(data,",");
		StringTokenizer st1 = new StringTokenizer(data1,"/");
		
		
//		while(st.hasMoreTokens()) {
//			System.out.println("�̸� : " + st.nextToken());
//			System.out.println("��ȣ : " + st.nextToken());
//			System.out.println("�ּ� : " + st.nextToken());
//			System.out.println("���� : " + st.nextToken());
//			
//		}
		int sum = 0;
		int count = 0;
		
		while(st1.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ",");
			while(st2.hasMoreTokens()) {
				if(st2.nextToken().equals("��")) {
					count++;
					sum+=Integer.parseInt(st2.nextToken()) ;
					
				}
			
			}
			
		}
		System.out.println("���ڵ��� ��� ü�� : " + ((double)sum)/count);
		
	}
}

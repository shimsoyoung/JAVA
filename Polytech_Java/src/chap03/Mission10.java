package chap03;

//do while���� �̿��Ͽ� a to z���� ����ϴ¤�
public class Mission10 {

	public static void main(String[] args) {
		 char c= 'a';
		 
		 do {
			 System.out.print(c);
			 c = (char)(c + 1);
		 }while(c<='z');
	}

}

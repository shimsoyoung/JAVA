package chap02;

import java.util.Scanner;

public class Misson7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� >>");
		int score = scan.nextInt();
		char grade;
		
		//�б��� if��
		if(score>=90)	grade = 'A';
		else if(score>=80)	grade = 'B';
		else if(score>=70)	grade = 'C';
		else if(score>=60)	grade = 'D';
		else 				grade = 'F';
		
		System.out.println("������" + grade + "�Դϴ�.");
		
	}

}

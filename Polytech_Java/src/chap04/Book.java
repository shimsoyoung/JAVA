package chap04;

public class Book {
	//�ʵ� : �������
	String title;
	String author;
	String name = "�ɼҿ�";
	//�޼ҵ�
	//�����ڸ޼ҵ�
	Book(){
		System.out.println(name);
	}
	Book(String title){
		this("", "");
		this.title = title;
		this.author = "���ڹ̻�";
		
	}
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	//�Ϲݸ޼ҵ�
	void printBook()	 {
		System.out.println(this.title + " : " + this.author);
	}
	public static void main(String args[]) {
		Book book = new Book();
		Book littlePrince = new Book("�����", "�������丮");
		Book lovestory = new Book("���ⵯ");
		littlePrince.printBook();
		lovestory.printBook();
		book.title = "���̿���";
		System.out.println(book.title);
	}
}

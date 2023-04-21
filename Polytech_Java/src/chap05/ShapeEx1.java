package chap05;

//�߻�Ŭ���� ����
abstract class Shape2{		//2. ��ȣ �ȿ� abstract�� �޾������Ƿ� class���� �޾���
	abstract void draw(); //1. draw �� ������ �ȵ������Ƿ� abstract�� �޾���
}

//�߻�Ŭ������ ��ӹ޾Ƽ� �������ؼ� ���
class Circle1 extends Shape2{

	@Override
	void draw() {
		System.out.println("���׸���");
	}
}

class Line1 extends Shape2{

	@Override
	void draw() {
		System.out.println("���׸���");		
	}
}

class Rect1 extends Shape2{

	@Override
	void draw() {
		System.out.println("�簢���׸���");		
	}
}

public class ShapeEx1 {

	public static void main(String[] args) {
		Shape2 s = new Circle1();
		s.draw();
	}

}

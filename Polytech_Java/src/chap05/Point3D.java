package chap05;

//Point�� ��ӹ޾� 3������ ���� ��Ÿ���� Point3D Ŭ������ �ۼ��϶�.
//���� main()�޼ҵ带 �����ϰ� �������� ���� ��µǰ� �϶�.



class Point3D extends Point{
	String Point3D;
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	void move(int x, int y, int z) {
		move(x,y);
		this.z = z;
	}
	void moveUp() {
		this.z = z + 1;
	}
	void moveDown() {
		this.z = z - 1;
	}
	public String toString() {
		 return "(" + getX() + ", " + getY() + ", " + z + ")�� ��";
	}

    public static void main(String[] args) {
        Point3D p = new Point3D(1,2,3); //1,2,3 �� ���� x,y,z���� ��.
        System.out.println(p.toString() + "�Դϴ�.");
        
        p.moveUp(); //z ������ ���� �̵�
        System.out.println(p.toString() + "�Դϴ�.");
        
        p.moveDown(); //z ������ �Ʒ��� �̵�
        p.move(10, 10); //x,y ������ �̵�
        System.out.println(p.toString() + "�Դϴ�.");
        
        p.move(100, 200, 300); //x,y,z ������ �̵�
        System.out.println(p.toString() + "�Դϴ�.");
    }

}

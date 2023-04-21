package chap05;

//Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.
//���� main()�޼ҵ带 �����ϰ� �������� ���� ��µǰ� �϶�.

class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

class ColorPoint05 extends Point{
    String color;
    public ColorPoint05(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    void setXY(int x, int y){
        move(x,y);
    }

    void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return color + "���� (" + getX() + "," + getY() + ") �� ��";
    }



    public static void main(String[] args) {
        ColorPoint05 cp = new ColorPoint05(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str+"�Դϴ�. ");
    }

}

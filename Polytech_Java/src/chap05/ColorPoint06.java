package chap05;

//Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.
//���� main()�޼ҵ带 �����ϰ� �������� ���� ��µǰ� �϶�.



class ColorPoint06 extends Point{
	String color;
    public ColorPoint06(){
        super(0, 0);
        this.color = "BLACK";
    }
    public ColorPoint06(int x, int y) {
        super(x, y);
        this.color = "BLACK";
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
        ColorPoint06 zeroPoint = new ColorPoint06(); //(0,0) ��ġ�� BLACK �� ��
        System.out.println(zeroPoint.toString() + "�Դϴ�.");
        
        ColorPoint06 cp = new ColorPoint06(10,10); //(10,10) ��ġ�� BLACK �� ��
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "�Դϴ�. ");
    }

}

package game;

import java.util.Random;
import java.util.Scanner;

//���� �ó�����
public class GameUnit {
       static int bossPower = 5000;
       private int unitPower = 5000;
       private MyWeapon weapon; 
       private String name;
       
      
       //�����ڸ� �������ּ���. 
       
       // �����ڸ޼���
//       public GameUnit () {};
       public GameUnit(String name) {
         this.name =name;
          weapon = new MyWeapon();
          weapon.charge(unitPower);
          
      }
       //attack �޼��� ����
       void attack (int power) {
          GameUnit.bossPower = bossPower - power;
          if (power<=500) System.out.println("Miss!! �߻��ʺ����� ������ �̹��ߴ�!");
       }
       
       void defence (int power) {
          GameUnit.bossPower = bossPower + power;
       }
       
       
       public static void main(String[] args){ 
         GameUnit unit1 = new GameUnit("unit1");
         GameUnit unit2 = new GameUnit("unit2");         
         
         
         Random r = new Random();
         Scanner scan = new Scanner(System.in);
         while(true){   
            int p1 = 1+ r.nextInt(1000);
            int p2 = 1+ r.nextInt(200);
            System.out.println("�����ϼ���!");
            String act = scan.next();
           
            if(act.equals("g"))  { 
               
               unit1.attack(p1);
               
               System.out.println("�ٺ��ʺ��̰� �����Ѵ�!"+ p1 + "������ �۷�!");
               
                     
               if(GameUnit.bossPower <0) {
                        System.out.println("���� ��������");
                        System.exit(0);}
               else
                  System.out.println("������ bossPower:" + GameUnit.bossPower);
               
               unit2.defence(p2);
               System.out.println("�ٺ��־�ϰ� �����Ǹ� ȸ���ߴ�! "+ p2+ "��Ŀ����!!");
            }
            
            else {System.out.println("�������� ������ ������ �ʾҴ�");
            	 System.out.println("�ʺ��� �ٺ�");
            
            }
            if(GameUnit.bossPower<=0) {
               System.out.println("���ӽ¸�!-���� �����մϴ�.");
            System.exit(0);
            }
            else
               System.out.println("������ bossPower:" + GameUnit.bossPower);
           }
       
       }
}
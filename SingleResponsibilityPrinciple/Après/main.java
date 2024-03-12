package TP1_POA.SingleResponsibilityPrinciple.Après;

import java.awt.Color;





public class main {


    public static void main(String argv[])
    {
        System.out.println("ceci est mon premier print");

        Paint p = new Paint(1000, 500);

        Rectangle test = new Rectangle(new Point(100, 200), 10, 50, Color.BLACK, 1);
        Circle test2 =  new Circle(new Point(50, 300), 10, Color.BLUE, 2);
        Forme test3 = new Forme(new Point(20, 900));
        PrintRectangle.print(test);

        Forme[] tabFormes = new Forme[] {test, test2, test3};

        
        

        
    }
}

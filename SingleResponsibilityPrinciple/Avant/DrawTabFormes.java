package TP1_POA.SingleResponsibilityPrinciple.Avant;

public class DrawTabFormes {
    public static void drawFormes(Forme[] formes, Paint paint){
        for(Forme f : formes){
            if(f instanceof Rectangle){
                f = (Rectangle)f;
                f.draw(paint);
            }else if(f instanceof Circle){
                f = (Circle)f;
                f.draw(paint);
            }else{
                System.out.println("Ce n'est pas une forme dessinable");
            }
        }
    }
}

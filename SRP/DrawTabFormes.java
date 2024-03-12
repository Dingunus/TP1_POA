package src.SRP;

public class DrawTabFormes {
    public static void drawFormes(Forme[] formes, Paint paint){
        for(Forme f : formes){
            if(f instanceof Rectangle){
                DrawRectangle.draw(paint, (Rectangle)f);
            }else if(f instanceof Circle){
                DrawCircle.draw(paint, (Circle)f);
            }else{
                System.out.println("Ce n'est pas une forme dessinable");
            }
        }
    }
}

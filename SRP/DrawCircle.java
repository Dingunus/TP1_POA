package src.SRP;

public class DrawCircle {

    
    public static void draw(Paint paint, Circle c){
        paint.setColor(c.getLineColor());
        paint.setLineWidth(c.getLineWidth());
        paint.drawArc(c.getCenter().getX(), c.getCenter().getY(), c.getRadius()*2, c.getRadius()*2, 0, 360);
    }
}

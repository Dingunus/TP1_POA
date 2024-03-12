package src.V1;

import java.awt.Color;
public class Circle extends Forme{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(Point center, int radius, Color lineColor, int lineWidth){
        super(center, lineColor, lineWidth);
        this.setRadius(radius);
    }


    @Override
    public void print() {
        System.out.println("Circle - center :" + this.getCenter() + ", radius : " + this.getRadius());
    }

    public void draw(Paint paint){
        paint.setColor(this.getLineColor());
        paint.setLineWidth(this.getLineWidth());
        paint.drawArc(this.getCenter().getX(), this.getCenter().getY(), this.getRadius()*2, this.getRadius()*2, 0, 360);
    }
    
}

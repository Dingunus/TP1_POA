package src.SRP;

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



    
}

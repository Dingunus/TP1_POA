package src.SRP;


import java.awt.Color;

public class Rectangle extends Forme{

    // Attributs
    private int width;
    private int height;

    // Getters et Setters 
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    // Constructeur 

    public Rectangle(Point center, int width, int height, Color lineColor, int lineWidth){
        super(center, lineColor, lineWidth);
        this.setHeight(height);
        this.setWidth(width);
    }

    
}

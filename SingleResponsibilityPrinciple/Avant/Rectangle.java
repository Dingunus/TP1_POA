package TP1_POA.SingleResponsibilityPrinciple.Avant;


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

    @Override
    public void print() {
        System.out.println("Rectangle - center: " + this.getCenter() + ", width : " + this.getWidth() + ", height : " + this.getHeight());
    }

    
    public void draw(Paint paint){
        paint.setColor(this.getLineColor());
        paint.setLineWidth(this.getLineWidth());
        //coin en haut à gauche jusqu'à en haut à droite
        paint.drawLine(this.getCenter().getX()-(getWidth()/2),
                this.getCenter().getY()-(getHeight()/2),
                this.getCenter().getX()+(getWidth()/2),
                this.getCenter().getY()-(getHeight()/2)
        );
        //coin en bas à gauche jusqu'à en bas à droite
        paint.drawLine(this.getCenter().getX()-(getWidth()/2),
                this.getCenter().getY()+(getHeight()/2),
                this.getCenter().getX()+(getWidth()/2),
                this.getCenter().getY()+(getHeight()/2)
        );
        //coin en bas à droite jusqu'à en haut à droite
        paint.drawLine(this.getCenter().getX()+(getWidth()/2),
                this.getCenter().getY()+(getHeight()/2),
                this.getCenter().getX()+(getWidth()/2),
                this.getCenter().getY()-(getHeight()/2)
        );
        //coin en haut à gauche jusqu'à en bas à gauche
        paint.drawLine(this.getCenter().getX()-(getWidth()/2),
                this.getCenter().getY()-(getHeight()/2),
                this.getCenter().getX()-(getWidth()/2),
                this.getCenter().getY()+(getHeight()/2)
        );

    }
}

package TP1_POA.SingleResponsibilityPrinciple.Après;

import java.awt.Color;


public class Forme {
    // Attributs

    private Point center;
    private Color lineColor;
    private int lineWidth;

    // Constructeur
    public Forme(Point center, Color lineColor, int lineWidth){
        this.center = center;
        this.lineColor = lineColor;
        this.lineWidth = lineWidth;
    }
    public Forme(Point center){
        this(center, Color.BLACK, 1);
    }

    // Getters et Setters
    public Point getCenter(){
        return this.center;
    }
    public void setCenter(Point center){
        this.center = center;
    }
    public Color getLineColor() {
        return lineColor;
    }
    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }
    public int getLineWidth() {
        return lineWidth;
    }
    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }
    

    // Methodes 

    
    
}

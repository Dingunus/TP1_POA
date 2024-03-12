package TP1_POA.SingleResponsibilityPrinciple.Avant;


public class Point {

    // Attributs
    private int x;
    private int y;

    // Constructeur
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters et Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    // Methodes 

    @Override
    public String toString(){
        return "(" + this.getX() + ", " + this.getY() + ") "; 
    }
    
}


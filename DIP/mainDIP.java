package src.DIP;

class Point {

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

interface Forme {
    
    public Point getCenter();
    public void setCenter(Point center);
    

    // Methodes 

    public void print();
}

class Rectangle implements Forme{
    // Attributs
    private Point center;
    private int width;
    private int height;

    // Getters et Setters
    @Override
    public Point getCenter() {
        return this.center;
    }
    @Override
    public void setCenter(Point center) {
        this.center = center;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWidth(){
        return this.width;
    }
    // Constructeur
    public Rectangle(Point center, int width, int height){
        this.center = center;
        this.width = width;
        this.height = height;
    }
    @Override
    public void print() {
        System.out.println("Rectangle - center: " + this.getCenter() + ", width : " + this.getWidth() + ", height : " + this.getHeight());
        
    }
}
class Circle implements Forme{
    // Attributs
    private Point center;
    private int radius;

    // Getters et Setters 
    @Override
    public Point getCenter() {
        return this.center;
    }
    @Override
    public void setCenter(Point center) {
        this.center = center;
    } 
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    // Consructeur
    public Circle(Point center, int radius){
        this.center = center;
        this.setRadius(radius);
    }
    @Override
    public void print() {
        System.out.println("Circle - center :" + this.getCenter() + ", radius : " + this.getRadius());
    }    
}
    

public class mainDIP {
    public static void main(String[] args) {
        
    }
}

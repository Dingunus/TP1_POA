package src.Reflec;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.w3c.dom.css.Rect;

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

	// methodes

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}

class Forme {
	// Attributs
	private Point centre;

	// Constructeur
	public Forme(Point centre) {
		this.centre = centre;
	}

	// Getters
	public Point getCentre() {
		return this.centre;
	}

	// Methodes
	public void print() {
		System.out.println("Forme - center: " + this.getCentre());
	}

}

class Rectangle extends Forme {
	// Attributs
	private int width;
	private int height;

	public Rectangle(Point centre, int width, int height) {
		super(centre);
		this.width = width;
		this.height = height;
	}

	// Getters
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// Methodes
	@Override
	public void print() {
		System.out.println("Rectangle - center: " + this.getCentre() + ", width : " + this.getWidth() + ", height : "
				+ this.getHeight());
	}
}

public class TestReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {

		try{
			// Récupération des données de la class rectangle
			Class<?> class1 = Rectangle.class;

			// On récupère les attributs declarés dans la classe rectangle
			Field[] attributs = class1.getDeclaredFields();

			// Affichage
			System.out.println("Différent attributs de la classe " + class1.getName());
			for( Field attribut : attributs){
				System.out.println(attribut.getName() + " de type : " + attribut.getType());
			}

			// Récupération de la superclass 
			Class<?> class2 = class1.getSuperclass();
			Field[] attributs2 = class2.getDeclaredFields();

			// Affichage
			System.out.println("\nDifférent attributs de la classe " + class2.getName());
			for( Field attribut : attributs2){
				System.out.println(attribut.getName() + " de type : " + attribut.getType());
			}
			// Création d'une nouvelle instance
			Object Rectangle = class1.getConstructor(Point.class, int.class, int.class).newInstance(new Point(0, 0), 45, 90);
			// Utilisation de la méthode print de rectangle
			Method methode1 = class1.getMethod("print", null);
			methode1.invoke(Rectangle);

			// Field fld = class1.getField("width");
			// fld.set(int.class, 50);
			// methode1.invoke(Rectangle);
			

			}catch(Throwable e){
				System.err.println(e);
			}
		}
}
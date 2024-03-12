package src.SRP;

public class PrintForme {
    public static void print(Forme f){
        System.out.println("Shape - center : " + f.getCenter() + ", color : " + 
                            f.getLineColor() + " , éppaisseur : " + f.getLineWidth());
    }
}



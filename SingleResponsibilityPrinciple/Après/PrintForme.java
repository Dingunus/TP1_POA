package TP1_POA.SingleResponsibilityPrinciple.Après;

public class PrintForme {
    public static void print(Forme f){
        System.out.println("Shape - center : " + f.getCenter() + ", color : " + 
                            f.getLineColor() + " , éppaisseur : " + f.getLineWidth());
    }
}



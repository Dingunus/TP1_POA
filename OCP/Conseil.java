package src.OCP;

public class Conseil implements IEmployee{

    private String name;
    
    @Override
    public void printEmployee() {
        System.out.println(name + " est en train de conseiller !");
    }  
    

}

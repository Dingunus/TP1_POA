package TP1_POA.OpenClosePrinciple.Avant;

public class Employee {
    //Attributs
    private String name;
    private String role;
    //Constructeur
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    

    //Getters et Setters 
    public String getName() { return name;}
    public String getRole() { return role; }
    

    // Methodes

    public void printEmployee(){
        if (this.getRole() == "Dev") {
            System.out.println(name + " est en train de coder !");
        }else if (this.getRole() == "Test") {
            System.out.println(name + " est en train de tester !");
        }else if (this.getRole() == "conseil") {
            System.out.println(name + " est en train de conseiller !");
        }else{
            System.out.println(name + " est en train de travailler !");
        }
    }
}

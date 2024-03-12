package TP1_POA.InterfaceSegregationPrinciple;

// ancienne interface
interface IPersone{
    public void travailler();
    public void chercheUnEmploi();
    public void conduire();
}
// nouvlles interfaces
interface IEmployee{
    public void travailler();
}
interface IConducteur{
    public void conduire();
}
interface IChomeur{
    public void chercheUnEmploi();
}


class Employee implements IEmployee, IConducteur{
    public void travailler(){
        System.out.println("Cette personne travail");
    }

    @Override
    public void conduire() {
        System.out.println("Cette personne conduit");
    }
}

class Chaumeur implements IChomeur, IConducteur{
   
     @Override
    public void chercheUnEmploi() {
        System.out.println("Cette personne chercher un travail");
    }

    @Override
    public void conduire() {
        System.out.println("Cette personne conduit");
    }
}


public class mainISP {

}

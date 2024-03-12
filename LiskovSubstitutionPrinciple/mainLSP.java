package TP1_POA.LiskovSubstitutionPrinciple;

class Animal {
    public void manger(String aliment) {
        System.out.println("L'animal mange.");
    }
}

class Oiseau extends Animal {
    @Override
    public void manger(String aliment) {
        if (aliment != "graines")
        System.out.println("L'oiseau ne mange pas.");
        else
            System.out.println("L'oiseau picore des graines.");
    }

    public void voler() {
        System.out.println("L'oiseau vole dans le ciel.");
    }
}

class Poisson extends Animal {
    @Override
    public void manger(String aliment) {
        System.out.println("Le poisson se nourrit de plancton.");
    }

    public void nager() {
        System.out.println("Le poisson nage dans l'eau.");
    }
}

public class mainLSP {
    public static void main(String[] args) {
        Animal animal1 = new Oiseau();
        Animal animal2 = new Poisson();
        animal1.manger("graines");
        animal2.manger("plancton");
        // On peut utiliser les sous classe comme Objet de classe mère
        ((Oiseau) animal1).voler();
        ((Poisson) animal2).nager();
    }
}

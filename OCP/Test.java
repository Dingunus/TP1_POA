package src.OCP;

public class Test implements IEmployee{
    private String name;
    @Override
    public void printEmployee() {
        System.out.println(name + " est en train de Tester !");   
    }
}

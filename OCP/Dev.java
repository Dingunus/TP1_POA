package src.OCP;

public class Dev implements IEmployee{
    private String name;
    @Override
    public void printEmployee() {
        System.out.println(name + " est en train de coder !");        
    }

}

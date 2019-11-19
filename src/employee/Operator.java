package employee;

public class Operator implements Employee {
    private double fixSalary;

    public Operator() {
        fixSalary = 20000;
        System.out.println("Вы наняли операциониста.");
    }

    @Override
    public double getMonthSalary() {
        return fixSalary;
    }

    public String toString()
    {
        return "операционист";
    }
}

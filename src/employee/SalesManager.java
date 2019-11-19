package employee;

public class SalesManager implements Employee{

    private double fixSalary;
    private double earningsForCompany;

    public SalesManager() {
        fixSalary = 30000;
        setEarningsForCompany();
        System.out.println("Вы наняли менеджера по продажам.");
    }

    private void setEarningsForCompany()
    {
        earningsForCompany = Math.round(Math.random() * 75000);
    }

    private double getEarningsForCompany()
    {
        return earningsForCompany;
    }


    @Override
    public double getMonthSalary() {
        double percent = 0.05;
        return fixSalary + (getEarningsForCompany() * percent);
    }

    public String toString()
    {
        return "менеджер по продажам";
    }
}

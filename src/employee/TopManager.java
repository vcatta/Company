package employee;

import company.Company;

public class TopManager implements Employee{

    private double fixSalary;
    private final int INCOME_FOR_BONUS = 10000000;
    private double bonus = Math.round(Math.random() * 50000 + 50000);
    private Company company;

    public TopManager(Company company) {
        this.company = company;
        fixSalary = 50000;
        System.out.println("Вы наняли топ-менеджера.");
    }


    @Override
    public double getMonthSalary() {
        if(company.getIncome() > INCOME_FOR_BONUS) {
            return fixSalary + bonus;
        }

        else{
            return fixSalary;
        }
    }

    public String toString()
    {
        return "топ-менеджер";
    }
}

import company.Company;
import employee.Employee;
import employee.Operator;
import employee.SalesManager;
import employee.TopManager;

import java.util.ArrayList;

public class Loader {

    public static void main(String[] args) {

        Company first = new Company(11000000);
        first.toHireStaff(generateListOfNewEmployees(270, first));
        System.out.println();
        first.toPaySalary();
        System.out.println();
        first.getTopSalaryStaff(5);
        System.out.println();
        first.getLowestSalaryStaff(5);

    }

    public static ArrayList generateListOfNewEmployees(int count, Company company)
    {
        ArrayList<Employee> listOfNewEmployees = new ArrayList<>();

        while(listOfNewEmployees.size() < count)
        {
            listOfNewEmployees.add(new SalesManager());
            listOfNewEmployees.add(new TopManager(company));
            listOfNewEmployees.add(new Operator());
        }
        return listOfNewEmployees;
    }
}

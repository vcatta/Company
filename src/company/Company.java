package company;

import employee.Employee;
import employee.EmployeeComparator;

import java.util.*;

public class Company {

    private int income;
    private ArrayList<Employee> listEmployee;

    public Company(int income) {
        this.income = income;
        listEmployee = new ArrayList<>();
    }


    public void toHireStaff(List listOfNewEmployees) {
        listEmployee.addAll(listOfNewEmployees);
        System.out.println("Вы наняли сотрудников. Размер штата: " + listEmployee.size());
        System.out.println("Доход компании составил: " + getIncome());

    }

    public int getIncome() {

        return income;
    }


    public void toPaySalary()
    {
        Collections.sort(listEmployee, new EmployeeComparator());
        for(Employee employee : listEmployee)
        {
            System.out.println(employee.getMonthSalary() + " руб. - зарплата сотрудника: " + employee.toString());
        }

    }

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        ArrayList<Employee> employeesTopSalary = new ArrayList<>(listEmployee.subList(0, count));
        System.out.println("Топ-сотрудников с самыми высокими зарплатами:");
        for(int i = 0; i < count; i++) {
            System.out.println((i + 1) + " - " + employeesTopSalary.get(i).toString() + " - " + employeesTopSalary.get(i).getMonthSalary());
        }

        return employeesTopSalary;

    }

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        ArrayList<Employee> employeesLowSalary = new ArrayList<>(listEmployee.subList(listEmployee.size() - count, listEmployee.size()));
        System.out.println("Топ-сотрудников с самыми низкими зарплатами:");
        for(int i = count - 1; i >= 0; i--) {
            System.out.println((count - i) + " - " + employeesLowSalary.get(i).toString() + " - " + employeesLowSalary.get(i).getMonthSalary());
        }

        return employeesLowSalary;

    }

    public void toFireEmployee(int indexEmployee)
    {
        listEmployee.remove(indexEmployee);
        System.out.println("Вы уволили сотрудника. Размер штата: " + listEmployee.size());
    }
}

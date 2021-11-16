package Employee;

import Employee.Employee;

public class Main {
    public static void main(String[] args) {
        // Employee employeeVasya = new Employee(1, "Vasya", "Tel-Ran", 2000);
        OfficeEmployee officeEmployeePetya = new OfficeEmployee(2, "Petya", "Tel-Ran", 2500, 300);

        Manager managerStepan = new Manager(3, "Stepan Stepanovich", "Tel-Ran", 2000, 2.5);
        Employee hourEmployeeTanya = new HourBasedEmployee(4, "Tatiana", "Tel-Ran", 2500, 150);

        // System.out.println(employeeVasya.getSalary());
        System.out.println(officeEmployeePetya.getSalary());
        System.out.println(managerStepan.getSalary());
        System.out.println(hourEmployeeTanya.getSalary());


        Employee[] employees = {officeEmployeePetya, managerStepan, hourEmployeeTanya};
        //  OfficeEmployee petya = (OfficeEmployee) employees[1];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("The employee " + employees[i].getName() + " has salary " + employees[i].getSalary());

        }
    }
}

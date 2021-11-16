package Employee;

public class HourBasedEmployee extends Employee {
    int monthlyHours;

    public HourBasedEmployee(int id, String name, String companyName, int basicSalary, int monthlyHours) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
        this.monthlyHours = monthlyHours;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    @Override
    public int getSalary() {

        return super.getSalary() * monthlyHours / 180;
    }
}

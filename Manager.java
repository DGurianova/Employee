package Employee;

public class Manager extends Employee {
    double coef;

    public Manager(int id, String name, String companyName, int basicSalary, double coef) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
        this.coef = coef;
    }

    @Override
    public int getSalary() {

        return (int) (super.getSalary() * coef);
    }
}


package Employee;

public class OfficeEmployee extends Employee {
    int monthlyBonus;

    public OfficeEmployee(int id, String name, String companyName, int basicSalary, int monthlyBonus) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.basicSalary = basicSalary;
        this.monthlyBonus = monthlyBonus;
    }

    public int getMonthlyBonus() {

        return monthlyBonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + monthlyBonus; //return basicSalary+monthlyBonus //getbasicSalary+monthlyBonus
    }


}

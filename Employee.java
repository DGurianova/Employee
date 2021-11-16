package Employee;

public abstract class Employee {
    int id;
    String name;
    String companyName;
    protected int basicSalary; //protected - видно в насл

    public int getSalary() {

        return basicSalary;
    }

//    public Employee(int id, String name, String companyName, int basicSalary) {
//        this.id = id;
//        this.name = name;
//        this.companyName = companyName;
//        this.basicSalary = basicSalary;
//    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCompanyName() {

        return companyName;
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public int getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {

        this.basicSalary = basicSalary;
    }
}

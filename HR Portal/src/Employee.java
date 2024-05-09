//This abstract class sets the template of what an employee is using common factors such as a name, id, and years_employed.
//It also sets up the functions being used to grab the employees name and pay.
abstract class Employee {
    protected String name;
    protected String id;
    protected int years_employed;
    protected Department department;

    public Employee(String name, String id, int years_employed, Department department){
        this.name=name;
        this.id=id;
        this.years_employed=years_employed;
        this.department = department;
    }

    protected abstract Department getDepartment();

    //Calculates Employee pay
    protected abstract double calculate_raise();

    //Gets Employee Name
    public abstract String getName();

    //Write Employee data to display
    public abstract String toString();
}

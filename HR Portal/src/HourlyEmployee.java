class HourlyEmployee extends Employee{
    //Is-A Employee
    //Has-A Department
    double wage;

    public HourlyEmployee(String name, String id, int years_employed, double wage, Department department){
        super(name, id, years_employed, department);
        wage = wage + calculate_raise();
        this.wage = wage;
    }
    @Override
    public Department getDepartment(){
        return department;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double calculate_raise(){
        //Hourly Employees get a $1.25 raise every year
        return 1.25 * years_employed;
    }
    @Override
    public String toString(){
        return "Name: "+ this.name + "\nID: " + this.id + "\nYears Employed: " + this.years_employed + "\nHourly Rate: " + this.wage+ "\nDepartment: "+ this.department.getName();
    }
}
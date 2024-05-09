class SalariedEmployee extends Employee{
    //Is-A Employee
    //Is-A Salaried Employee
    //Has-A Department
    double wage;
    double raisevalue;

    public SalariedEmployee(String name, String id, int years_employed, double wage, Department department){
        super(name, id, years_employed, department);
        this.raisevalue = wage;
        wage = wage + calculate_raise();
        this.wage = wage;
    }
    @Override
    public Department getDepartment(){
        return department;
    }

    public double getWage(){
        return wage;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double calculate_raise(){
        //Salaried employees recieve a 5% increase in pay every year
        return years_employed*raisevalue*.05;
    }
    @Override
    public String toString(){
        return "Name: "+ this.name + "\nID: " + this.id + "\nYears Employed: " + this.years_employed + "\nHourly Rate: " + this.wage+ "\nDepartment: "+ this.department.getName();
    }
}
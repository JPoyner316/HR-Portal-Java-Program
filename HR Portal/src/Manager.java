class Manager extends SalariedEmployee{
    //Is-A Employee
    //Is-A Salaried Employee
    //Has-A Department
    double wage;
    double raisevalue;

    public Manager(String name, String id, int years_employed, double wage, Department department){
        super(name, id, years_employed, wage , department);
        this.raisevalue = wage;
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
        /*A manager is a salaried employee thus getting a 5% increase in pay every year worked
        and is a manager employee thus recieving a 1000 dollar bonus every year*/
        return super.calculate_raise() + 1000;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
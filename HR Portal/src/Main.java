//Jackson D. Poyner
//February 16th 2023
/*This program is designed to be an hr portal that takes
* information about an employee such as name, pay, department, etc.
* and displays such information in a meaningful way */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Create Departments
        Department kitchenStaff = new Department("Kitchen Staff");
        Department frontCounter = new Department("Front Counter");
        Department management = new Department("Management");

        //Create Employees
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Corbin", "H930R",2,12.50,kitchenStaff);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Liam", "H250R",4,13.75,kitchenStaff);
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Sonia", "S320R",9,16.30,frontCounter);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Chloe", "S680R",6,15.30,frontCounter);
        Manager manager1 = new Manager("Derek","M835",9,20,management);
        Manager manager2 = new Manager("Jeremey","M765",12,22.30,management);

        //Prints General Employee Information
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(hourlyEmployee1);
        employees.add(hourlyEmployee2);
        employees.add(salariedEmployee1);
        employees.add(salariedEmployee2);
        employees.add(manager1);
        employees.add(manager2);
        System.out.println("General Employee Information:\n");
        generalInfo(employees);

        //Print Salary Employee Wages
        ArrayList<SalariedEmployee> salariedEmployees = new ArrayList<SalariedEmployee>();
        salariedEmployees.add(salariedEmployee1);
        salariedEmployees.add(salariedEmployee2);
        System.out.println("Salaried Employee Wages:\n");
        paymentInfo(salariedEmployees);
        System.out.println("\n");

        //Print mapping for Employee-Department
        System.out.println("Employee Department Information:\n");
        HashMap<String, Department> employeeDepartments = employeeDepartmentInfo(employees);
        for (Map.Entry<String, Department> entry : employeeDepartments.entrySet()){
            //Searches for Employees Department
            searchEmployeeDepartmentInfo(entry.getKey(), employeeDepartments);
            System.out.println("");
        }
    }

//Generic method that prints general employee information from an Arraylist of employees
    public static <T> void generalInfo(ArrayList<T> info){
        for (T item : info){
            System.out.println(item.toString());
            System.out.println("\n");
        }
    }

    //Upper Bounded Wildcard Method for printing SalariedEmployee Wages
    public static void paymentInfo(ArrayList<? extends SalariedEmployee> info){
        for (SalariedEmployee employee : info){
            System.out.println(employee.getName() + " Current Wage: $" + employee.getWage() + "\n");
        }
    }

    //Hashmap that returns employee name and department
    public static HashMap<String, Department> employeeDepartmentInfo(ArrayList<Employee> employees){
        HashMap<String, Department> map = new HashMap<String, Department>();
        for (Employee employee : employees) {
            map.put(employee.getName(), employee.getDepartment());
        }
        return map;
    }

    //Hashmap that searches for employees name and department
    public static void searchEmployeeDepartmentInfo(String name, HashMap<String, Department> map){
        if (map.containsKey(name)){
            System.out.println(name + " Currently works in " + map.get(name).getName() + " department.");
        } else{
            System.out.println("Employee " + name + "not found in the HashMap");
        }
    }
}
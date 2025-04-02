class EmployeeSalaryDetails {
    public static void main(String[] args) {  
        Employee e1 = new HourlyEmployee("Bala", 3, 12, 1000);  
        Employee e2 = new SalariedEmployee("Mugesh", 17, 43543.97);
        
        e1.display();
        e2.display();
    }
}

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) { 
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    abstract double calculatePay();
}

class HourlyEmployee extends Employee {  
    int hours;
    double hourlyRate;

    public HourlyEmployee(String name, int id, int hours, double hourlyRate) {  
        super(name, id);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    
    public double calculatePay() {  
        return hours * hourlyRate;
    }

    
    public void display() {  
        super.display();
        System.out.println("Salary: " + calculatePay());
    }
}

class SalariedEmployee extends Employee {  
    double salary;

    SalariedEmployee(String name, int id, double salary) {  
        super(name, id);
        this.salary = salary;
    }

    
    public double calculatePay() {  
        return salary;
    }

    
    public void display() {  
        super.display();
        System.out.println("Salary: " + calculatePay());
    }
}

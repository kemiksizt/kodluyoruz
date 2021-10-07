
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    
    void run(){
        toMyString();
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("New Salary : " + calculateNewSalary());
    }
    
    
    double tax(){
        double tax = 0;
        if(this.salary < 1000){
            return tax;
        }
        else{
            tax = this.salary * 0.03;
            return tax;
        }
    }
    
    
    
    double bonus(){
        double bonus = 0;
        if(this.workHours > 40){
            bonus = (workHours - 40) * 30;
            return bonus;
        }
        else{
            return 0;
        }
    
    }
    
    
    
    double raiseSalary(){
        double raising = 0;
        if((2021 - this.hireYear) < 10){
            raising = this.salary * 0.05;
            return raising;
        }
        
        else if((2021 - this.hireYear >= 10) && (2021 - this.hireYear) < 20){
            raising = this.salary * 0.1;
            return raising;
        }
        
        else{
            raising = this.salary * 0.15;
            return raising;
        }
        
    }
    
    double calculateNewSalary(){
        tax();
        bonus();
        raiseSalary();
        return (this.salary + bonus() + raiseSalary() - tax());
        
    }
    
    
    
    void toMyString(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work Hours : " + this.workHours);
        System.out.println("Hire Year : " + this.hireYear);
    }
    
    
}

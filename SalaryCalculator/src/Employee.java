
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    
    void start(){
    
        toMyString();
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Raise Salary : " + raiseSalary());
        System.out.println("New Salary : " + calculateSalary());
        
        
        
        
    }
    
    
    double tax(){
        
        double tax = 0;
        
        if(this.salary < 1000){
            return tax;
            
        }
        
        else {
            tax = this.salary * 0.03;
            return tax;
        }
        
    }
    
    double calculateSalary(){
        tax();
        bonus();
        raiseSalary();
        
        return (this.salary + this.bonus() + this.raiseSalary() - this.tax());
    }
    
    
    double bonus(){
        
        double bonus = 0;
        
        if(this.workHours >= 40){
            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        
        else{
            return bonus;
        }
        
    }
    
    
    double raiseSalary(){
        
        double rising = 0;
        
        if(2021 - this.hireYear < 10){
            rising = this.salary * 0.05;
            return rising;
        }
        
        else if(10 <= (2021 - this.hireYear) && (2021 - this.hireYear) < 20 ){
            rising = this.salary * 0.1;
            return rising;
        }
        
        else{
            rising = this.salary * 0.15;
            return rising;
        }
        
        
    }
    
    
    void toMyString(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("Work hours : " + this.workHours);
        System.out.println("Hire year : " + this.hireYear);
    }
    
    
    
}

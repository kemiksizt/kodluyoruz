
import java.util.Scanner;


public class AdvancedCalculator {
    
    static void plus(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you enter ?: ");
        int number = scanner.nextInt();
        int result = 0;
        
        for(int i = 1; i <= number; i++){
            System.out.print(i + ". number : ");
            int a = scanner.nextInt();
            result += a;
        }
        
        System.out.println("Result : " + result);
               
    }
    
    static void minus (){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you enter ?: ");
        int number = scanner.nextInt();
        int result = 0;
        
        for(int i = 1; i <= number; i++){
            System.out.print(i + ". number : ");
            int a = scanner.nextInt();
            
            if(i == 1){
                result += a;
                continue;
            }
            result -= a;
        }
        System.out.println("Result : " + result);
        
        
    }
    
    static void multiply(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you enter ?: ");
        int number = scanner.nextInt();
        int result = 1;
        
        for(int i = 1; i <= number; i++){
            System.out.print(i + ". number : ");
            int a = scanner.nextInt();
            result *= a;
        }
        
        System.out.println("Result : " + result);
    }
    
    static void division(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you enter ?: ");
        double number = scanner.nextInt();
        double result = 0.0;
        
         for(int i = 1; i <= number; i++){
            System.out.print(i + ". number : ");
            int a = scanner.nextInt();
            
            
            if(i == 1){
                result = a;
                continue;
            }
            
            if(number == 0){
                System.out.println("Can not enter 0");
                continue;
            }
            
            result /= a;
            
        }
        
        System.out.println("Result : " + result);
    }
    
    
    static void power(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Base : ");
        int base = scanner.nextInt();
        System.out.print("Exponent : ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        
        System.out.println(result);
        
    }
    
    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number : ");
        int n = scanner.nextInt();
        int result = 1;
        
        if(n != 1 || n != 0){
            for(int i = 2; i <= n; i++){
                result *= i;
            }
        }
        
        else{
            result = 1;
        }
        
        System.out.println(result);
    }
    
    static void mod(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number : ");
        int number = scanner.nextInt();
        System.out.print("Mod : ");
        int mod = scanner.nextInt();
        int result = 0;
        
        int quotient = number / mod;
        result = number - (quotient*mod);
        
        System.out.println(result);
        
    }
    
    static void Rectangle_area_perimeter(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        
        int area = a * b;
        int perimeter = 2 * (a + b);
        
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       String menu = "1- Sum\n"
                + "2- Minus\n"
                + "3- Multiply\n"
                + "4- Division\n"
                + "5- Power\n"
                + "6- Factorial\n"
                + "7- Mod\n"
                + "8- Rectangle Area and Perimeter\n"
                + "0- Exit";
       
       int select;
       
       do{
           System.out.println(menu);
           System.out.print("Choose : ");
           select = scanner.nextInt();
           
           switch(select){
               case 1:
                   plus();
                   break;
               case 2:
                   minus();
                   break;
               case 3:
                   multiply();
                   break;
               case 4:
                   division();
                   break;
               case 5:
                   power();
                   break;
               case 6:
                   factorial();
                   break;
               case 7:
                   mod();
                   break;
               case 8:
                   Rectangle_area_perimeter();
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Wrong Value...");
                   break;
           
           }
       }while (select != 0);
       
       
        
    }
    
}

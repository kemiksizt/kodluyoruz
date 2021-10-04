
import java.util.Scanner;


public class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("First Number : ");
        double n1 = scanner.nextDouble();
        System.out.print("Second Number : ");
        int n2 = scanner.nextInt();
        
        
        System.out.println("1 - Addition\n2 - Substraction\n3 - Multiplication\n4 - Division");
        System.out.print("Choose your operation : ");
        int operation = scanner.nextInt();
        
        
        switch(operation){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Try again...");
                       
                       
                
        }
        
        
    }
    
}


import java.util.Scanner;


public class Power {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Base : ");
        int b = scanner.nextInt();
        System.out.print("Exponent : ");
        int e = scanner.nextInt();
        int result = 1;
        
        for(int i = 1; i <= e; i++){
            result *= b;
            
        }
        System.out.println("Result : " + result);
        
    }
    
}

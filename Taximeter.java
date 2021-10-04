
import java.util.Scanner;


public class Taximeter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many kilometers will you go ?: ");
        int km = scanner.nextInt();
        
        double amount = 10;
        amount += 2.20 * km;
        
        if(amount <= 20){
            amount = 20;
            System.out.println("Amount is : " + amount);
        }
        else{
            System.out.println("Amount is : " + amount);
        }
        
        
        
    }
    
}

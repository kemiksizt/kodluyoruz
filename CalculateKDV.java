
import java.util.Scanner;


public class CalculateKDV {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Amount : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        double kdv;
        
        if(0 < amount && amount < 1000){
            kdv = amount * 0.18;
            System.out.println("Amount with KDV : " + (amount+kdv));
            System.out.println("KDV : " + kdv);
        }
        else{
            kdv = amount * 0.08;
            System.out.println("Amount with KDV : " + (amount+kdv));
            System.out.println("KDV : " + kdv);
        }
        
        
    }
    
}

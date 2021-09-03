
import java.util.Scanner;


public class FindingEvenNumbersWithControl {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        
        while(true){
            System.out.print("Enter your number : ");
            int number = scanner.nextInt();
            
            if(number % 4 == 0){
                total += number;
            }
            else if(number % 2 == 1){
                System.out.println("Quit...");
                break;
            }
            
           
        }
        
        System.out.println("Total is : " + total);
        
        
        
    }
}


import java.util.Scanner;


public class FindingEvenNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        int total = 0;
        double count = 0;
        
        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 || i % 4 == 0){
                total += i;
                count++;
            }
        }
        
        System.out.println("Average is " + (total/count));
        
    }
    
}

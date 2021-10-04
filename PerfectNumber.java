
import java.util.Scanner;


public class PerfectNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int divider = 0;
        
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                divider += i;
            }
        }
        
        if(number == divider){
            System.out.println(number + " is Perfect Number");
        }
        else{
            System.out.println(number + " is NOT Perfect Number");
        }
        
    }
    
}


import java.util.Scanner;
import sun.tools.jar.resources.jar;


public class PowerOfNumbersInRange {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int number = scanner.nextInt();
        
        
        for(int i = 4 ; i <= number; i = i*4){
            if(i <= number){
                System.out.print(i + " ");
            }
            else{
                break;
            }
        }
        
        for(int j = 5; j <= number; j = j*5){
            if(j <= number){
                System.out.print(j + " ");
            }
            else{
                break;
            }
        }
        
        
        
    }
    
}

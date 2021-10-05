
import java.util.Scanner;


public class Design {
    
    public static void patternRecursive(int num, int control, boolean patternControl) {
        System.out.print(control + " ");
        if (!patternControl && num == control){ 
            return;
        }
        
        if (patternControl) {
            patternRecursive(num, control - 5, control - 5 > 0);
        }
        
        else {
            patternRecursive(num, control + 5, false);
        }
    }
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("number : ");
        int num = scanner.nextInt();
        patternRecursive(num, num, true);
        
    }
    
}

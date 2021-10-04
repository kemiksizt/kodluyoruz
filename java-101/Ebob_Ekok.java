
import java.util.Scanner;


public class Ebob_Ekok {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number1 : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter your number2 : ");
        int n2 = scanner.nextInt();
        int ekok = 1;
        int ebob = 1;
        
        
        for(int i = 2; i <= n1*n2; i++){
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
        }
        
        for(int j = 2; j <= n1 && j <= n2; j++){
            if(n1 % j == 0 && n2 % j == 0){
                ebob = j;
            }
        }
        
        System.out.println("Ekok : " + ekok);
        System.out.println("Ebob : " + ebob);
        
    }
    
}

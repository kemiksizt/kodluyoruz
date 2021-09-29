
import java.util.Scanner;


public class main {
    
    
    public static boolean RecursivePrime(int x, int i){
        
        if(x == 1){
            return false;
        }
        
        if(x == i){
            return true;
        }
        else if(x % i == 0){
            return false;
        }
        
        return RecursivePrime(x, i+1);
    
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 2;
        
        System.out.println(RecursivePrime(x, i) ? "Prime" : "Not Prime");
        
        
    }
    
}

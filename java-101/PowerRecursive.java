
import java.util.Scanner;


public class PowerRecursive {
    
    static int power(int base, int exponent){
        
            if(exponent != 0){
                return base * power(base,exponent - 1);
            }
            
            else{
                return 1;
            }
            
        
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(power(3,5));
    }
    
}

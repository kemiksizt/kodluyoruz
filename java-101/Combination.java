
import java.util.Scanner;


public class Combination {
    
    private static int factorial(int a){
        int total = 1;
        
        for(int i = 2; i <= a; i++){
            total *= i;
            
        }
        return total;
    }
    
    private static double combinationCalculate(int n, int r){
        
        double result = 0;
        
        result = factorial(n)/(factorial(r)* factorial(n-r));
        
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println(combinationCalculate(8, 4));
        
                
    }
}

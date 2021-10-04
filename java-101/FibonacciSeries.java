
public class FibonacciSeries {
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        int backup = 0;
        
        while(n3 < 100){
            
            
            System.out.println(n1 + " + " + n2 + " = " + n3);
            
            backup = n3;
            n1 = n2;
            n2 = backup;
            n3 = n1 + n2;
            
            
        }
        
    }
    
}

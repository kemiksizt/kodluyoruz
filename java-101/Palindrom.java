
public class Palindrom {
    
    public static void palindrom(int n){
        int reverse = 0;
        int old = n;
        
        while (n > 0){
            reverse =  10*reverse + (n % 10);
            n /= 10;
        }
        
        if(old == reverse){
            System.out.println(old + " is Palindrom");
        }
        else{
            System.out.println(old + " is NOT Palindrom");
        }
        
    }
    
    public static void main(String[] args) {
        
        palindrom(1551);
        
        
    }
    
}

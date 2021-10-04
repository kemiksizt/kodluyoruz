
import java.util.Scanner;


public class SortingNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("number1 : ");
        int n1 = scanner.nextInt();
        System.out.print("number2 : ");
        int n2 = scanner.nextInt();
        System.out.print("number3 : ");
        int n3 = scanner.nextInt();
        
        if(n1 < n2 && n1 < n3){
            if(n2 < n3){
                System.out.println("n1 < n2 < n3");
            }
            else if(n3 < n2){
                System.out.println("n1 < n3 < n2");
            }
            
        }
        
        else if(n2 < n1 && n2 < n3){
            if(n1 < n3){
                System.out.println("n2 < n1 < n3");
            }
            else if(n3 < n1){
                System.out.println("n2 < n3 < n1");
            }
                    
        }
        
        else if(n3 < n2 && n3 < n1){
            if(n1 < n2){
                System.out.println("n3 < n1 < n2");
            }
            else if(n2 < n1){
                System.out.println("n3 < n2 < n1");
            }
            
        }
        
        else{
            System.out.println("n1 = n2 = n3");
        }
                
        
        
    }
    
}

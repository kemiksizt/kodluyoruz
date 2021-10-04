
import java.util.Scanner;


public class FindingMaxAndMin {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you enter : ");
        int N = scanner.nextInt();
        int max = 0,min = 0;
        
        for(int i = 1; i <= N; i++){
            System.out.print(i + ". Number : ");
            int n = scanner.nextInt();
            
            if(i == 1){
                max = i;
                min = i;
            }
            
            if(n > max){
                max = n;
            }
            
            if(n < min){
                min = n;
            }
            
        }
        
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        
    }
    
}

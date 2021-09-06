
import java.util.Scanner;


public class InverseTriangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Row Number : ");
        int row = scanner.nextInt();
        int row2 = row;
        int space = 0;
        
        for(int i = 1; i <= row2; i++){
            
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*row-1; k++){
                System.out.print("*");
            }
            
            System.out.println("");
            row--;
            space++;
        }
        
    }
    
}

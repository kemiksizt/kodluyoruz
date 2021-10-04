
import java.util.Scanner;


public class DiamondWithStars {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int row = scanner.nextInt();
        scanner.nextLine();
        int row2 = row;
        int space = row - 1;
        

        
        for(int i = 1; i <= row; i++){
            
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k < 2*i - 1; k++){
                System.out.print("*");
            }
            
            space--;
            System.out.println();
        }
        
        row--;
        space = 1;
        row2 = row;
        
        
       
        for (int i = 1; i <= row ; i++){
            
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            
            for(int k = 0; k < 2*row2 -1; k++){
                System.out.print("*");
            }
            row2--;
            space++;
            System.out.println();
        }
         
        }
    
        
        
    }
    



import java.util.Scanner;


public class BodyMassIndex {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Your height(Example 1,80) : ");
        double height = scanner.nextDouble();
        System.out.print("Your mass(Example 100) : ");
        int mass = scanner.nextInt();
        
        double index = mass / (Math.pow(height, 2));
        
        if(0 < index && index <= 18.4){
            System.out.println("Your index is : " + index + " and your body type is weak. ");
        }
        if(18.5 <= index && index <= 24.9){
            System.out.println("Your index is : " + index + " and your body type is normal. ");
        }
        if(25 <= index && index <= 29.9){
            System.out.println("Your index is : " + index + " and your body type is overweight. ");
        }
        if(30 <= index && index <= 34.9){
            System.out.println("Your index is : " + index + " and your body type is fat. ");
        }
        
        
    }
    
}

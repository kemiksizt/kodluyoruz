
import java.util.Scanner;


public class SquareArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Square radius : ");
        int r = scanner.nextInt();
        System.out.print("Square angle : ");
        int a = scanner.nextInt();
        
        double area = (Math.PI * r * r * a)/360;
        
        System.out.println("Area : " + area);
                
                
        
    }
    
}

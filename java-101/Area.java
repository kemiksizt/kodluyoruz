
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter your side lengths ");
        System.out.print("a : ");
        int a = scanner.nextInt();
        System.out.print("b : ");
        int b = scanner.nextInt();
        System.out.print("c : ");
        int c = scanner.nextInt();
        
        int u = (a+b+c) / 2;
        double area;
        
        area = Math.pow((u*(u-a) * (u-b) * (u-c)),0.5);
        
        System.out.println(area);
        
        
        
        
    }
    
}

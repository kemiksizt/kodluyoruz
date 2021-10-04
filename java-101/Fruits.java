
import java.util.Scanner;


public class Fruits {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Pear kg : ");
        int pear = scanner.nextInt();
        System.out.print("Apple kg : ");
        int apple = scanner.nextInt();
        System.out.print("Tomato kg : ");
        int tomato = scanner.nextInt();
        System.out.print("Banana kg : ");
        int banana = scanner.nextInt();
        System.out.print("Aubergine kg : ");
        int aubergine = scanner.nextInt();
        
        double total = (pear*2.14 + apple*3.67 + tomato*1.11 + banana*0.95 + aubergine*5);
        
        System.out.println("Total : " + total);
        
    }
    
}


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        int  math, physics, chem, turkish, history, music;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Math : ");
        math = scanner.nextInt();
        System.out.print("Physics : ");
        physics = scanner.nextInt();
        System.out.print("Chemical : ");
        chem = scanner.nextInt();
        System.out.print("Turkish : ");
        turkish = scanner.nextInt();
        System.out.print("History : ");
        history = scanner.nextInt();
        System.out.print("Music : ");
        music = scanner.nextInt();
        
        double average = (math + physics + chem + turkish + history + music) / 6;
        
        System.out.println("Average is : " +average);
        
    }
    
}

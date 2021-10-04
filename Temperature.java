
import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Temperature : ");
        int temp = scanner.nextInt();
        
        if(temp <= 5)
            System.out.println("Go skiing");
        else if(5 <= temp && temp <= 10)
            System.out.println("Go to cinema");
        else if(10 <= temp && temp <= 15)
            System.out.println("Go to cinema or picnic");       
        else if(15 <= temp && temp <= 25)
            System.out.println("Go to picnic");
        else
            System.out.println("Go swimming");
        
        
    }
}

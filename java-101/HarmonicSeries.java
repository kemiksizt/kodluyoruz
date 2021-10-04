
import java.util.Scanner;


public class HarmonicSeries {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        double harmonic = 0.0;
        
        for(double i = 1; i <= number; i++){
        
            harmonic += (1/i);
        }
        
        System.out.println("Harmonic series : " + harmonic);
        
    }
    
}

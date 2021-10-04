
import java.util.Scanner;


public class Horoscope {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Day: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Month: ");
        String month = scanner.nextLine();
        
        if((day >= 21 && month.equals("march")) || (day <= 20 && month.equals("april")))
            System.out.println("Aries");
        else if((day >= 21 && month.equals("april")) || (day <= 21 && month.equals("mai")))
            System.out.println("Taurus");
        else if((day >= 22 && month.equals("mai")) || (day <= 22 && month.equals("june")))
            System.out.println("Gemini");
        else if((day >= 23 && month.equals("june")) || (day <= 22 && month.equals("july")))
            System.out.println("Cancer");
        else if((day >= 23 && month.equals("july")) || (day <= 22 && month.equals("august")))
            System.out.println("Leo");
        else if((day >= 23 && month.equals("august")) || (day <= 22 && month.equals("september")))
            System.out.println("Virgo");
        else if((day >= 23 && month.equals("september")) || (day <= 22 && month.equals("october")))
            System.out.println("Libra");
        else if((day >= 23 && month.equals("october")) || (day <= 21 && month.equals("november")))
            System.out.println("Scorpio");
        else if((day >= 22 && month.equals("november")) || (day <= 21 && month.equals("december")))
            System.out.println("Sagitarius");
        else if((day >= 22 && month.equals("december")) || (day <= 21 && month.equals("january")))
            System.out.println("Capricorn");
        else if((day >= 22 && month.equals("january")) || (day <= 19 && month.equals("february")))
            System.out.println("Aquarius");
        else if((day >= 20 && month.equals("february")) || (day <= 20 && month.equals("march")))
            System.out.println("Pisces");
        else{
            System.out.println("Try again...");
        }
            
        
        
    }
    
}

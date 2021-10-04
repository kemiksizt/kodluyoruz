
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class FlightTicket {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Distance(km) : ");
        int distance = scanner.nextInt();
        System.out.print("Age : ");
        int age = scanner.nextInt();
        System.out.print("Trip type(1 - departure, 2 - departure,arrival) : ");
        int trip_type = scanner.nextInt();
        
        double total = distance * 0.1;
        double age_discount = 0;
        double type_discount = 0;
        
        if(age >= 1 && (trip_type == 1 || trip_type == 2)){
            
            if(age < 12){
                total *= 0.5;
                
            }
            else if(12 <= age && age < 24){
                total *= 0.9;
            }
            else if(age >= 65){
                total *= 0.7;
            }
            
            if(trip_type == 2){
                total = 2 * (total * 0.8);
            }
       
            System.out.println("Total : " + total);
        }
        else{
            System.out.println("Wrong Value !");
            
        }
        
        
        
    }
    
}


import java.util.Scanner;


public class PassClass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Unless your notes should be 0 between 100, can't add in average");
        System.out.print("Enter the notes in order (Math, Physics, Turkish, Chemistry, Music):");
        int total = 0;
        for(int i = 0; i <= 4; i++){
            int grade = scanner.nextInt();
            
            if(0 <= grade && grade <= 100){
                total += grade;
            } 
        }
        double average = total / 5.0;
        
        if(average >= 55)
            System.out.println("Your Grade is : " + average + " Pass!");
        else
            System.out.println("Your Grade is : " + average + " Fail!");
        
        
        
        
        
    }
    
}

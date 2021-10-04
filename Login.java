
import java.util.Scanner;


public class Login {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String username = "turabkemiksiz";
        String password = "12345";
        
        System.out.print("Username : ");
        String username1 = scanner.nextLine();
        System.out.print("Password : ");
        String password1 = scanner.nextLine();
        
        
        if(username.equals(username1) && password.equals(password1)){
            System.out.println("Login successful");
        }
        else{
            System.out.print("Do you want to reset your password ?(yes or no) : ");
            String desicion = scanner.nextLine();
            
            if(desicion.equals("yes")){
                while(true){
                    System.out.print("Enter your new password : ");
                    String password_new = scanner.nextLine();
                    
                    if(password_new.equals(password)){
                        System.out.println("Cannot be the same previous one, Try again...");
                        
                    }
                    else{
                        password = password_new;
                        System.out.print("Password changed!");
                        break;
                    }
                }
                
            }
            
            else{
                System.out.println("Exit...");
            }
        }
        
    }
    
}

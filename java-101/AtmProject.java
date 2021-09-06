
import java.util.Scanner;


public class AtmProject {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String process = "Choose Your Process\n"
                       + "1- Deposit Money\n"
                       + "2- Withdraw Money\n"
                       + "3- Balance Query\n"
                       + "4- Exit";
             
        
        int right = 3;
        String username = "turabkemiksiz";
        String password = "12345";
        int balance = 2000;
        
        
        while(right > 0){
            
            System.out.println("Welcome to ATM");            
            System.out.print("Username : ");
            String username1 = scanner.nextLine();
            System.out.print("Password : ");
            String password1 = scanner.nextLine();
            
            if(username.equals(username1) && password.equals(password1)){
                System.out.println(process);
                String choose = scanner.nextLine();
                
                if(choose.equals("1")){
                    System.out.print("How much do you want to deposit : ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("New Balance : " + (balance += amount));
                }
                
                else if(choose.equals("2")){
                    System.out.print("How much do you want to withdraw : ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(amount > 1000){
                        System.out.println("You can't withdraw this amount(MAX 1000)");
                    }
                    else{
                        System.out.println("New Balance : " + (balance -= amount));
                    }
                
                }
                
                else if(choose.equals("3")){
                    System.out.println("Current Balance : " + balance);
                }
                
                else if(choose.equals("4")){
                    System.out.println("Exit...");
                    break;
                }
                else{
                    System.out.println("Wrong Process, Try again...");
                }
                    
                
            }
            
            else{
                right--;
                System.out.println("Wrong username or password. Your rights : " + right);
                
                if(right == 0){
                    System.out.println("Exit ! ");
                }
            }
        
            
            
        }
        
        
        
    }
    
}

import java.util.*;
public class GuessNumber {
    
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        
        System.out.println(number);
        
        int right = 5;
        int selected;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrong = new int[5];
        
        while(right > 0){
            
            System.out.print("Tahmininizi girin : ");
            selected = scanner.nextInt();
            
            if(0 > selected || selected > 100){
                if(!isWrong){
                    System.out.println("Bir sonraki hatalı girişte hakkınızdan düşülecektir...");
                    isWrong = true;  
                }
                
                else{
                    
                    wrong[5-right] = selected; 
                    right--;
                    System.out.println("Hatalı giriş yaptınız.Kalan hakkınız : " + right);
                    
                }
                continue;
            }
            
            if(selected == number){
                System.out.println("Tebrikler, kazandınız !");
                isWin = true;
                break;
            }
            
            else{
                
                if(selected < number){
                    System.out.println("Aranan sayı daha büyük...");
                }
                else{
                        System.out.println("Aranan sayı daha küçük...");
                }
                
                wrong[5-right] = selected;
                right--;
                
                
                System.out.println("Kalan hakkınız : " + right);
                
                
            }
            
            
        }
        
        if(!isWin){
                System.out.println("Kaybettiniz!");
            }
                
            else{
                System.out.println("Tahminleriniz : " );
                for(int i = 0; i < wrong.length; i++){
                    if(wrong[i] != 0){
                        System.out.print(wrong[i] + " ,");
                    }
                }
            }
        
        
        
    }
    
}

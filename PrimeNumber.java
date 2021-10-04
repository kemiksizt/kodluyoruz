
public class PrimeNumber {
    public static void main(String[] args) {
        
        
        
        for(int i = 2; i <= 100; i++)
        {
            int counter = 0;
            for (int j = 2; j < i; j++)
            {
               if (i % j == 0)
                {
                    counter = 1;
                    break;
                } 
            }
                
            if(counter==0)
            {
                System.out.print(i + " "); 
            }
        }
       
        
    }
    
}

import java.util.Arrays;

public class ArrayFrequency {
    
    
    
    public static void main(String[] args) {
        
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int counter = 0;
        
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(list[i] == list[j]){
                    for(int k = 0; k < i; k++){
                        if(list[k] == list[i]){
                            counter = -1;
                        }
                    }
                    
                    counter++;
                }
            }
            
            if(counter != 0){
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            
            counter = 0;
        }
        
        
        
        
        
    }
    
}

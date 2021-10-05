import java.util.Arrays;
public class RepeatingNumber {
    
    
    static boolean isHas(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        
        int[] list = {1,4,6,9,3,7,4,1,3};
        
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
            
                if(i != j && list[i] == list[j]){
                    if(!isHas(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                        
                    }
                    break;
                }
            }
        }
        
        
        for(int value : duplicate){
            if(value != 0 && value %2 == 0){
                System.out.println(value);
            }
        }
        
    }
}

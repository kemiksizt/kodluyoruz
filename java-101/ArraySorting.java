import java.util.Scanner;
import java.util.Arrays;

public class ArraySorting {
    
    public static int[] SortArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int tempValue = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempValue;
                }
            }
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Length of array : ");
        int range = scanner.nextInt();
        
        int[] list = new int[range];
        
        for(int i = 0; i < range; i++){
            System.out.print(i + ". Elemanı : " );
            list[i] = scanner.nextInt();
        }
        
        SortArray(list);
        
        System.out.println(Arrays.toString(list));
        
    }
    
}

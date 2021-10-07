import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HelperArray helper = new HelperArray();



        int[] array = {5, 15, 548, 231, -41, 78, -32, 10, 0, 30};
        int min = array[0];
        int max = array[0];
        int kucukEnYakin;
        int buyukEnYakin;

        for (int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maksimum Değer: " + max);
       
                
        System.out.print("Bir Sayı Girin: ");
        int n = scanner.nextInt();

        kucukEnYakin = helper.findSmallest(array, n);
        buyukEnYakin = helper.findBiggest(array, n);
        System.out.printf("%s'ten Küçük En Yakın Sayı: %s\n", n, kucukEnYakin);
        System.out.printf("%s'ten Büyük En Yakın Sayı: %s\n", n, buyukEnYakin);
    }
}

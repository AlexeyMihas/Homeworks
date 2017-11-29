import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        System.out.print("введите длину массива: ");

        int length = arr.nextInt();
        int[] array = new int[length];
        int l;
        for ( l = 0; l < array.length; l++) {
            array[l] = (int)Math.round(rnd.nextInt(array.length));
        }
        Arrays.sort(array);
        for ( l = 0; l < array.length; l++) {
            System.out.println("Числа массива(случайные): " + array[l]);
        }
        System.out.println("min = " + array[0] + "; max = " + array[length - 1]);
        // Eeeeeeeeee))))
    }
}


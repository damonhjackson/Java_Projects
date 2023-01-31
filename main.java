import java.util.Arrays;
import java.util.Date;

public class main {
    public static void main(String[] args) {
       // Arrays, how to define and print old way
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers)); // print array values

        // Array, define and print new way
        int [] numbers2 = {2, 3, 5, 1, 4};

        Arrays.sort(numbers2); // sort array
        System.out.println(numbers.length); // number of items in array
        System.out.println(Arrays.toString(numbers2));

    }
}

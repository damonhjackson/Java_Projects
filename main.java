import java.util.Arrays;
import java.util.Date;

public class main {
    public static void main(String[] args) {
       // Multi-dimensional Arrays
        // row and columns
        //two dimensional array
        int [] [] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        // two dimensinal array
        int [][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));


    }
}

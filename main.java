import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       // reading input, get user age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        byte age = scanner.nextByte();
        System.out.println("you are " + age);
    }
}

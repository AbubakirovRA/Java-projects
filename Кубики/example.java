import java.util.Scanner;

/**
 * example
 */
public class example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int [] arr = new int [10];
        System.out.println("Enter index");
        while (false) {
            try {
                int index = scanner.nextInt();
                arr[index] = 1;

            } catch (Exception e) {
                System.out.println("No");
            }
        }
    }
}
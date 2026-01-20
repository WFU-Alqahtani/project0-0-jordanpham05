import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{0, 1, 2, 3, 4, 5};
            System.out.println("Enter the index of the array to print its content");
            Scanner index = new Scanner(System.in);
            System.out.println(arr[index.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
        catch (InputMismatchException d){
            System.out.println("Exception thrown :" + d);
        }
    }
}
import java.util.Scanner;

public class Tester {

    private static void print(int [] arr, int size) {
        if (size == 0) System.out.println(arr[size]);
        else {
            print(arr, size-1);
            System.out.println(arr[size]);
        }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your desired array size.");
        int size = sc.nextInt();

        int [] arr = new int[size];

        System.out.println("Please enter an integer array" +
                " to print all it's values.");

        for(int i = 0; i < size; i++) arr[i] = sc.nextInt();

        print(arr, size-1);
    }
}

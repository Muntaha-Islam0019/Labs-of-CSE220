import java.util.Scanner;

public class Tester {

    private static int factorial(int n) {
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to figure" +
                " out it's factorial.");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }
}

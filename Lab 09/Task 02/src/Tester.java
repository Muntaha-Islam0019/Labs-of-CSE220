import java.util.Scanner;

public class Tester {

    private static int nthValueOfFibonacci(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;
        else return nthValueOfFibonacci(n-1) + nthValueOfFibonacci(n-2);
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 'n' to get nth position of a fibonacci series.");
        int n = sc.nextInt();

        System.out.println(nthValueOfFibonacci(n));
    }
}

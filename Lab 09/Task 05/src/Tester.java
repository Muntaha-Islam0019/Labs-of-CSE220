import java.util.Scanner;

public class Tester {

    private static int mToThePowerN(int m, int n) {
        if(n == 1) return m;
        else return m * mToThePowerN(m, n-1);
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter m and n.");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("m^n is: " + mToThePowerN(m, n));
    }
}

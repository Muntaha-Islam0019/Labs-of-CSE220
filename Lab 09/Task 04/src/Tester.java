import java.util.Scanner;

public class Tester {

    private static String binaryMaker(int n) {
        if(n == 0) return "0";
        else if(n == 1) return "1";
        else return binaryMaker(n/2) + "" + n%2;
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a decimal number.");
        int n = sc.nextInt();

        System.out.println("The decimal number in binary: " + binaryMaker(n));
    }
}

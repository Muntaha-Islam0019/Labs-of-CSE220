public class Tester {

    private static int fibWithMemoization(int i) {

        int[] arrToStoreFibVal = new int[100];

        if (i <= 1) {
            return i;
        }

        if (arrToStoreFibVal[i] != 0) {
            return arrToStoreFibVal[i];
        } else {
            arrToStoreFibVal[i] = fibWithMemoization(i - 1) + fibWithMemoization(i - 2);
            return arrToStoreFibVal[i];
        }
    }

    public static void main(String[] args) {
        int i = fibWithMemoization(47);
        System.out.println("10th number of fibonacci series: " + i);
    }
}

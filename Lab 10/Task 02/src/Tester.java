import java.util.Arrays;

public class Tester {

    private static void recursiveInsertionSort(int[] arr, int indexCount) {

        if (indexCount <= 1) return;

        recursiveInsertionSort(arr, indexCount - 1);

        int lastValue = arr[indexCount - 1];
        int indexToBeCutIn = indexCount - 2;

        while (indexToBeCutIn >= 0 && arr[indexToBeCutIn] > lastValue) {
            arr[indexToBeCutIn + 1] = arr[indexToBeCutIn];
            indexToBeCutIn--;
        }

        arr[indexToBeCutIn + 1] = lastValue;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 3, 4, 1};

        recursiveInsertionSort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;

public class Tester {

    private static int minValueFinder(int[] arr, int index, int indexCount) {

        if (index == indexCount) return index;

        int minValuesIndexAfterIndex = minValueFinder(arr, index + 1, indexCount);

        return (arr[minValuesIndexAfterIndex] < arr[index]) ? minValuesIndexAfterIndex : index;
    }

    private static void recursiveSelectionSort(int[] arr, int index, int size) {

        if (index == size) return;

        int minValuesIndex = minValueFinder(arr, index, size - 1);

        if (arr[index] != arr[minValuesIndex]) {
            int temp = arr[minValuesIndex];
            arr[minValuesIndex] = arr[index];
            arr[index] = temp;
        }

        recursiveSelectionSort(arr, index + 1, size);
    }

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 4};

        recursiveSelectionSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}

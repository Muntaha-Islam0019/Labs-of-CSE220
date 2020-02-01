import java.util.Arrays;

public class Tester {

    private static int binarySearch(int[] arr, int indexToStart, int indexToEnd, int itemToSearch) {

        if(indexToEnd >= 1) {

            int midValIndex = indexToStart + (indexToEnd-indexToStart)/2;

            if(itemToSearch == arr[midValIndex]) return midValIndex;
            else if(itemToSearch < arr[midValIndex])
                return binarySearch(arr, indexToStart, midValIndex-1, itemToSearch);
            else return binarySearch(arr, midValIndex+1, indexToEnd, itemToSearch);
        }

        return 0;
    }

    public static void main(String [] args) {

        int[] arr = {19, 47, 67, 9, 10, 69, 420};
        Arrays.sort(arr);

        int elementAt = binarySearch(arr, 0, arr.length-1, 9);
        System.out.println("Searched element is " + arr[elementAt] + " which was at index "
                + elementAt + ".");
    }
}

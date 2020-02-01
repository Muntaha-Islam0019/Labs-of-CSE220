public class Tester {

    private static int minValueFinder(LinkedList d, int index, int indexCount) {

        if (index == indexCount) return index;

        int minValuesIndexAfterIndex = minValueFinder(d, index + 1, indexCount);

        return (d.nodeAt(minValuesIndexAfterIndex).element < d.nodeAt(index).element) ? minValuesIndexAfterIndex : index;
    }

    private static void recursiveSelectionSort(LinkedList d, int indexToStartFrom, int size) {

        if (indexToStartFrom == size) return;

        int minValuesIndex = minValueFinder(d, indexToStartFrom, size - 1);

        if (d.nodeAt(indexToStartFrom).element != d.nodeAt(minValuesIndex).element) {
            int temp = d.nodeAt(minValuesIndex).element;
            d.nodeAt(minValuesIndex).element = d.nodeAt(indexToStartFrom).element;
            d.nodeAt(indexToStartFrom).element = temp;
        }

        recursiveSelectionSort(d, indexToStartFrom + 1, size);
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 7, 1, 5, 3, 4, 6};
        LinkedList list = new LinkedList(array);

        recursiveSelectionSort(list, 0, list.countNode());
        list.printList();
    }
}

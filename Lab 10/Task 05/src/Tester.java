public class Tester {

    private static void recursiveInsertionSort(DoublyList d, int indexCount) {

        if (indexCount <= 1) return;

        recursiveInsertionSort(d, indexCount - 1);

        int lastValue = d.nodeAt(indexCount - 1).element;
        int indexToBeCutIn = indexCount - 2;

        while (indexToBeCutIn >= 0 && d.nodeAt(indexToBeCutIn).element > lastValue) {
            d.nodeAt(indexToBeCutIn + 1).element = d.nodeAt(indexToBeCutIn).element;
            indexToBeCutIn--;
        }

        d.nodeAt(indexToBeCutIn + 1).element = lastValue;
    }

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 1, 5, 2, 5, 8, 9};
        DoublyList doubly = new DoublyList(array);

        recursiveInsertionSort(doubly, doubly.countNode());
        doubly.forwardPrint();
    }
}

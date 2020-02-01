public class Tester {

    private static void recursiveBubbleSort(LinkedList l, int i) {

        if (i == 1) return;

        for (int j = 0; j < i - 1; j++)
            if (l.nodeAt(j).element > l.nodeAt(j + 1).element) {
                int temp = l.nodeAt(j + 1).element;
                l.nodeAt(j + 1).element = l.nodeAt(j).element;
                l.nodeAt(j).element = temp;
            }

        recursiveBubbleSort(l, i - 1);
    }

    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2, 8, 17, 0, 9, 3};
        LinkedList list = new LinkedList(array);

        recursiveBubbleSort(list, list.countNode());
        list.printList();
    }
}
